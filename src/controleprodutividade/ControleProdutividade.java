package controleprodutividade;

import janelas.FormLogin;

/**
 *
 * @author joao.oliveira
 */
public class ControleProdutividade {

    public static void main(String[] args) {
    
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                        
        janelas.FormLogin frm = new janelas.FormLogin();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
            }
        });
    }
   
    }
    

