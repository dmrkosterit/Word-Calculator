package textconversion;

import java.math.BigDecimal;
import java.util.Locale;

public interface TextConversionInterface {
    BigDecimal convertTextToNumber(String text);
    String convertNumberToText(BigDecimal number);
    void setLocale(Locale locale);
}
