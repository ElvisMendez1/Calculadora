/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author genesis
 */
public class cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
            calculadora c = (calculadora) Naming.lookup("//localhost/calculadora");
            
            while (true) {
                String menu = JOptionPane.showInputDialog(" Ejercicio calculadora \n" +
                        "suma ....(1) \n" +
                        "Resta ....(2) \n" +
                        "Multiplicacion....(3) \n" +
                        "Division... (4) \n\n" +
                        "Cancelar para salir");
                switch (menu){
                    case "1":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito: "));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo digito: "));
                        JOptionPane.showMessageDialog(null, "La suma es: " +c.sum(x,y));
                        break;
                    }
                    case "2":
                    {
                     int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito: "));
                     int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo digito: "));
                        JOptionPane.showMessageDialog(null, "La resta es: " +c.res(x,y));
                        break;   
                    }
                    case"3":
                    {
                    int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito: "));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo digito: "));
                        JOptionPane.showMessageDialog(null, "La multipicacion  es: " +c.mul(x,y));
                        break;
                     }
                    case "4":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito: "));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo digito: "));
                        if (y != 0)
                        JOptionPane.showMessageDialog(null, "La divicion es: " +c.div(x,y));
                        else
                            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0 ");
                        break;
                    }
                }
               
            }
        }catch(Exception e){
            JOptionPane.showInputDialog("Servidor no conectado" + e);
        }
        // TODO code application logic here
    }
    
}
