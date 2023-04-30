package textconversion;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class TextConversionActivator implements BundleActivator {

    public void start(BundleContext context) {
    	
        context.registerService(TextConversionService.class, new TextConversionService(), null);
        System.out.println("TextConversion Service Started.");
    }

    public void stop(BundleContext context) {
    	
        context.ungetService(context.getServiceReference(TextConversionService.class));
        System.out.println("TextConversion Service Stopped.");
    }
}