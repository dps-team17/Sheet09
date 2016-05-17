package team17.sheet09.client;

import team17.sheet02.Calculator;
import team17.sheet02.ICalculator;
import team17.sheet02.RemoteCalculatorClient;
import team17.sheet05.RmiCalculator;
import team17.sheet09.client.ws.CalculatorWrapper;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Demo3 {

    private static int n = 100;
    private static ICalculator calculator;

    public static void main(String[] args) throws RemoteException, NotBoundException {

        System.out.println("Time analysis for different remote calculation method's:");

        System.out.println("\nSocket based implementation:");
        calculator = new RemoteCalculatorClient("127.0.0.1", "Daniel");
        runTest();

        System.out.println("\nRMI based implementation:");
        calculator = new RmiCalculator();
        runTest();

        System.out.println("\nWeb service based implementation:");
        calculator = new CalculatorWrapper();
        runTest();

        System.out.println("\nDirect invocation:");
        calculator = new Calculator();
        runTest();
    }

    private static void runTest() throws RemoteException {

        Stopwatch stopwatch = new Stopwatch();
        long timeUsed = 0;

        stopwatch.Start();
        for (int i = 0; i < n; i++) {
            calculator.Add(1, 1);
        }
        stopwatch.Stop();

        System.out.printf("Average calculation (%d iterations) took %.4f ms\n", n, stopwatch.getMillis() / n);
    }
}
