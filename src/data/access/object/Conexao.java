package data.access.object;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author joao.oliveira
 */
public class Conexao {

    public Connection conn;
    public Statement stm;

    public Conexao() throws SQLException, ClassNotFoundException {

      //  FileSystemView fs = FileSystemView.getFileSystemView();
        File[] roots = File.listRoots();
        String arquivo = "";
        for (File file : roots) {

            Path path = Paths.get(file + "\\CONTROLE LOCAL DIR_CE\\APPS\\App_Data\\Data\\controleprodutividade.db");
            
            if (Files.exists(path)) {

                arquivo = file + "\\CONTROLE LOCAL DIR_CE\\APPS\\App_Data\\Data\\controleprodutividade.db";

            }

        }
        // System.out.println(file + "  " + fs.getSystemTypeDescription(file));

        Class.forName("org.sqlite.JDBC");
        this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
        this.stm = this.conn.createStatement();

    }

}
