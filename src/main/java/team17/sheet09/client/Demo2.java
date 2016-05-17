package team17.sheet09.client;

import team17.sheet02.ICalculator;
import team17.sheet09.client.ws.CalculatorWrapper;

import java.rmi.RemoteException;
import java.util.Date;


public class Demo2 {

    public static void main(String[] args) throws RemoteException {

        Stopwatch stopwatch = new Stopwatch();
        ICalculator calculator = new CalculatorWrapper();
        int a = 45;

        System.out.printf("started long running calculation via web services... \t(Started:  %tT)\n", new Date());

        stopwatch.Start();
        int result = calculator.Lucas(a);
        stopwatch.Stop();

        System.out.printf("The %dth lucas number is %d (took %,4.2f ms) (Finished: %tT)\n", a, result, stopwatch.getMillis(), new Date());
    }
}
