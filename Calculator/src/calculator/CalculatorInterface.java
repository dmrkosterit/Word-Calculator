package calculator;

public interface CalculatorInterface {
	public enum Operation {
		ADD,
		SUBTRACT,
		DIVIDE,
		MULTIPLY
	}


	public int add(int num1, int num2);

    public int subtract(int num1, int num2);

    public int multiply(int num1, int num2);

    public int divide(int num1, int num2);
}
