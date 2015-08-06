package data.access.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joao.oliveira
 */
public class DAOSegmento {

    public List segmentos() throws SQLException, ClassNotFoundException {

        data.access.object.Conexao Conexao = new data.access.object.Conexao();
        data.access.object.DAOUtil Util = new data.access.object.DAOUtil();
        ResultSet rs = Conexao.stm.executeQuery("SELECT SEGMENTO AS SEGMENTO FROM SEGMENTOS ORDER BY 1");
        List var = Util.resultSetToArrayList(rs);
        Conexao.stm.close();
        Conexao.conn.close();
        return var;
    }

}
