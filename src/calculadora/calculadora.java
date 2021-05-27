/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author genesis
 */
public interface calculadora extends Remote {
    public int div (int a, int b)throws RemoteException;
    public int mul (int a, int b)throws RemoteException;
    public int res (int a, int b)throws RemoteException;
    public int sum (int a, int b)throws RemoteException;
}
