package calculator;

import javax.swing.*;

import textconversion.TextConversionInterface;

import java.awt.*;
import java.awt.event.*;
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

        // create the UI components
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // make the result field read-only
        
        
        // get the default locale
        Locale locale = Locale.getDefault();
        
        // check if the locale is Turkish
        if (locale.getLanguage().equals("tr")) {
            // update the button and label texts to Turkish
            addButton.setText("Topla");
            subtractButton.setText("Çıkar");
            multiplyButton.setText("Çarp");
            divideButton.setText("Böl");
            
            inputField1.setToolTipText("Sayı 1");
            inputField2.setToolTipText("Sayı 2");
            resultField.setToolTipText("Sonuç");
        }
        else {
        	addButton.setText("Add");
            subtractButton.setText("Subtract");
            multiplyButton.setText("Multiply");
            divideButton.setText("Divide");
            
            inputField1.setToolTipText("Input 1");
            inputField2.setToolTipText("Input 2");
            resultField.setToolTipText("Result");
        }

       

        
        // add action listeners to the buttons
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

        // set the frame properties
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void performArithmeticOperation(CalculatorInterface.Operation operation) {
        // get the input values as words
        String input1 = inputField1.getText();
        String input2 = inputField2.getText();

        // convert the input values to integers
        int value1 = textConversionService.convertTextToNumber(input1);
        int value2 = textConversionService.convertTextToNumber(input2);

        
        // perform the arithmetic operation
        int result = 0;
        switch (operation) {
            case ADD:
            	System.out.print(value1 + " + " + value2 + "\n");
            	result = calculatorService.add(value1, value2);
                break;
            case SUBTRACT:
            	System.out.print(value1 + " - " + value2 + "\n");
                result = calculatorService.subtract(value1, value2);
                break;
            case MULTIPLY:
            	System.out.print(value1 + " X " + value2 + "\n");
                result = calculatorService.multiply(value1, value2);
                break;
            case DIVIDE:
            	System.out.print(value1 + " / " + value2 + "\n");
                result = calculatorService.divide(value1, value2);
                break;
        }

        // convert the result to words
        String resultText = textConversionService.convertNumberToText(result);

        // display the result
        resultField.setText(resultText);
    }
}