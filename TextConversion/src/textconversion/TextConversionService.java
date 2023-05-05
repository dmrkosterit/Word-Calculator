package textconversion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;
import java.util.HashSet;
import java.util.ArrayList;

public class TextConversionService implements TextConversionInterface {

	HashMap<String, BigInteger> wordNumbers = new HashMap<String, BigInteger>();
	HashMap<Double, String> numberWords = new HashMap<Double, String>();

	public TextConversionService() {

		setLocale(Locale.getDefault());

	}

	public void setLocale(Locale locale) {
		Locale.setDefault(locale);

		if (Locale.getDefault().getLanguage().equals("tr")) {

			wordNumbers.put("sıfır", BigInteger.valueOf(0));
			wordNumbers.put("bir", BigInteger.valueOf(1));
			wordNumbers.put("iki", BigInteger.valueOf(2));
			wordNumbers.put("üç", BigInteger.valueOf(3));
			wordNumbers.put("dört", BigInteger.valueOf(4));
			wordNumbers.put("beş", BigInteger.valueOf(5));
			wordNumbers.put("altı", BigInteger.valueOf(6));
			wordNumbers.put("yedi", BigInteger.valueOf(7));
			wordNumbers.put("sekiz", BigInteger.valueOf(8));
			wordNumbers.put("dokuz", BigInteger.valueOf(9));
			wordNumbers.put("on", BigInteger.valueOf(10));
			wordNumbers.put("yirmi", BigInteger.valueOf(20));
			wordNumbers.put("otuz", BigInteger.valueOf(30));
			wordNumbers.put("kırk", BigInteger.valueOf(40));
			wordNumbers.put("elli", BigInteger.valueOf(50));
			wordNumbers.put("altmış", BigInteger.valueOf(60));
			wordNumbers.put("yetmiş", BigInteger.valueOf(70));
			wordNumbers.put("seksen", BigInteger.valueOf(80));
			wordNumbers.put("doksan", BigInteger.valueOf(90));
			wordNumbers.put("yüz", BigInteger.TEN.pow(2));
			wordNumbers.put("bin", BigInteger.TEN.pow(3));
			wordNumbers.put("milyon", BigInteger.TEN.pow(6));
			wordNumbers.put("milyar", BigInteger.TEN.pow(9));
			wordNumbers.put("trilyon", BigInteger.TEN.pow(12));
			wordNumbers.put("katrilyon", BigInteger.TEN.pow(15));
			wordNumbers.put("kentilyon", BigInteger.TEN.pow(18));
			wordNumbers.put("sekstilyon", BigInteger.TEN.pow(21));
			wordNumbers.put("septilyon", BigInteger.TEN.pow(24));
			wordNumbers.put("oktilyon", BigInteger.TEN.pow(27));
			wordNumbers.put("nonilyon", BigInteger.TEN.pow(30));
			wordNumbers.put("desilyon", BigInteger.TEN.pow(33));
			wordNumbers.put("undesilyon", BigInteger.TEN.pow(36));
			wordNumbers.put("dodesilyon", BigInteger.TEN.pow(39));
			wordNumbers.put("tredesilyon", BigInteger.TEN.pow(42));
			wordNumbers.put("katordesilyon", BigInteger.TEN.pow(45));
			wordNumbers.put("kendesilyon", BigInteger.TEN.pow(48));
			wordNumbers.put("seksdesilyon", BigInteger.TEN.pow(51));
			wordNumbers.put("septendesilyon", BigInteger.TEN.pow(54));
			wordNumbers.put("oktodesilyon", BigInteger.TEN.pow(57));
			wordNumbers.put("novemdesilyon", BigInteger.TEN.pow(60));
			wordNumbers.put("vigintilyon", BigInteger.TEN.pow(63));

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

			wordNumbers.put("zero", BigInteger.ZERO);
			wordNumbers.put("a", BigInteger.ONE);
			wordNumbers.put("one", BigInteger.ONE);
			wordNumbers.put("two", BigInteger.TWO);
			wordNumbers.put("three", BigInteger.valueOf(3));
			wordNumbers.put("four", BigInteger.valueOf(4));
			wordNumbers.put("five", BigInteger.valueOf(5));
			wordNumbers.put("six", BigInteger.valueOf(6));
			wordNumbers.put("seven", BigInteger.valueOf(7));
			wordNumbers.put("eight", BigInteger.valueOf(8));
			wordNumbers.put("nine", BigInteger.valueOf(9));
			wordNumbers.put("ten", BigInteger.TEN);
			wordNumbers.put("eleven", BigInteger.valueOf(11));
			wordNumbers.put("twelve", BigInteger.valueOf(12));
			wordNumbers.put("thirteen", BigInteger.valueOf(13));
			wordNumbers.put("fourteen", BigInteger.valueOf(14));
			wordNumbers.put("fifteen", BigInteger.valueOf(15));
			wordNumbers.put("sixteen", BigInteger.valueOf(16));
			wordNumbers.put("seventeen", BigInteger.valueOf(17));
			wordNumbers.put("eighteen", BigInteger.valueOf(18));
			wordNumbers.put("nineteen", BigInteger.valueOf(19));
			wordNumbers.put("twenty", BigInteger.valueOf(20));
			wordNumbers.put("thirty", BigInteger.valueOf(30));
			wordNumbers.put("forty", BigInteger.valueOf(40));
			wordNumbers.put("fifty", BigInteger.valueOf(50));
			wordNumbers.put("sixty", BigInteger.valueOf(60));
			wordNumbers.put("seventy", BigInteger.valueOf(70));
			wordNumbers.put("eighty", BigInteger.valueOf(80));
			wordNumbers.put("ninety", BigInteger.valueOf(90));
			wordNumbers.put("hundred", BigInteger.TEN.pow(2));
			wordNumbers.put("thousand", BigInteger.TEN.pow(3));
			wordNumbers.put("million", BigInteger.TEN.pow(6));
			wordNumbers.put("billion", BigInteger.TEN.pow(9));
			wordNumbers.put("trillion", BigInteger.TEN.pow(12));
			wordNumbers.put("quadrillion", BigInteger.TEN.pow(15));
			wordNumbers.put("quintillion", BigInteger.TEN.pow(18));
			wordNumbers.put("sextillion", BigInteger.TEN.pow(21));
			wordNumbers.put("septillion", BigInteger.TEN.pow(24));
			wordNumbers.put("octillion", BigInteger.TEN.pow(27));
			wordNumbers.put("nonillion", BigInteger.TEN.pow(30));
			wordNumbers.put("decillion", BigInteger.TEN.pow(33));
			wordNumbers.put("undecillion", BigInteger.TEN.pow(36));
			wordNumbers.put("duodecillion", BigInteger.TEN.pow(39));
			wordNumbers.put("tredecillion", BigInteger.TEN.pow(42));
			wordNumbers.put("quattuordecillion", BigInteger.TEN.pow(45));
			wordNumbers.put("quindecillion", BigInteger.TEN.pow(48));
			wordNumbers.put("sexdecillion", BigInteger.TEN.pow(51));
			wordNumbers.put("septendecillion", BigInteger.TEN.pow(54));
			wordNumbers.put("octodecillion", BigInteger.TEN.pow(57));
			wordNumbers.put("novemdecillion", BigInteger.TEN.pow(60));
			wordNumbers.put("vigintillion", BigInteger.TEN.pow(63));
			
			
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
	public BigInteger convertTextToNumber(String input) {
		BigInteger total = BigInteger.ZERO;
		BigInteger currentNumber = BigInteger.ZERO;

		boolean negative = false;

		String[] words = input.replaceAll("-", " ").toLowerCase().split(" ");
		
		HashSet<String> set = new HashSet<>();
		for (String s : words) {
		    if (!set.add(s) && wordNumbers.get(s) != null) {
		        if(wordNumbers.get(s).toString().length() > 3 || (s.equals("minus") || s.equals("eksi")))
		        	return null;
		    }
		}
		
		ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
		
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
			BigInteger value = numbers.get(i);
			
			if (value != null) {
				if (i != 0) {
					if (
							 (currentNumber.toString().length() == 1 && value.toString().length() == 2 && currentNumber.compareTo(BigInteger.ZERO) != 0) // iki altmış
							|| (currentNumber.toString().length() == 2 && value.toString().length() == 3) // altmış yüz
							|| (currentNumber.toString().length() == 2 && value.toString().length() == 2) // on bir bin elli bir altmış
							|| (currentNumber.toString().length() == 1 && value.toString().length() == 1 && currentNumber.compareTo(BigInteger.ZERO) != 0) // bir iki üç dört beş bin
							|| (currentNumber.toString().length() == 3 && value.toString().length() == 3) // altı yüz elli sekiz yüz
							|| (currentNumber.toString().length() == 3 && currentNumber.remainder(BigInteger.valueOf(100)).compareTo(BigInteger.ZERO) != 0 && value.toString().length() == 2) // beş yüz bir altmış
							|| (total.toString().length() >= 3 && value.toString().length() > total.toString().length())// beş yüz on bir bin elli beş milyon
							)
						return null;
					}
			}

					if (value.compareTo(BigInteger.valueOf(100)) == 0) {
						currentNumber = currentNumber.multiply(value);
						if (currentNumber.compareTo(BigInteger.ZERO) == 0)
							currentNumber = currentNumber.add(value);
					} else if (value.compareTo(BigInteger.valueOf(100)) < 0) {
						currentNumber = currentNumber.add(value);
					} else {
						if (currentNumber.compareTo(BigInteger.ZERO) != 0) {
							total = total.add(currentNumber.multiply(value));
							currentNumber = BigInteger.ZERO;
						} else if(currentNumber.compareTo(BigInteger.ZERO) == 0) {
							return null;
					} else {
							total = total.add(value);
						}
					}
				}
			

		
		
		total = total.add(currentNumber);
		if (negative)
			total = total.multiply(BigInteger.valueOf(-1));
		return total;

	}

	@Override
	public String convertNumberToText(BigInteger input) {
		BigInteger number = input;

		if (number.compareTo(BigInteger.ZERO) == 0) {
			return numberWords.get(0.0);
		}

		String result = "";

		if (number.compareTo(BigInteger.ZERO) == -1) {
			if (Locale.getDefault().getLanguage().equals("tr"))
				result += "eksi ";
			else
				result += "minus ";

			number = number.negate();
		}

		if (number.compareTo(BigInteger.TEN.pow(3)) >= 0) {

			for (int pow = 63; pow >= 3; pow -= 3) {
				if (number.compareTo(BigInteger.TEN.pow(pow)) >= 0) {
					BigInteger digit = number.divide(BigInteger.TEN.pow(pow));

					if (digit.compareTo(BigInteger.ONE) == 0 && Locale.getDefault().getLanguage().equals("tr")
							&& numberWords.get(Math.pow(10, pow)).equalsIgnoreCase("bin"))

						result += numberWords.get(Math.pow(10, pow));
					else
						result += (convertNonExponentToText(digit)) + (" ") + (numberWords.get(Math.pow(10, pow)));
					number = number.remainder(BigInteger.TEN.pow(pow));
					if (number.compareTo(BigInteger.valueOf(0)) > 0) {
						result += (" ");
					}
				}
			}
		}

		result += convertNonExponentToText(number);

		return result.replaceAll("bir yüz", "yüz").replaceAll("  ", " ");
	}

	public String convertNonExponentToText(BigInteger number) {

		String result = "";

		if (number.compareTo(BigInteger.valueOf(100)) >= 0) {
			BigInteger hundreds = number.divide(BigInteger.valueOf(100));
			result += (numberWords.get(hundreds.doubleValue())) + (" ") + (numberWords.get(100.0));
			number = number.remainder(BigInteger.valueOf(100));
			if (number.compareTo(BigInteger.valueOf(0)) >= 0) {
				result += (" ");
			}
		}

		if (number.compareTo(BigInteger.valueOf(0)) > 0) {
			if (result.length() > 0 && !Locale.getDefault().getLanguage().equals("tr")) {
				result += ("and ");
			}

			if (number.compareTo(BigInteger.valueOf(20)) < 0 && !Locale.getDefault().getLanguage().equals("tr")) {
				result += (numberWords.get(number.doubleValue()));
			} else {
				double tens = Math.floor(number.doubleValue() / 10);
				if (tens >= 1)
					result += (numberWords.get(tens * 10));
				double ones = Math.floor(number.doubleValue() % 10);
				if (ones >= 1) {
					if (number.compareTo(BigInteger.ZERO) == -1 || tens >= 1)
						result += " " + numberWords.get(ones);
					else
						result += (numberWords.get(ones));
				}
			}
		}

		return result;
	}
}