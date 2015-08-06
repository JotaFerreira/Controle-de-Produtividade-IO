package data.access.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author joao.oliveira
 */
public class DAOControlador {

    public void cadastrar_se(model.Controlador Controlador) throws SQLException, ClassNotFoundException {

        data.access.object.Conexao Conexao = new data.access.object.Conexao();
        Conexao.stm.executeUpdate("insert into controladores(nome,mat,username,segmento,senha) values('"
                + Controlador.getNome() + "','" + Controlador.getMatricula() + "','" + Controlador.getUsername()
                + "','" + Controlador.getSegmento() + "','" + Controlador.getSenha() + "')");
        Conexao.stm.close();
        Conexao.conn.close();
        
    }
    
    public String getSegmento(String username) throws SQLException, ClassNotFoundException{
        
        data.access.object.Conexao Conexao = new data.access.object.Conexao();
        data.access.object.DAOUtil Util = new data.access.object.DAOUtil();
        ResultSet var = Conexao.stm.executeQuery("SELECT SEGMENTO AS SEGMENTO FROM CONTROLADORES WHERE USERNAME='" + username + "'");
        List var2 = Util.resultSetToArrayList(var);
        Map obj = (Map) var2.get(0);
        Object objSegmento = obj.get("SEGMENTO");
        
        if(objSegmento != null){
            
            return objSegmento.toString();
            
        }
        else{
            
            return "";
            
        }
          
    }
    
        public String getNome(String username) throws SQLException, ClassNotFoundException{
        
        data.access.object.Conexao Conexao = new data.access.object.Conexao();
        data.access.object.DAOUtil Util = new data.access.object.DAOUtil();
        ResultSet var = Conexao.stm.executeQuery("SELECT NOME AS NOME FROM CONTROLADORES WHERE USERNAME='" + username + "'");
        List var2 = Util.resultSetToArrayList(var);
        Map obj = (Map) var2.get(0);
        Object objNome = obj.get("NOME");
        
        if(objNome != null){
            
            return objNome.toString();
            
        }
        else{
            
            return "";
            
        }
          
    }
   
}
