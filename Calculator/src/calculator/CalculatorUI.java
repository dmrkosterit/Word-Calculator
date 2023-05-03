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

	private JComboBox<String> languageComboBox;
	
	private JTextField inputField1;
	private JTextField inputField2;
	private JTextField resultField;
	
	private JLabel inputLabel1;
	private JLabel inputLabel2;
	private JLabel resultLabel;
	
	private JButton addButton;
	private JButton subtractButton;
	private JButton multiplyButton;
	private JButton divideButton;
	
	
	

	public CalculatorUI(TextConversionInterface textConversionService, CalculatorInterface calculatorService) {
		this.textConversionService = textConversionService;
		this.calculatorService = calculatorService;

		String[] languages = { "English", "Turkish" };
		languageComboBox = new JComboBox<>(languages);
		
		addButton = new JButton();
		subtractButton = new JButton();
		multiplyButton = new JButton();
		divideButton = new JButton();

		inputField1 = new JTextField(10);
		inputField2 = new JTextField(10);
		resultField = new JTextField(10);
		
		inputLabel1 = new JLabel("");
		inputLabel2 = new JLabel("");
		resultLabel = new JLabel("");
		
		resultField.setEditable(false); // make the result field read-only


		

		

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
		
		languageComboBox.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			        String selectedLanguage = (String) languageComboBox.getSelectedItem();

			        // Call the updateUI method to update the user interface based on the selected language
			        updateLocale(selectedLanguage);
			    }
		});
		
		updateLocale("English");

		// create the UI layout
		JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
		inputPanel.add(new JLabel(""));
		inputPanel.add(languageComboBox);
		inputPanel.add(inputLabel1);
		inputPanel.add(inputField1);
		inputPanel.add(inputLabel2);
		inputPanel.add(inputField2);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
		buttonPanel.add(addButton);
		buttonPanel.add(subtractButton);
		buttonPanel.add(multiplyButton);
		buttonPanel.add(divideButton);

		JPanel resultPanel = new JPanel(new GridLayout(2, 1, 10, 10));
		resultPanel.add(resultLabel);
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
	
    private void updateLocale(String language) {
        // Update the default locale based on the selected language
        Locale locale = null;
        if (language.equals("Turkish")) {
            locale = new Locale("tr", "TR");
            addButton.setText("Topla");
			subtractButton.setText("Çıkar");
			multiplyButton.setText("Çarp");
			divideButton.setText("Böl");

			languageComboBox.setToolTipText("Dil");
			inputLabel1.setText("Sayı 1");
			inputLabel2.setText("Sayı 2");
			resultLabel.setText("Sonuç");

			setTitle("Hesap Makinesi");
        } else {
            locale = Locale.ENGLISH;
            addButton.setText("Add");
			subtractButton.setText("Subtract");
			multiplyButton.setText("Multiply");
			divideButton.setText("Divide");

			inputLabel1.setText("Input 1");
			inputLabel2.setText("Input 2");
			resultLabel.setText("Result");
			
			setTitle("Calculator");
        }
        inputField1.setText("");
        inputField2.setText("");
        resultField.setText("");
        
        Locale.setDefault(locale);        
        textConversionService.setLocale(locale);
        
    }

	private void performArithmeticOperation(CalculatorInterface.Operation operation) {

		String input1 = inputField1.getText();
		String input2 = inputField2.getText();
		String resultText = "";

		BigDecimal value1 = textConversionService.convertTextToNumber(input1);
		BigDecimal value2 = textConversionService.convertTextToNumber(input2);

		BigDecimal result = BigDecimal.ZERO;

		if(input1.equals("") || input1.equals("")) {
			resultText = "ERROR: Empty input(s).";
		} else if (!input1.matches("^[\\p{L}\\p{Z}öçğıüşÖÇĞİÜŞ]+$") || !input2.matches("^[\\p{L}\\p{Z}öçğıüşÖÇĞİÜŞ]+$")) {
			resultText = "ERROR: Invalid character in input(s).";
		} else if ((input2.equalsIgnoreCase("zero") || input2.equalsIgnoreCase("sıfır")) && operation == CalculatorInterface.Operation.DIVIDE) {
			resultText = "ERROR: Cannot divide by zero.";
		} else if (value1 == null || value2 == null) {
			resultText = "ERROR: Invalid format/word(s) in input.";
		} else {
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