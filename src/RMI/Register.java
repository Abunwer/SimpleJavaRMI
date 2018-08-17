package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Register extends Remote {
    String getFirstName()throws RemoteException;
    void setFirstName(String firstName)throws RemoteException;
    String getLastName() throws RemoteException;
    void setLastName(String lastName)throws RemoteException;
    int getAge()throws RemoteException;
    void setAge(int age)throws RemoteException;
}