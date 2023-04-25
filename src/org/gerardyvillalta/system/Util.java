 
package org.gerardyvillalta.system;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @aut hor Lionar Gerardy Villalta Barrientos.
 */
public class Util {
    
    JFrame frmLogin;
    
     public void abrirLogin() {
        frmLogin = LoginSingleton.getInstance();
        frmLogin.setVisible(true);
        
    }
     
    public void salir() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?",
                "Confirmación de cierre",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    } 
    
    public void Validar(String user, String pass) {
        if ((user.equals(""))&&(!pass.equals(""))) {
            JOptionPane.showMessageDialog(null, "El campo de usuario está vacío",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }else if ((!user.equals(""))&&(pass.equals(""))) {
            JOptionPane.showMessageDialog(null, "El campo de password está vacío",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }else if ((user.equals(""))&&(pass.equals(""))) {
            JOptionPane.showMessageDialog(null, "Antes de continuar debe de ingresar el Usuariio y el Password",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if ((user.equals("root"))&&(pass.equals("admin"))) {
                
                
               // PantallaDeInicio frmInicio = new PantallaDeInicio();   
               JFrame frmInicio = InicioSingleton.getInstance();
                frmInicio.setVisible(true);
                
                frmLogin.dispose();
            }else {
                JOptionPane.showMessageDialog(null, "Acceso denegado",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
