
package team17.sheet05;

import team17.sheet02.Calculator;
import team17.sheet02.ICalculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

class RmiServer {

    public static void main(String args[]) {

        //Create Security manager
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            // Create calculator stub
            ICalculator calculator = new Calculator();
            ICalculator calculatorStub = (ICalculator) UnicastRemoteObject.exportObject(calculator, 0);

            // Bind stubs in the registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind(ICalculator.SERVICE_NAME, calculatorStub);

            System.out.println("RMI SocketServer ready");

        } catch (Exception e) {
            System.err.println("SocketServer exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
