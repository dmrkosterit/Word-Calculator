package calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorService implements CalculatorInterface {
    
	@Override
    public BigDecimal add(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

	@Override
    public BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

	@Override
    public BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

	@Override
    public BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2, 2, RoundingMode.HALF_UP).setScale(0, RoundingMode.HALF_UP);
    }


}