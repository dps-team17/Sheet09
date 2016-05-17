package team17.sheet09.client.ws;

import team17.sheet02.CalculationException;
import team17.sheet02.ICalculator;

public class CalculatorWrapper implements ICalculator {

    private RemoteCalculator calculator;

    public CalculatorWrapper() {
        RemoteCalculatorService service = new RemoteCalculatorService();
        calculator = service.getRemoteCalculatorPort();
    }

    @Override
    public int Add(int a, int b) throws CalculationException {
        return calculator.add(a, b);
    }

    @Override
    public int Subtract(int a, int b) throws CalculationException {
        return calculator.subtract(a, b);
    }

    @Override
    public int Multiply(int a, int b) throws CalculationException {
        return calculator.multiply(a, b);
    }

    @Override
    public int Lucas(int a) throws CalculationException {
        return calculator.lucas(a);
    }
}
