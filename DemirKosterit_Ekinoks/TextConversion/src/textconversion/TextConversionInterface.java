package textconversion;

import java.math.BigInteger;
import java.util.Locale;

public interface TextConversionInterface {
	BigInteger convertTextToNumber(String text);

	String convertNumberToText(BigInteger number);

	void setLocale(Locale locale);
}
