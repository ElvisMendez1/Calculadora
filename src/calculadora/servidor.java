/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author genesis
 */
public class servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("calculadora", new rmi ());
            JOptionPane.showMessageDialog(null, "Servidor Conectado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Servidor no Conectado"+ e);
        }
        // TODO code application logic here
    }
    
}
