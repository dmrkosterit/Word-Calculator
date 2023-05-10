package calculator;

import java.math.BigInteger;

public class CalculatorService implements CalculatorInterface {

	@Override
	public BigInteger add(BigInteger num1, BigInteger num2) {
		return num1.add(num2);
	}

	@Override
	public BigInteger subtract(BigInteger num1, BigInteger num2) {
		return num1.subtract(num2);
	}

	@Override
	public BigInteger multiply(BigInteger num1, BigInteger num2) {
		return num1.multiply(num2);
	}

	@Override
	public BigInteger divide(BigInteger num1, BigInteger num2) {
		return num1.divide(num2);
	}

}