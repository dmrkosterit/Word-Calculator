package calculator;

import javax.swing.*;

import textconversion.TextConversionInterface;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.Locale;

public class CalculatorUI extends JFrame {

	private TextConversionInterface textConversionService;
	private CalculatorInterface calculatorService;

	private JTextField inputField1;
	private JTextField inputField2;
	private JTextField resultField;
	private JButton addButton;
	private JButton subtractButton;
	private JButton multiplyButton;
	private JButton divideButton;

	public CalculatorUI(TextConversionInterface textConversionService, CalculatorInterface calculatorService) {
		this.textConversionService = textConversionService;
		this.calculatorService = calculatorService;

		addButton = new JButton();
		subtractButton = new JButton();
		multiplyButton = new JButton();
		divideButton = new JButton();

		inputField1 = new JTextField(10);
		inputField2 = new JTextField(10);
		resultField = new JTextField(10);
		//resultField.setEditable(false); // make the result field read-only

		Locale locale = Locale.getDefault();

		// Locale locale = new Locale("tr", "TR");

		if (locale.getLanguage().equals("tr")) {
			// update the button and label texts to Turkish
			addButton.setText("Topla");
			subtractButton.setText("Çıkar");
			multiplyButton.setText("Çarp");
			divideButton.setText("Böl");

			inputField1.setToolTipText("Sayı 1");
			inputField2.setToolTipText("Sayı 2");
			resultField.setToolTipText("Sonuç");
		} else {
			addButton.setText("Add");
			subtractButton.setText("Subtract");
			multiplyButton.setText("Multiply");
			divideButton.setText("Divide");

			inputField1.setToolTipText("Input 1");
			inputField2.setToolTipText("Input 2");
			resultField.setToolTipText("Result");
		}

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performArithmeticOperation(CalculatorInterface.Operation.ADD);
			}
		});
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performArithmeticOperation(CalculatorInterface.Operation.SUBTRACT);
			}
		});
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performArithmeticOperation(CalculatorInterface.Operation.MULTIPLY);
			}
		});
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performArithmeticOperation(CalculatorInterface.Operation.DIVIDE);
			}
		});

		// create the UI layout
		JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
		inputPanel.add(new JLabel(inputField1.getToolTipText() + ":"));
		inputPanel.add(inputField1);
		inputPanel.add(new JLabel(inputField2.getToolTipText() + ":"));
		inputPanel.add(inputField2);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
		buttonPanel.add(addButton);
		buttonPanel.add(subtractButton);
		buttonPanel.add(multiplyButton);
		buttonPanel.add(divideButton);

		JPanel resultPanel = new JPanel(new GridLayout(1, 2, 10, 10));
		resultPanel.add(new JLabel(resultField.getToolTipText() + ":"));
		resultPanel.add(resultField);

		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel.add(inputPanel, BorderLayout.NORTH);
		mainPanel.add(buttonPanel, BorderLayout.CENTER);
		mainPanel.add(resultPanel, BorderLayout.SOUTH);

		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mainPanel);
		pack();
		setLocationRelativeTo(null);
	}

	private void performArithmeticOperation(CalculatorInterface.Operation operation) {

		String input1 = inputField1.getText();
		String input2 = inputField2.getText();
		String resultText = "";

		BigDecimal value1 = textConversionService.convertTextToNumber(input1);
		BigDecimal value2 = textConversionService.convertTextToNumber(input2);

		BigDecimal result = BigDecimal.ZERO;

		if (!input1.matches("^[\\p{L}\\p{Z}öçğıüşÖÇĞİÜŞ]+$") || !input2.matches("^[\\p{L}\\p{Z}öçğıüşÖÇĞİÜŞ]+$")) {
			resultText = "ERROR: Invalid character in input(s).";
		} else if (input2.equalsIgnoreCase("zero")) {
			resultText = "ERROR: Cannot divide by zero.";
		}
		else if(value1 == null || value2 == null){
				resultText = "ERROR: Invalid word(s) in input.";
			}
		else {
			switch (operation) {
			case ADD:
				result = calculatorService.add(value1, value2);
				System.out.print(value1 + " + " + value2 + " = " + result + "\n");
				break;
			case SUBTRACT:
				result = calculatorService.subtract(value1, value2);
				System.out.print(value1 + " - " + value2 + " = " + result + "\n");
				break;
			case MULTIPLY:
				result = calculatorService.multiply(value1, value2);
				System.out.print(value1 + " * " + value2 + " = " + result + "\n");
				break;
			case DIVIDE:
				if (value2.equals(BigDecimal.ZERO))
					result = null;
				else {
					result = calculatorService.divide(value1, value2);
					System.out.print(value1 + " / " + value2 + " = " + result + "\n");
				}
				break;

			}
			resultText = textConversionService.convertNumberToText(result);
		}

		// convert the result to words

		resultField.setText(resultText);
	}
}