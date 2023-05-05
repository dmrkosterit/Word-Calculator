package calculator;

import java.math.BigInteger;

public interface CalculatorInterface {
	public enum Operation {
		ADD,
		SUBTRACT,
		DIVIDE,
		MULTIPLY
	}

	public BigInteger add(BigInteger num1, BigInteger num2);

    public BigInteger subtract(BigInteger num1, BigInteger num2);

    public BigInteger multiply(BigInteger num1, BigInteger num2);

    public BigInteger divide(BigInteger num1, BigInteger num2);
}
