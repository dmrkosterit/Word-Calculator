package calculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import textconversion.TextConversionService;

public class CalculatorActivator implements BundleActivator {

	private CalculatorService calculatorService;
	private TextConversionService textConversionService;
	private CalculatorUI calculatorUI;

	public void start(BundleContext context) {

		ServiceReference<TextConversionService> ref = context.getServiceReference(TextConversionService.class);
		textConversionService = context.getService(ref);

		calculatorService = new CalculatorService();

		calculatorUI = new CalculatorUI(textConversionService, calculatorService);
		calculatorUI.setVisible(true);

		System.out.println("Calculator Service Started.");
	}

	public void stop(BundleContext context) {
		calculatorUI.dispose();
		context.ungetService(context.getServiceReference(TextConversionService.class));
		System.out.println("Calculator Service Stopped.");
	}
}