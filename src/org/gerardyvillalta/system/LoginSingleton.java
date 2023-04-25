
package org.gerardyvillalta.system;

import javax.swing.JFrame;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos
 */
public class LoginSingleton {
    private static JFrame instanciaLogin;
    
    private LoginSingleton() {     
    }
    
    public static JFrame getInstance() {
        if (instanciaLogin == null) {
            instanciaLogin = new FRMLogin();
        }
        return instanciaLogin;
    }
    
    
}
