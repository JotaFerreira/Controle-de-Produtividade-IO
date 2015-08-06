package data.access.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joao.oliveira
 */
public class DAOAtividades {
    
    public List atividadesPorSegmento(String segmento) throws SQLException, ClassNotFoundException{
        
        DAOUtil Util = new DAOUtil();
        Conexao Conexao = new Conexao();
        ResultSet var = Conexao.stm.executeQuery("SELECT ATIVIDADE AS ATIVIDADE FROM TIPO_ATIVIDADES WHERE SEGMENTO IS NULL OR SEGMENTO='" 
                + segmento + "' ORDER BY 1");
        List atividades = Util.resultSetToArrayList(var);
        Conexao.stm.close();    
        Conexao.conn.close();
        return atividades;
      
    }
    
}
