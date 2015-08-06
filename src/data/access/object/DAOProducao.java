package data.access.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author joao.oliveira
 */
public class DAOProducao {

    public void registrarProducao(model.Producao Producao) throws SQLException, ClassNotFoundException{
        
        data.access.object.Conexao Conexao = new data.access.object.Conexao();
        Conexao.stm.executeUpdate("INSERT INTO DADOSCONTROLE(CONTROLADOR,DATA_ENTRADA,UF,GRA,SEGMENTO,TRATAMENTO,ATIVIDADE,"
                + "TECNICO,MATERIAL_APLICADO,LOC_CIR_TER,USERNAME,DECODER) VALUES('" 
                + Producao.getControlador() + "','" + Producao.getDataEntrada() + "','" + Producao.getUf() + "','" + Producao.getGra()
                + "','" + Producao.getSegmento() + "','" + Producao.getTratamento() + "','" + Producao.getAtividade() + "','" 
                + Producao.getTecnico()+ "','" + Producao.getMaterialAplicado() + "','" + Producao.getLocCirTer()
                + "','" + Producao.getUsername() + "','" + Producao.getDecoder() + "')");
        Conexao.stm.close();
        Conexao.conn.close();
        
    }
    
    public List getProducaoPorUsuario(String user) throws SQLException, ClassNotFoundException {

        String d = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        DAOUtil Util = new DAOUtil();
        Conexao Conexao = new Conexao();
        ResultSet var = Conexao.stm.executeQuery("SELECT A.UF, A.GRA, A.SEGMENTO, A.TRATAMENTO, A.ATIVIDADE, "
                + "B.NOME AS TECNICO, A.MATERIAL_APLICADO, A.LOC_CIR_TER, A.DECODER FROM DADOSCONTROLE AS A, "
                + "TECNICOS AS B WHERE A.TECNICO = B.MAT AND DATE(DATA_ENTRADA) ='" + d
                + "' AND USERNAME='" + user + "' ORDER BY 2");
        List producao = Util.resultSetToArrayList(var);
        Conexao.stm.close();
        Conexao.conn.close();
        return producao;

    }

}
