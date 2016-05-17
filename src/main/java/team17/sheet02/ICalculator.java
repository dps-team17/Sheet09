package team17.sheet02;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Represents a simple calculation service
 */
public interface ICalculator extends Remote {

    String SERVICE_NAME = "ICalculator";

    /**
     * Add the two parameters
     *
     * @param a
     * @param b
     * @return the sum of a and b
     * @throws CalculationException
     */
    int Add(int a, int b) throws CalculationException, RemoteException;

    /**
     * Subtracts b from a
     *
     * @param a first number
     * @param b the subtrahend
     * @return a - b
     * @throws CalculationException
     */
    int Subtract(int a, int b) throws CalculationException, RemoteException;

    /**
     * multiplies two numbers
     *
     * @param a the first factor
     * @param b the second factor
     * @return the product of a and b
     * @throws CalculationException
     */
    int Multiply(int a, int b) throws CalculationException, RemoteException;

    /**
     * Calculates the nth lucas number
     *
     * @param a the nth lucas number to calculte
     * @return the nth lucas number
     * @throws CalculationException
     */
    int Lucas(int a) throws CalculationException, RemoteException;
}