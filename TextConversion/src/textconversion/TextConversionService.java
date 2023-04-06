package textconversion;

import java.util.HashMap;
import java.util.Locale;

public class TextConversionService implements TextConversionInterface {

	static Locale locale = Locale.getDefault();
	// static Locale locale = new Locale("tr", "TR");
	static HashMap<String, Double> wordNumbersTR = new HashMap<String, Double>();
	static HashMap<String, Double> wordNumbersEN = new HashMap<String, Double>();
	static HashMap<String, Double> wordNumbers = new HashMap<String, Double>();
	static HashMap<Double, String> numberWordsTR = new HashMap<Double, String>();
	static HashMap<Double, String> numberWordsEN = new HashMap<Double, String>();
	static HashMap<Double, String> numberWords = new HashMap<Double, String>();
	static {
		wordNumbersTR.put("sıfır", 0.0);
		wordNumbersTR.put("bir", 1.0);
		wordNumbersTR.put("iki", 2.0);
		wordNumbersTR.put("üç", 3.0);
		wordNumbersTR.put("dört", 4.0);
		wordNumbersTR.put("beş", 5.0);
		wordNumbersTR.put("altı", 6.0);
		wordNumbersTR.put("yedi", 7.0);
		wordNumbersTR.put("sekiz", 8.0);
		wordNumbersTR.put("dokuz", 9.0);
		wordNumbersTR.put("on", 10.0);
		wordNumbersTR.put("yirmi", 20.0);
		wordNumbersTR.put("otuz", 30.0);
		wordNumbersTR.put("kırk", 40.0);
		wordNumbersTR.put("elli", 50.0);
		wordNumbersTR.put("altmış", 60.0);
		wordNumbersTR.put("yetmiş", 70.0);
		wordNumbersTR.put("seksen", 80.0);
		wordNumbersTR.put("doksan", 90.0);
		wordNumbersTR.put("yüz", 100.0);
		wordNumbersTR.put("bin", 1000.0);
		wordNumbersTR.put("milyon", 1000000.0);
		wordNumbersTR.put("milyar", 1000000000.0);

		numberWordsTR.put(0.0, "sıfır");
		numberWordsTR.put(1.0, "bir");
		numberWordsTR.put(2.0, "iki");
		numberWordsTR.put(3.0, "üç");
		numberWordsTR.put(4.0, "dört");
		numberWordsTR.put(5.0, "beş");
		numberWordsTR.put(6.0, "altı");
		numberWordsTR.put(7.0, "yedi");
		numberWordsTR.put(8.0, "sekiz");
		numberWordsTR.put(9.0, "dokuz");
		numberWordsTR.put(10.0, "on");
		numberWordsTR.put(20.0, "yirmi");
		numberWordsTR.put(30.0, "otuz");
		numberWordsTR.put(40.0, "kırk");
		numberWordsTR.put(50.0, "elli");
		numberWordsTR.put(60.0, "altmış");
		numberWordsTR.put(70.0, "yetmiş");
		numberWordsTR.put(80.0, "seksen");
		numberWordsTR.put(90.0, "doksan");
		numberWordsTR.put(100.0, "yüz");
		numberWordsTR.put(1000.0, "bin");
		numberWordsTR.put(1000000.0, "milyon");
		numberWordsTR.put(1000000000.0, "milyar");

		numberWordsEN.put(0.0, "zero");
		numberWordsEN.put(1.0, "one");
		numberWordsEN.put(2.0, "two");
		numberWordsEN.put(3.0, "three");
		numberWordsEN.put(4.0, "four");
		numberWordsEN.put(5.0, "five");
		numberWordsEN.put(6.0, "six");
		numberWordsEN.put(7.0, "seven");
		numberWordsEN.put(8.0, "eight");
		numberWordsEN.put(9.0, "nine");
		numberWordsEN.put(10.0, "ten");
		numberWordsEN.put(11.0, "eleven");
		numberWordsEN.put(12.0, "twelve");
		numberWordsEN.put(13.0, "thirteen");
		numberWordsEN.put(14.0, "fourteen");
		numberWordsEN.put(15.0, "fifteen");
		numberWordsEN.put(16.0, "sixteen");
		numberWordsEN.put(17.0, "seventeen");
		numberWordsEN.put(18.0, "eighteen");
		numberWordsEN.put(19.0, "nineteen");
		numberWordsEN.put(20.0, "twenty");
		numberWordsEN.put(30.0, "thirty");
		numberWordsEN.put(40.0, "forty");
		numberWordsEN.put(50.0, "fifty");
		numberWordsEN.put(60.0, "sixty");
		numberWordsEN.put(70.0, "seventy");
		numberWordsEN.put(80.0, "eighty");
		numberWordsEN.put(90.0, "ninety");
		numberWordsEN.put(100.0, "hundred");
		numberWordsEN.put(1000.0, "thousand");
		numberWordsEN.put(1000000.0, "million");
		numberWordsEN.put(1000000000.0, "billion");

		wordNumbersEN.put("zero", 0.0);
		wordNumbersEN.put("one", 1.0);
		wordNumbersEN.put("two", 2.0);
		wordNumbersEN.put("three", 3.0);
		wordNumbersEN.put("four", 4.0);
		wordNumbersEN.put("five", 5.0);
		wordNumbersEN.put("six", 6.0);
		wordNumbersEN.put("seven", 7.0);
		wordNumbersEN.put("eight", 8.0);
		wordNumbersEN.put("nine", 9.0);
		wordNumbersEN.put("ten", 10.0);
		wordNumbersEN.put("eleven", 11.0);
		wordNumbersEN.put("twelve", 12.0);
		wordNumbersEN.put("thirteen", 13.0);
		wordNumbersEN.put("fourteen", 14.0);
		wordNumbersEN.put("fifteen", 15.0);
		wordNumbersEN.put("sixteen", 16.0);
		wordNumbersEN.put("seventeen", 17.0);
		wordNumbersEN.put("eighteen", 18.0);
		wordNumbersEN.put("nineteen", 19.0);
		wordNumbersEN.put("twenty", 20.0);
		wordNumbersEN.put("thirty", 30.0);
		wordNumbersEN.put("forty", 40.0);
		wordNumbersEN.put("fifty", 50.0);
		wordNumbersEN.put("sixty", 60.0);
		wordNumbersEN.put("seventy", 70.0);
		wordNumbersEN.put("eighty", 80.0);
		wordNumbersEN.put("ninety", 90.0);
		wordNumbersEN.put("hundred", 100.0);
		wordNumbersEN.put("thousand", 1000.0);
		wordNumbersEN.put("million", 1000000.0);
		wordNumbersEN.put("billion", 1000000000.0);

		if (locale.getLanguage().equals("tr")) {
			numberWords = numberWordsTR;
			wordNumbers = wordNumbersTR;
		} else {
			numberWords = numberWordsEN;
			wordNumbers = wordNumbersEN;
		}

	}

	@Override
	public double convertTextToNumber(String input) {
		double total = 0;
		double currentNumber = 0;

		boolean negative = false;

		String[] words = input.split(" ");

		if (words[0].equalsIgnoreCase("minus") || words[0].equalsIgnoreCase("eksi"))
			negative = true;

		for (String word : words) {
			double value = wordNumbers.get(word);
			if (!word.equalsIgnoreCase("minus") && !word.equalsIgnoreCase("eksi") && !word.equalsIgnoreCase("and"))

				if (value == 100) {
					currentNumber = currentNumber * value;
				} else if (value < 100) {
					currentNumber += value;
				} else {
					total += currentNumber * value;
					currentNumber = 0;
				}

		}

		total += currentNumber;
		if (negative)
			total *= -1;
		return total;
	}

	public String convertNumberToText(double input) {
		double number = input;

		if (number == 0) {
			return numberWords.get(0.0);
		}

		String result = "";

		if (number < 0) {
			if (locale.getLanguage().equals("tr"))
				result += "eksi";
			else
				result += "minus";

			number *= -1;
		}

		if (number >= Math.pow(10, 6)) {

			for (double pow = 33.0; pow >= 3; pow -= 3) {
				if (number >= Math.pow(10, pow)) {
					double digit = number / Math.pow(10, pow);
					result += (convertNonExponentToText(digit)) + (" ") + (numberWords.get(Math.pow(10, pow)));
					number %= Math.pow(10, pow);
					if (number >= 0) {
						result += (" ");
					}
				}
			}
		}

		result += convertNonExponentToText(number);

		return result.replaceAll("bir yüz", "yüz");
	}

	private static String convertNonExponentToText(double number) {

		String result = "";

		if (number >= 100) {
			double hundreds = number / 100;
			result += numberWords.get(hundreds) + " " + numberWords.get(100.0);
			number %= 100;
			if (number >= 0) {
				result += (" ");
			}
		}

		if (number > 0) {
			if (result.length() > 0 && !locale.getLanguage().equals("tr")) {
				result += ("and ");
			}

			if (number < 20 && !locale.getLanguage().equals("tr")) {
				result += numberWords.get(number);
			} else {
				double tens = Math.floor(number / 10);
				if (tens >= 1)
					result += (numberWords.get(tens * 10));
				double ones = Math.floor(number % 10);
				if (ones >= 1) {
					if (/* number.compareTo(BigDecimal.ZERO) == -1 || */ tens >= 1)
						result += " " + numberWords.get(ones);
					else
						result += (numberWords.get(ones));
				}
			}
		}

		return result;
	}

}
