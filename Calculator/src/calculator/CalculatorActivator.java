package calculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import textconversion.TextConversionService;

public class CalculatorActivator implements BundleActivator {

    private CalculatorService calculatorService;
    private TextConversionService textConversionService;
    private CalculatorUI calculatorUI;

    public void start(BundleContext context) throws Exception {
        // Look up the TextConversionService using the OSGi Service Registry
        ServiceReference<TextConversionService> ref = context.getServiceReference(TextConversionService.class);
        textConversionService = context.getService(ref);

        // Initialize the CalculatorService with the TextConversionService
        calculatorService = new CalculatorService();

        // Create and show the CalculatorUI
        calculatorUI = new CalculatorUI(textConversionService, calculatorService);
        calculatorUI.show();
        
        System.out.println("Calculator Service Started.");
    }

    public void stop(BundleContext context) throws Exception {
        // Dispose of the CalculatorUI and unregister the CalculatorService
        calculatorUI.dispose();
        context.ungetService(context.getServiceReference(TextConversionService.class));
        System.out.println("Calculator Service Stopped.");
    }
}