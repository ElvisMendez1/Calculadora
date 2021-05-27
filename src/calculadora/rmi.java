/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/**
 *
 * @author genesis
 */
public class rmi extends UnicastRemoteObject implements calculadora{
    public rmi() throws RemoteException{
        int a, b;
    }
    
    
    public int sum(int a, int b) throws RemoteException{
        return a + b;
    }
    
    public int res(int a, int b)throws RemoteException{
        return a - b;
    }
    
    public int mul(int a , int b)throws RemoteException{
        return a * b;
    }
    
    public int div(int a, int b) throws RemoteException{
        return a / b;
    }
            
}