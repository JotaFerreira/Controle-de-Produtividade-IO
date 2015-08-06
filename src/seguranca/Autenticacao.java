package seguranca;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author joao.oliveira
 */
public class Autenticacao {

    public boolean autorizado(String username, String senha) throws SQLException, ClassNotFoundException, Exception {

        data.access.object.Conexao Conexao = new data.access.object.Conexao();
        data.access.object.DAOUtil Util = new data.access.object.DAOUtil();
        ResultSet var = Conexao.stm.executeQuery("SELECT SENHA AS SENHA FROM CONTROLADORES WHERE USERNAME='" + username + "'");
        List var2 = Util.resultSetToArrayList(var);

        if (var2.isEmpty()) {

            return false;

        }

        Map obj = (Map) var2.get(0);
        Object objSenha = obj.get("SENHA");

        if (objSenha == null | objSenha.toString().equals("") | objSenha.toString().length() == 0) {

            return false;

        } else {
            String encriptSenha = objSenha.toString();
            if (Cypher.encrypt(senha).equals(encriptSenha)) {

                return true;

            } else {

                return false;

            }

        }

    }

}
