package calculator;

import java.math.BigDecimal;

public interface CalculatorInterface {
	public enum Operation {
		ADD,
		SUBTRACT,
		DIVIDE,
		MULTIPLY
	}

	public BigDecimal add(BigDecimal num1, BigDecimal num2);

    public BigDecimal subtract(BigDecimal num1, BigDecimal num2);

    public BigDecimal multiply(BigDecimal num1, BigDecimal num2);

    public BigDecimal divide(BigDecimal num1, BigDecimal num2);
}
