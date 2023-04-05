package test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Test {

	static Locale locale = Locale.getDefault();
	// static Locale locale = new Locale("tr", "TR");
	static HashMap<String, BigDecimal> wordNumbersTR = new HashMap<String, BigDecimal>();
	static HashMap<String, BigDecimal> wordNumbersEN = new HashMap<String, BigDecimal>();
	static HashMap<String, BigDecimal> wordNumbers = new HashMap<String, BigDecimal>();
	static HashMap<Double, String> numberWordsTR = new HashMap<Double, String>();
	static HashMap<Double, String> numberWordsEN = new HashMap<Double, String>();
	static HashMap<Double, String> numberWords = new HashMap<Double, String>();

	static {
		wordNumbersTR.put("sıfır", BigDecimal.valueOf(0.0));
		wordNumbersTR.put("bir", BigDecimal.valueOf(1.0));
		wordNumbersTR.put("iki", BigDecimal.valueOf(2.0));
		wordNumbersTR.put("üç", BigDecimal.valueOf(3.0));
		wordNumbersTR.put("dört", BigDecimal.valueOf(4.0));
		wordNumbersTR.put("beş", BigDecimal.valueOf(5.0));
		wordNumbersTR.put("altı", BigDecimal.valueOf(6.0));
		wordNumbersTR.put("yedi", BigDecimal.valueOf(7.0));
		wordNumbersTR.put("sekiz", BigDecimal.valueOf(8.0));
		wordNumbersTR.put("dokuz", BigDecimal.valueOf(9.0));
		wordNumbersTR.put("on", BigDecimal.valueOf(10.0));
		wordNumbersTR.put("yirmi", BigDecimal.valueOf(20.0));
		wordNumbersTR.put("otuz", BigDecimal.valueOf(30.0));
		wordNumbersTR.put("kırk", BigDecimal.valueOf(40.0));
		wordNumbersTR.put("elli", BigDecimal.valueOf(50.0));
		wordNumbersTR.put("altmış", BigDecimal.valueOf(60.0));
		wordNumbersTR.put("yetmiş", BigDecimal.valueOf(70.0));
		wordNumbersTR.put("seksen", BigDecimal.valueOf(80.0));
		wordNumbersTR.put("doksan", BigDecimal.valueOf(90.0));
		wordNumbersTR.put("yüz", BigDecimal.valueOf(Math.pow(10, 2)));
		wordNumbersTR.put("bin", BigDecimal.valueOf(Math.pow(10, 3)));
		wordNumbersTR.put("milyon", BigDecimal.valueOf(Math.pow(10, 6)));
		wordNumbersTR.put("milyar", BigDecimal.valueOf(Math.pow(10, 9)));
		wordNumbersTR.put("trilyon", BigDecimal.valueOf(Math.pow(10, 12)));
		wordNumbersTR.put("katrilyon", BigDecimal.valueOf(Math.pow(10, 15)));
		wordNumbersTR.put("sekstilyon", BigDecimal.valueOf(Math.pow(10, 18)));
		wordNumbersTR.put("sextillion", BigDecimal.valueOf(Math.pow(10, 21)));
		wordNumbersTR.put("septilyon", BigDecimal.valueOf(Math.pow(10, 24)));
		wordNumbersTR.put("oktilyon", BigDecimal.valueOf(Math.pow(10, 27)));
		wordNumbersTR.put("nonilyon", BigDecimal.valueOf(Math.pow(10, 30)));
		wordNumbersTR.put("desilyon", BigDecimal.valueOf(Math.pow(10, 33)));

		wordNumbersEN.put("zero", BigDecimal.valueOf(0.0));
		wordNumbersEN.put("one", BigDecimal.valueOf(1.0));
		wordNumbersEN.put("two", BigDecimal.valueOf(2.0));
		wordNumbersEN.put("three", BigDecimal.valueOf(3.0));
		wordNumbersEN.put("four", BigDecimal.valueOf(4.0));
		wordNumbersEN.put("five", BigDecimal.valueOf(5.0));
		wordNumbersEN.put("six", BigDecimal.valueOf(6.0));
		wordNumbersEN.put("seven", BigDecimal.valueOf(7.0));
		wordNumbersEN.put("eight", BigDecimal.valueOf(8.0));
		wordNumbersEN.put("nine", BigDecimal.valueOf(9.0));
		wordNumbersEN.put("ten", BigDecimal.valueOf(10.0));
		wordNumbersEN.put("eleven", BigDecimal.valueOf(11.0));
		wordNumbersEN.put("twelve", BigDecimal.valueOf(12.0));
		wordNumbersEN.put("thirteen", BigDecimal.valueOf(13.0));
		wordNumbersEN.put("fourteen", BigDecimal.valueOf(14.0));
		wordNumbersEN.put("fifteen", BigDecimal.valueOf(15.0));
		wordNumbersEN.put("sixteen", BigDecimal.valueOf(16.0));
		wordNumbersEN.put("seventeen", BigDecimal.valueOf(17.0));
		wordNumbersEN.put("eighteen", BigDecimal.valueOf(18.0));
		wordNumbersEN.put("nineteen", BigDecimal.valueOf(19.0));
		wordNumbersEN.put("twenty", BigDecimal.valueOf(20.0));
		wordNumbersEN.put("thirty", BigDecimal.valueOf(30.0));
		wordNumbersEN.put("forty", BigDecimal.valueOf(40.0));
		wordNumbersEN.put("fifty", BigDecimal.valueOf(50.0));
		wordNumbersEN.put("sixty", BigDecimal.valueOf(60.0));
		wordNumbersEN.put("seventy", BigDecimal.valueOf(70.0));
		wordNumbersEN.put("eighty", BigDecimal.valueOf(80.0));
		wordNumbersEN.put("ninety", BigDecimal.valueOf(90.0));
		wordNumbersEN.put("hundred", BigDecimal.valueOf(Math.pow(10, 2)));
		wordNumbersEN.put("thousand", BigDecimal.valueOf(Math.pow(10, 3)));
		wordNumbersEN.put("million", BigDecimal.valueOf(Math.pow(10, 6)));
		wordNumbersEN.put("billion", BigDecimal.valueOf(Math.pow(10, 9)));
		wordNumbersEN.put("trillion", BigDecimal.valueOf(Math.pow(10, 12)));
		wordNumbersEN.put("quadrillion", BigDecimal.valueOf(Math.pow(10, 15)));
		wordNumbersEN.put("quintillion", BigDecimal.valueOf(Math.pow(10, 18)));
		wordNumbersEN.put("sextillion", BigDecimal.valueOf(Math.pow(10, 21)));
		wordNumbersEN.put("septillion", BigDecimal.valueOf(Math.pow(10, 24)));
		wordNumbersEN.put("octillion", BigDecimal.valueOf(Math.pow(10, 27)));
		wordNumbersEN.put("nonillion", BigDecimal.valueOf(Math.pow(10, 30)));
		wordNumbersEN.put("decillion", BigDecimal.valueOf(Math.pow(10, 33)));

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
		numberWordsTR.put(Math.pow(10, 2), "yüz");
		numberWordsTR.put(Math.pow(10, 3), "bin");
		numberWordsTR.put(Math.pow(10, 6), "milyon");
		numberWordsTR.put(Math.pow(10, 9), "milyar");
		numberWordsTR.put(Math.pow(10, 12), "trilyon");
		numberWordsTR.put(Math.pow(10, 15), "katrilyon");
		numberWordsTR.put(Math.pow(10, 18), "kentilyon");
		numberWordsTR.put(Math.pow(10, 21), "sekstilyon");
		numberWordsTR.put(Math.pow(10, 24), "septilyon");
		numberWordsTR.put(Math.pow(10, 27), "oktilyon");
		numberWordsTR.put(Math.pow(10, 30), "nonilyon");
		numberWordsTR.put(Math.pow(10, 33), "desilyon");

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
		numberWordsEN.put(Math.pow(10, 2), "hundred");
		numberWordsEN.put(Math.pow(10, 3), "thousand");
		numberWordsEN.put(Math.pow(10, 6), "million");
		numberWordsEN.put(Math.pow(10, 9), "billion");
		numberWordsEN.put(Math.pow(10, 12), "trillion");
		numberWordsEN.put(Math.pow(10, 15), "quadrillion");
		numberWordsEN.put(Math.pow(10, 18), "quintillion");
		numberWordsEN.put(Math.pow(10, 21), "sextillion");
		numberWordsEN.put(Math.pow(10, 24), "septillion");
		numberWordsEN.put(Math.pow(10, 27), "octillion");
		numberWordsEN.put(Math.pow(10, 30), "nonillion");
		numberWordsEN.put(Math.pow(10, 33), "decillion");

		if (locale.getLanguage().equals("tr")) {
			numberWords = numberWordsTR;
			wordNumbers = wordNumbersTR;
		} else {
			numberWords = numberWordsEN;
			wordNumbers = wordNumbersEN;
		}
	}

	public static BigDecimal convertTextToNumber(String input) {
		BigDecimal total = BigDecimal.ZERO;
		BigDecimal currentNumber = BigDecimal.ZERO;

		boolean negative = false;

		String[] words = input.split("\\s+");

		if (words[0].equalsIgnoreCase("minus") || words[0].equalsIgnoreCase("eksi"))
			negative = true;

		for (String word : words) {
			BigDecimal value = wordNumbers.get(word);
			if (!word.equalsIgnoreCase("minus") && !word.equalsIgnoreCase("eksi") && !word.equalsIgnoreCase("and"))
				if (value != null) {
					if (value.compareTo(new BigDecimal(100)) == 0) {
						currentNumber = currentNumber.multiply(value);
					} else if (value.compareTo(new BigDecimal(100)) < 0) {
						currentNumber = currentNumber.add(value);
					} else {
						total = total.add(currentNumber.multiply(value));
						currentNumber = BigDecimal.ZERO;
					}
				} else {
					return BigDecimal.valueOf(-1);
				}
		}
		total = total.add(currentNumber);
		if (negative)
			total = total.multiply(BigDecimal.valueOf(-1));
		return total;
	}

	public static String convertNumberToText(BigDecimal input) {
		BigDecimal number = input;

		if (number.compareTo(BigDecimal.ZERO) == 0) {
			return numberWords.get(0.0);
		}

		String result = "";

		if (number.compareTo(BigDecimal.ZERO) == -1) {
			if (locale.getLanguage().equals("tr"))
				result += "eksi";
			else
				result += "minus";

			number.negate();
		}

		// loop test here

		if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 6))) >= 0) {

			for (double pow = 33.0; pow >= 6; pow -= 3) {
				if (number.compareTo(BigDecimal.valueOf(Math.pow(10, pow))) >= 0) {
					BigDecimal kat = number.divide(BigDecimal.valueOf(Math.pow(10, pow)), 0, RoundingMode.FLOOR)
							.setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
					result += (convertNumberToText(kat)) + (" ") + (numberWords.get(Math.pow(10, pow)));
					number = number.remainder(BigDecimal.valueOf(Math.pow(10, pow)));
					if (number.compareTo(BigDecimal.valueOf(0)) >= 0) {
						result += (" ");
					}
				}
			}
		}

		// loop test ends

		if (number.compareTo(BigDecimal.valueOf(1000)) >= 0) {
			BigDecimal thousands = number.divide(BigDecimal.valueOf(1000), 0, RoundingMode.FLOOR)
					.setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
			result += (convertNumberToText(thousands)) + (" ") + (numberWords.get(1000.0));
			number = number.remainder(BigDecimal.valueOf(1000));
			if (number.compareTo(BigDecimal.valueOf(0)) >= 0) {
				result += (" ");
			}
		}

		if (number.compareTo(BigDecimal.valueOf(100)) >= 0) {
			BigDecimal hundreds = number.divide(BigDecimal.valueOf(100), 0, RoundingMode.FLOOR)
					.setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
			result += (numberWords.get(hundreds.doubleValue())) + (" ") + (numberWords.get(100.0));
			number = number.remainder(BigDecimal.valueOf(100));
			if (number.compareTo(BigDecimal.valueOf(0)) >= 0) {
				result += (" ");
			}
		}

		if (number.compareTo(BigDecimal.valueOf(0)) > 0) {
			if (result.length() > 0 && !locale.getLanguage().equals("tr")) {
				result += ("and ");
			}

			if (number.compareTo(BigDecimal.valueOf(20)) < 0 && !locale.getLanguage().equals("tr")) {
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

		return result.replaceAll("bir yüz", "yüz");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		String inp = null;
		BigDecimal input = null;
		while (input == null || input.compareTo(BigDecimal.valueOf(31)) != 0 || inp != "") {
			System.out.print("Enter a number: ");
			input = scanner.nextBigDecimal();
			System.out.println(convertNumberToText(input));
			
			System.out.print("Enter a number in words: ");
			inp = scan.nextLine();
			System.out.println(convertTextToNumber(inp));
		}

		System.out.println("Done");
		scanner.close();
	}

}

/*
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 33))) >= 0) { BigDecimal
 * decillions = number.divide(BigDecimal.valueOf(Math.pow(10, 33)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(decillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 33))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 33))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 30))) >= 0) { BigDecimal
 * nonillions = number.divide(BigDecimal.valueOf(Math.pow(10, 30)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(nonillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 30))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 30))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 27))) >= 0) { BigDecimal
 * octillions = number.divide(BigDecimal.valueOf(Math.pow(10, 27)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(octillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 27))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 27))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 24))) >= 0) { BigDecimal
 * septillions = number.divide(BigDecimal.valueOf(Math.pow(10, 24)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(septillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 24))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 24))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 21))) >= 0) { BigDecimal
 * sextillions = number.divide(BigDecimal.valueOf(Math.pow(10, 21)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(sextillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 21))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 21))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 18))) >= 0) { BigDecimal
 * quintillions = number.divide(BigDecimal.valueOf(Math.pow(10, 18)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(quintillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 18))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 18))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 15))) >= 0) { BigDecimal
 * quadrillions = number.divide(BigDecimal.valueOf(Math.pow(10, 15)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(quadrillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 15))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 15))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 12))) >= 0) { BigDecimal
 * trillions = number.divide(BigDecimal.valueOf(Math.pow(10, 12)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(trillions)) + (" ") +
 * (numberWords.get(Math.pow(10, 12))); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 12))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } } // hey
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 9))) >= 0) { BigDecimal
 * billions = number.divide(BigDecimal.valueOf(Math.pow(10, 9)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(billions)) + (" ") +
 * (numberWords.get(1000000000.0)); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 9))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 * 
 * if (number.compareTo(BigDecimal.valueOf(Math.pow(10, 6))) >= 0) { BigDecimal
 * millions = number.divide(BigDecimal.valueOf(Math.pow(10, 6)), 0,
 * RoundingMode.FLOOR) .setScale(0, RoundingMode.FLOOR).stripTrailingZeros();
 * result += (convertNumberToText(millions)) + (" ") +
 * (numberWords.get(1000000.0)); number =
 * number.remainder(BigDecimal.valueOf(Math.pow(10, 6))); if
 * (number.compareTo(BigDecimal.valueOf(0)) >= 0) { result += (" "); } }
 */
