package data.access.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joao.oliveira
 */
public class DAOTratamentos {
    
        public List getTratamentos() throws SQLException, ClassNotFoundException{
        
        DAOUtil Util = new DAOUtil();
        Conexao Conexao = new Conexao();
        ResultSet var = Conexao.stm.executeQuery("SELECT TRATAMENTO AS TRATAMENTO FROM TIPO_TRATAMENTOS ORDER BY 1");
        List tratamentos = Util.resultSetToArrayList(var);
        Conexao.stm.close();    
        Conexao.conn.close();
        return tratamentos;
      
    }
    
}
