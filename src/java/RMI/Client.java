package java.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry();
            Register stub = (Register) registry.lookup("PersonInfo");

            if(args.length>0){

                stub.setFirstName(args[0]);
                stub.setLastName(args[1]);
                stub.setAge(Integer.parseInt(args[2]));
                System.out.println("First Name : " + stub.getFirstName());
                System.out.println("Last Name : " +stub.getLastName() );
                System.out.println("Age : " +stub.getAge());

            }else{
                System.out.println("First Name : " + stub.getFirstName());
                System.out.println("Last Name : " +stub.getLastName() );
                System.out.println("Age : " +stub.getAge());
            }


        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
