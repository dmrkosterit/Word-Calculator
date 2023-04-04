package textconversion;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class TextConversionActivator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        // Register the TextConversionService with the OSGi Service Registry
        context.registerService(TextConversionService.class, new TextConversionService(), null);
        System.out.println("TextConversion Service Stopped.");
    }

    public void stop(BundleContext context) throws Exception {
        // Unregister the TextConversionService from the OSGi Service Registry
        context.ungetService(context.getServiceReference(TextConversionService.class));
        System.out.println("TextConversion Service Stopped.");
    }
}