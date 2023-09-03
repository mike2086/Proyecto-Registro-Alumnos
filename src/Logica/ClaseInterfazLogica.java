
package Logica;

import IGU.Principal;


public class ClaseInterfazLogica {

    
    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Principal principal = new Principal(control);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }
    
    
}
