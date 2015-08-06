package data.access.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joao.oliveira
 */
public class DAOTecnico {
    
    public List tecnicosPorSegmentoEUF(String segmento,String uf) throws SQLException, ClassNotFoundException{
        
        DAOUtil Util = new DAOUtil();
        Conexao Conexao = new Conexao();
        ResultSet var = Conexao.stm.executeQuery("SELECT NOME || \"-\" || MAT || \"-\" || SUBSTR(CARGO,1,3) AS "
                + "TECNICO FROM TECNICOS WHERE SEGMENTO='" + segmento + "' and uf='" + uf + "' ORDER BY 1");
        List tecnicos = Util.resultSetToArrayList(var);
        Conexao.stm.close();
        Conexao.conn.close();
        return tecnicos;
        
    }
    
    
}
