package team17.sheet05;

import team17.sheet02.CalculationException;
import team17.sheet02.ICalculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiCalculator implements ICalculator {

    private final ICalculator calculator;

    public RmiCalculator() throws RemoteException, NotBoundException {

        Registry registry = LocateRegistry.getRegistry(null);
        calculator = (ICalculator) registry.lookup(ICalculator.SERVICE_NAME);
    }

    @Override
    public int Add(int a, int b) throws CalculationException, RemoteException {
        return calculator.Add(a, b);
    }

    @Override
    public int Subtract(int a, int b) throws CalculationException, RemoteException {
        return calculator.Subtract(a, b);
    }

    @Override
    public int Multiply(int a, int b) throws CalculationException, RemoteException {
        return calculator.Multiply(a, b);
    }

    @Override
    public int Lucas(int a) throws CalculationException, RemoteException {
        return calculator.Lucas(a);
    }
}
