package team17.sheet02;

public class Calculator implements ICalculator {

    @Override
    public int Add(int a, int b) {
        return a + b;
    }

    @Override
    public int Subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int Multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int Lucas(int a) {
        return LukasRecursive(a);
    }

    /**
     * Calculates the ath lucas number recursive
     *
     * @param a the number to calculate from
     * @return the ath lucas number
     */
    public int LukasRecursive(int a) {

        if (a < 0) {
            throw new IllegalArgumentException("Can not calculate lukas number of negative values");
        } else if (a == 0) {
            return 2;
        } else if (a == 1) {
            return 1;
        } else {
            return LukasRecursive(a - 1) + LukasRecursive(a - 2);
        }
    }

    /**
     * Calculates the ath lucas number iterative
     *
     * @param a the number to calculate from
     * @return the ath lucas number
     */
    public int LukasIterative(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Can not calculate lukas number of negative values");
        } else if (a == 0) {
            return 2;
        } else if (a == 1) {
            return 1;
        } else {

            int x = 2;
            int y = 1;
            int z = 0;

            for (int i = a - 1; i > 0; i--) {
                z = x + y;
                x = y;
                y = z;
            }
            return z;
        }
    }
}