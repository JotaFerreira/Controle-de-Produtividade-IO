package data.access.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joao.oliveira
 */
public class DAOGra {
    
    public List getGrasPorUF(String uf) throws SQLException, ClassNotFoundException{
        
        DAOUtil Util = new DAOUtil();
        Conexao Conexao = new Conexao();
        ResultSet var = Conexao.stm.executeQuery("SELECT GRA AS GRA FROM GRAS WHERE UF='" + uf + "' ORDER BY 1");
        List gras = Util.resultSetToArrayList(var);
        Conexao.stm.close();    
        Conexao.conn.close();
        return gras;
        
    }
    
    
}
