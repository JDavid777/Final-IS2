/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.*;

/**
 *
 * @author dawish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
         GUILogin login = new GUILogin();
         login.setLocationRelativeTo(null);
         login.setVisible(true);
   
        
    }
    
}
