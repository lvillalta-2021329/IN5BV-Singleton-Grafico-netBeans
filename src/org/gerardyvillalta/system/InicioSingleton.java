
package org.gerardyvillalta.system;

import javax.swing.JFrame;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos
 */
public class InicioSingleton {
    
    private static JFrame instancia;
    
    private InicioSingleton() { 
    }
    
    public static JFrame getInstance() {
        if (instancia == null) {
            instancia = new PantallaDeInicio();
        }
        return instancia;
    }
}
