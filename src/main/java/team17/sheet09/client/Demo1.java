package team17.sheet09.client;

import team17.sheet02.ICalculator;
import team17.sheet09.client.ws.CalculatorWrapper;

import java.rmi.RemoteException;
import java.util.Date;


public class Demo1 {

    public static void main(String[] args) throws RemoteException {

        ICalculator calculator = new CalculatorWrapper();
        Stopwatch stopwatch = new Stopwatch();

        int a = 1;
        int b = 2;

        System.out.printf("Calculation via web services: \t(Started:  %tT) \n", new Date());

        stopwatch.Start();
        int result = calculator.Add(a, b);
        stopwatch.Stop();

        System.out.printf("%d + %d = %d (took %.2f ms) \t\t(Finished: %tT)\n", a, b, result, stopwatch.getMillis(), new Date());
    }
}
