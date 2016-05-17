package team17.sheet09.server;

import team17.sheet02.CalculationException;
import team17.sheet02.Calculator;
import team17.sheet02.ICalculator;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.rmi.RemoteException;

@WebService()
public class RemoteCalculator implements ICalculator {

    private final ICalculator calculator;

    public RemoteCalculator() {
        this.calculator = new Calculator();
    }

    public static void main(String[] argv) {
        Object implementor = new RemoteCalculator();
        String address = "http://localhost:9000/Calculator";
        Endpoint.publish(address, implementor);
    }

    @WebMethod
    @Override
    public int Add(int a, int b) throws CalculationException, RemoteException {
        return calculator.Add(a, b);
    }

    @WebMethod
    @Override
    public int Subtract(int a, int b) throws CalculationException, RemoteException {
        return calculator.Subtract(a, b);
    }

    @WebMethod
    @Override
    public int Multiply(int a, int b) throws CalculationException, RemoteException {
        return calculator.Multiply(a, b);
    }

    @WebMethod
    @Override
    public int Lucas(int a) throws CalculationException, RemoteException {
        return calculator.Lucas(a);
    }
}