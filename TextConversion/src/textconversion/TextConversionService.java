package textconversion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Locale;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class TextConversionService implements TextConversionInterface {

	HashMap<String, BigDecimal> wordNumbers = new HashMap<String, BigDecimal>();
	HashMap<Double, String> numberWords = new HashMap<Double, String>();

	public TextConversionService() {

		setLocale(Locale.getDefault());

	}

	public void setLocale(Locale locale) {
		Locale.setDefault(locale);

		if (Locale.getDefault().getLanguage().equals("tr")) {

			wordNumbers.put("sıfır", BigDecimal.valueOf(0.0));
			wordNumbers.put("bir", BigDecimal.valueOf(1.0));
			wordNumbers.put("iki", BigDecimal.valueOf(2.0));
			wordNumbers.put("üç", BigDecimal.valueOf(3.0));
			wordNumbers.put("dört", BigDecimal.valueOf(4.0));
			wordNumbers.put("beş", BigDecimal.valueOf(5.0));
			wordNumbers.put("altı", BigDecimal.valueOf(6.0));
			wordNumbers.put("yedi", BigDecimal.valueOf(7.0));
			wordNumbers.put("sekiz", BigDecimal.valueOf(8.0));
			wordNumbers.put("dokuz", BigDecimal.valueOf(9.0));
			wordNumbers.put("on", BigDecimal.valueOf(10.0));
			wordNumbers.put("yirmi", BigDecimal.valueOf(20.0));
			wordNumbers.put("otuz", BigDecimal.valueOf(30.0));
			wordNumbers.put("kırk", BigDecimal.valueOf(40.0));
			wordNumbers.put("elli", BigDecimal.valueOf(50.0));
			wordNumbers.put("altmış", BigDecimal.valueOf(60.0));
			wordNumbers.put("yetmiş", BigDecimal.valueOf(70.0));
			wordNumbers.put("seksen", BigDecimal.valueOf(80.0));
			wordNumbers.put("doksan", BigDecimal.valueOf(90.0));
			wordNumbers.put("yüz", BigDecimal.valueOf(Math.pow(10, 2)));
			wordNumbers.put("bin", BigDecimal.valueOf(Math.pow(10, 3)));
			wordNumbers.put("milyon", BigDecimal.valueOf(Math.pow(10, 6)));
			wordNumbers.put("milyar", BigDecimal.valueOf(Math.pow(10, 9)));
			wordNumbers.put("trilyon", BigDecimal.valueOf(Math.pow(10, 12)));
			wordNumbers.put("katrilyon", BigDecimal.valueOf(Math.pow(10, 15)));
			wordNumbers.put("kentilyon", BigDecimal.valueOf(Math.pow(10, 18)));
			wordNumbers.put("sekstilyon", BigDecimal.valueOf(Math.pow(10, 21)));
			wordNumbers.put("septilyon", BigDecimal.valueOf(Math.pow(10, 24)));
			wordNumbers.put("oktilyon", BigDecimal.valueOf(Math.pow(10, 27)));
			wordNumbers.put("nonilyon", BigDecimal.valueOf(Math.pow(10, 30)));
			wordNumbers.put("desilyon", BigDecimal.valueOf(Math.pow(10, 33)));
			wordNumbers.put("undesilyon", BigDecimal.valueOf(Math.pow(10, 36)));
			wordNumbers.put("dodesilyon", BigDecimal.valueOf(Math.pow(10, 39)));
			wordNumbers.put("tredesilyon", BigDecimal.valueOf(Math.pow(10, 42)));
			wordNumbers.put("katordesilyon", BigDecimal.valueOf(Math.pow(10, 45)));
			wordNumbers.put("kendesilyon", BigDecimal.valueOf(Math.pow(10, 48)));
			wordNumbers.put("seksdesilyon", BigDecimal.valueOf(Math.pow(10, 51)));
			wordNumbers.put("septendesilyon", BigDecimal.valueOf(Math.pow(10, 54)));
			wordNumbers.put("oktodesilyon", BigDecimal.valueOf(Math.pow(10, 57)));
			wordNumbers.put("novemdesilyon", BigDecimal.valueOf(Math.pow(10, 60)));
			wordNumbers.put("vigintilyon", BigDecimal.valueOf(Math.pow(10, 63)));

			numberWords.put(0.0, "sıfır");
			numberWords.put(1.0, "bir");
			numberWords.put(2.0, "iki");
			numberWords.put(3.0, "üç");
			numberWords.put(4.0, "dört");
			numberWords.put(5.0, "beş");
			numberWords.put(6.0, "altı");
			numberWords.put(7.0, "yedi");
			numberWords.put(8.0, "sekiz");
			numberWords.put(9.0, "dokuz");
			numberWords.put(10.0, "on");
			numberWords.put(20.0, "yirmi");
			numberWords.put(30.0, "otuz");
			numberWords.put(40.0, "kırk");
			numberWords.put(50.0, "elli");
			numberWords.put(60.0, "altmış");
			numberWords.put(70.0, "yetmiş");
			numberWords.put(80.0, "seksen");
			numberWords.put(90.0, "doksan");
			numberWords.put(Math.pow(10, 2), "yüz");
			numberWords.put(Math.pow(10, 3), "bin");
			numberWords.put(Math.pow(10, 6), "milyon");
			numberWords.put(Math.pow(10, 9), "milyar");
			numberWords.put(Math.pow(10, 12), "trilyon");
			numberWords.put(Math.pow(10, 15), "katrilyon");
			numberWords.put(Math.pow(10, 18), "kentilyon");
			numberWords.put(Math.pow(10, 21), "sekstilyon");
			numberWords.put(Math.pow(10, 24), "septilyon");
			numberWords.put(Math.pow(10, 27), "oktilyon");
			numberWords.put(Math.pow(10, 30), "nonilyon");
			numberWords.put(Math.pow(10, 33), "desilyon");
			numberWords.put(Math.pow(10, 36), "undesilyon");
			numberWords.put(Math.pow(10, 39), "dodesilyon");
			numberWords.put(Math.pow(10, 42), "tredesilyon");
			numberWords.put(Math.pow(10, 45), "katordesilyon");
			numberWords.put(Math.pow(10, 48), "kendesilyon");
			numberWords.put(Math.pow(10, 51), "seksdesilyon");
			numberWords.put(Math.pow(10, 54), "septendesilyon");
			numberWords.put(Math.pow(10, 57), "oktodesilyon");
			numberWords.put(Math.pow(10, 60), "novemdesilyon");
			numberWords.put(Math.pow(10, 63), "vigintilyon");

		} else {

			wordNumbers.put("zero", BigDecimal.valueOf(0.0));
			wordNumbers.put("a", BigDecimal.valueOf(1.0));
			wordNumbers.put("one", BigDecimal.valueOf(1.0));
			wordNumbers.put("two", BigDecimal.valueOf(2.0));
			wordNumbers.put("three", BigDecimal.valueOf(3.0));
			wordNumbers.put("four", BigDecimal.valueOf(4.0));
			wordNumbers.put("five", BigDecimal.valueOf(5.0));
			wordNumbers.put("six", BigDecimal.valueOf(6.0));
			wordNumbers.put("seven", BigDecimal.valueOf(7.0));
			wordNumbers.put("eight", BigDecimal.valueOf(8.0));
			wordNumbers.put("nine", BigDecimal.valueOf(9.0));
			wordNumbers.put("ten", BigDecimal.valueOf(10.0));
			wordNumbers.put("eleven", BigDecimal.valueOf(11.0));
			wordNumbers.put("twelve", BigDecimal.valueOf(12.0));
			wordNumbers.put("thirteen", BigDecimal.valueOf(13.0));
			wordNumbers.put("fourteen", BigDecimal.valueOf(14.0));
			wordNumbers.put("fifteen", BigDecimal.valueOf(15.0));
			wordNumbers.put("sixteen", BigDecimal.valueOf(16.0));
			wordNumbers.put("seventeen", BigDecimal.valueOf(17.0));
			wordNumbers.put("eighteen", BigDecimal.valueOf(18.0));
			wordNumbers.put("nineteen", BigDecimal.valueOf(19.0));
			wordNumbers.put("twenty", BigDecimal.valueOf(20.0));
			wordNumbers.put("thirty", BigDecimal.valueOf(30.0));
			wordNumbers.put("forty", BigDecimal.valueOf(40.0));
			wordNumbers.put("fifty", BigDecimal.valueOf(50.0));
			wordNumbers.put("sixty", BigDecimal.valueOf(60.0));
			wordNumbers.put("seventy", BigDecimal.valueOf(70.0));
			wordNumbers.put("eighty", BigDecimal.valueOf(80.0));
			wordNumbers.put("ninety", BigDecimal.valueOf(90.0));
			wordNumbers.put("hundred", BigDecimal.valueOf(Math.pow(10, 2)));
			wordNumbers.put("thousand", BigDecimal.valueOf(Math.pow(10, 3)));
			wordNumbers.put("million", BigDecimal.valueOf(Math.pow(10, 6)));
			wordNumbers.put("billion", BigDecimal.valueOf(Math.pow(10, 9)));
			wordNumbers.put("trillion", BigDecimal.valueOf(Math.pow(10, 12)));
			wordNumbers.put("quadrillion", BigDecimal.valueOf(Math.pow(10, 15)));
			wordNumbers.put("quintillion", BigDecimal.valueOf(Math.pow(10, 18)));
			wordNumbers.put("sextillion", BigDecimal.valueOf(Math.pow(10, 21)));
			wordNumbers.put("septillion", BigDecimal.valueOf(Math.pow(10, 24)));
			wordNumbers.put("octillion", BigDecimal.valueOf(Math.pow(10, 27)));
			wordNumbers.put("nonillion", BigDecimal.valueOf(Math.pow(10, 30)));
			wordNumbers.put("decillion", BigDecimal.valueOf(Math.pow(10, 33)));
			wordNumbers.put("undecillion", BigDecimal.valueOf(Math.pow(10, 36)));
			wordNumbers.put("duodecillion", BigDecimal.valueOf(Math.pow(10, 39)));
			wordNumbers.put("tredecillion", BigDecimal.valueOf(Math.pow(10, 42)));
			wordNumbers.put("quattuordecillion", BigDecimal.valueOf(Math.pow(10, 45)));
			wordNumbers.put("quindecillion", BigDecimal.valueOf(Math.pow(10, 48)));
			wordNumbers.put("sexdecillion", BigDecimal.valueOf(Math.pow(10, 51)));
			wordNumbers.put("septendecillion", BigDecimal.valueOf(Math.pow(10, 54)));
			wordNumbers.put("octodecillion", BigDecimal.valueOf(Math.pow(10, 57)));
			wordNumbers.put("novemdecillion", BigDecimal.valueOf(Math.pow(10, 60)));
			wordNumbers.put("vigintillion", BigDecimal.valueOf(Math.pow(10, 63)));

			numberWords.put(0.0, "zero");
			numberWords.put(1.0, "one");
			numberWords.put(2.0, "two");
			numberWords.put(3.0, "three");
			numberWords.put(4.0, "four");
			numberWords.put(5.0, "five");
			numberWords.put(6.0, "six");
			numberWords.put(7.0, "seven");
			numberWords.put(8.0, "eight");
			numberWords.put(9.0, "nine");
			numberWords.put(10.0, "ten");
			numberWords.put(11.0, "eleven");
			numberWords.put(12.0, "twelve");
			numberWords.put(13.0, "thirteen");
			numberWords.put(14.0, "fourteen");
			numberWords.put(15.0, "fifteen");
			numberWords.put(16.0, "sixteen");
			numberWords.put(17.0, "seventeen");
			numberWords.put(18.0, "eighteen");
			numberWords.put(19.0, "nineteen");
			numberWords.put(20.0, "twenty");
			numberWords.put(30.0, "thirty");
			numberWords.put(40.0, "forty");
			numberWords.put(50.0, "fifty");
			numberWords.put(60.0, "sixty");
			numberWords.put(70.0, "seventy");
			numberWords.put(80.0, "eighty");
			numberWords.put(90.0, "ninety");
			numberWords.put(Math.pow(10, 2), "hundred");
			numberWords.put(Math.pow(10, 3), "thousand");
			numberWords.put(Math.pow(10, 6), "million");
			numberWords.put(Math.pow(10, 9), "billion");
			numberWords.put(Math.pow(10, 12), "trillion");
			numberWords.put(Math.pow(10, 15), "quadrillion");
			numberWords.put(Math.pow(10, 18), "quintillion");
			numberWords.put(Math.pow(10, 21), "sextillion");
			numberWords.put(Math.pow(10, 24), "septillion");
			numberWords.put(Math.pow(10, 27), "octillion");
			numberWords.put(Math.pow(10, 30), "nonillion");
			numberWords.put(Math.pow(10, 33), "decillion");
			numberWords.put(Math.pow(10, 36), "undecillion");
			numberWords.put(Math.pow(10, 39), "duodecillion");
			numberWords.put(Math.pow(10, 42), "tredecillion");
			numberWords.put(Math.pow(10, 45), "quattuordecillion");
			numberWords.put(Math.pow(10, 48), "quindecillion");
			numberWords.put(Math.pow(10, 51), "sexdecillion");
			numberWords.put(Math.pow(10, 54), "septendecillion");
			numberWords.put(Math.pow(10, 57), "octodecillion");
			numberWords.put(Math.pow(10, 60), "novemdecillion");
			numberWords.put(Math.pow(10, 63), "vigintillion");
		}
	}

	@Override
	public BigDecimal convertTextToNumber(String input) {
		BigDecimal total = BigDecimal.ZERO;
		BigDecimal currentNumber = BigDecimal.ZERO;

		boolean negative = false;

		String[] words = input.replaceAll("-", " ").toLowerCase().split(" ");
		
		HashSet<String> set = new HashSet<>();
		for (String s : words) {
		    if (!set.add(s) && wordNumbers.get(s) != null) {
		        if(wordNumbers.get(s).stripTrailingZeros().toPlainString().length() > 3 || (s.equals("minus") || s.equals("eksi")))
		        	return null;
		    }
		}
		
		
	
		
		List<BigDecimal> numbers = new ArrayList<BigDecimal>();
		
		for(String word : words) {
			if( !(word.equalsIgnoreCase("eksi") || word.equalsIgnoreCase("minus") || word.equalsIgnoreCase("and"))) {
				if(wordNumbers.get(word) == null)
					return null;
				else {
					numbers.add(wordNumbers.get(word));
				}
			}
				
			
		}
		
		
		if (words[0].equalsIgnoreCase("minus") || words[0].equalsIgnoreCase("eksi"))
			negative = true;
		
		for (int i = 0; i < numbers.size(); i++) {
			BigDecimal value = numbers.get(i);

			
			
			if (value != null) {
				if (i != 0) {
					currentNumber = currentNumber.stripTrailingZeros();
					total = total.stripTrailingZeros();
					value = value.stripTrailingZeros();
					if (
							//(i != 0 && wordNumbers.get(words[i - 1]).toPlainString().length() == wordNumbers.get(words[i]).toPlainString().length())
							// ( i == (words.length - 1) && value.toPlainString().length() < total.toPlainString().length() && (value.toPlainString().length() >= 3) && words.length > 2 && currentNumber.compareTo(BigDecimal.ZERO) == 0)
							//|| (total.compareTo(BigDecimal.ZERO) != 0 && currentNumber.compareTo(BigDecimal.ZERO) == 0 && value.toPlainString().length() > 3)
							//( total.compareTo(BigDecimal.ZERO) > 0 && value.toPlainString().length() + 2 >= total.toPlainString().length() && value.compareTo(BigDecimal.valueOf(100)) > 0)
							
							//(!currentNumber.equals(BigDecimal.ZERO) && numberWordswords[i - 1] )
							 (currentNumber.toPlainString().length() == 1 && value.toPlainString().length() == 2 && currentNumber.compareTo(BigDecimal.ZERO) != 0) // iki altmış
							|| (currentNumber.toPlainString().length() == 2 && value.toPlainString().length() == 3) // altmış yüz
							|| (currentNumber.toPlainString().length() == 2 && value.toPlainString().length() == 2) // on bir bin elli bir altmış
							|| (currentNumber.toPlainString().length() == 1 && value.toPlainString().length() == 1 && currentNumber.compareTo(BigDecimal.ZERO) != 0) // bir iki üç dört beş bin
							|| (currentNumber.toPlainString().length() == 3 && value.toPlainString().length() == 3) // altı yüz elli sekiz yüz
							|| (currentNumber.toPlainString().length() == 3 && currentNumber.remainder(BigDecimal.valueOf(100)).compareTo(BigDecimal.ZERO) != 0 && value.toPlainString().length() == 2) // beş yüz bir altmış
							|| (total.toPlainString().length() >= 3 && value.toPlainString().length() > total.toPlainString().length())// beş yüz on bir bin elli beş milyon
							)
						return null;
					}
			}

			
				

					if (value.compareTo(new BigDecimal(100)) == 0) {
						currentNumber = currentNumber.multiply(value);
						if (currentNumber.compareTo(BigDecimal.ZERO) == 0)
							currentNumber = currentNumber.add(value);
					} else if (value.compareTo(new BigDecimal(100)) < 0) {
						currentNumber = currentNumber.add(value);
					} else {
						if (currentNumber.compareTo(BigDecimal.ZERO) != 0) {
							total = total.add(currentNumber.multiply(value));
							currentNumber = BigDecimal.ZERO;
						} else {
							total = total.add(value);
						}
					}
				}
			

		
		
		total = total.add(currentNumber);
		if (negative)
			total = total.multiply(BigDecimal.valueOf(-1));
		return total;

	}

	@Override
	public String convertNumberToText(BigDecimal input) {
		BigDecimal number = input;

		if (number.compareTo(BigDecimal.ZERO) == 0) {
			return numberWords.get(0.0);
		}

		String result = "";

		if (number.compareTo(BigDecimal.ZERO) == -1) {
			if (Locale.getDefault().getLanguage().equals("tr"))
				result += "eksi ";
			else
				result += "minus ";

			number = number.negate();
		}

		if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 3))) >= 0) {

			for (double pow = 63.0; pow >= 3; pow -= 3) {
				if (number.compareTo(BigDecimal.valueOf(Math.pow(10, pow))) >= 0) {
					BigDecimal digit = number.divide(BigDecimal.valueOf(Math.pow(10, pow)), 0, RoundingMode.FLOOR);

					if (digit.compareTo(BigDecimal.ONE) == 0
							&& Locale.getDefault().getLanguage().equals("tr")
							&& numberWords.get(Math.pow(10, pow)).equalsIgnoreCase("bin"))
						
						result += numberWords.get(Math.pow(10, pow));
					else
						result += (convertNonExponentToText(digit)) + (" ") + (numberWords.get(Math.pow(10, pow)));
					number = number.remainder(BigDecimal.valueOf(Math.pow(10, pow)));
					if (number.compareTo(BigDecimal.valueOf(0)) > 0) {
						result += (" ");
					}
				}
			}
		}

		result += convertNonExponentToText(number);

		return result.replaceAll("bir yüz", "yüz").replaceAll("  ", " ");
	}

	public String convertNonExponentToText(BigDecimal number) {

		String result = "";

		if (number.compareTo(BigDecimal.valueOf(100)) >= 0) {
			BigDecimal hundreds = number.divide(BigDecimal.valueOf(100), 0, RoundingMode.FLOOR);
			result += (numberWords.get(hundreds.doubleValue())) + (" ") + (numberWords.get(100.0));
			number = number.remainder(BigDecimal.valueOf(100));
			if (number.compareTo(BigDecimal.valueOf(0)) >= 0) {
				result += (" ");
			}
		}

		if (number.compareTo(BigDecimal.valueOf(0)) > 0) {
			if (result.length() > 0 && !Locale.getDefault().getLanguage().equals("tr")) {
				result += ("and ");
			}

			if (number.compareTo(BigDecimal.valueOf(20)) < 0 && !Locale.getDefault().getLanguage().equals("tr")) {
				result += (numberWords.get(number.doubleValue()));
			} else {
				double tens = Math.floor(number.doubleValue() / 10);
				if (tens >= 1)
					result += (numberWords.get(tens * 10));
				double ones = Math.floor(number.doubleValue() % 10);
				if (ones >= 1) {
					if (number.compareTo(BigDecimal.ZERO) == -1 || tens >= 1)
						result += " " + numberWords.get(ones);
					else
						result += (numberWords.get(ones));
				}
			}
		}

		return result;
	}
}