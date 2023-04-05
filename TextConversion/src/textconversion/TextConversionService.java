package textconversion;

import java.util.HashMap;
import java.util.Locale;

public class TextConversionService implements TextConversionInterface{

	//Locale locale = Locale.getDefault();
	Locale locale = new Locale("tr", "TR"); 
	static HashMap<String, Integer> wordNumbersTR = new HashMap<String, Integer>();
	static HashMap<String, Integer> wordNumbersEN = new HashMap<String, Integer>();
	static HashMap<Integer, String> numberWordsTR = new HashMap<Integer, String>();
	static HashMap<Integer, String> numberWordsEN = new HashMap<Integer, String>();
	static {
		wordNumbersTR.put("sıfır", 0);
		wordNumbersTR.put("bir", 1);
		wordNumbersTR.put("iki", 2);
		wordNumbersTR.put("üç", 3);
		wordNumbersTR.put("dört", 4);
		wordNumbersTR.put("beş", 5);
		wordNumbersTR.put("altı", 6);
		wordNumbersTR.put("yedi", 7);
		wordNumbersTR.put("sekiz", 8);
		wordNumbersTR.put("dokuz", 9);
		wordNumbersTR.put("on", 10);
		wordNumbersTR.put("yirmi", 20);
		wordNumbersTR.put("otuz", 30);
		wordNumbersTR.put("kırk", 40);
		wordNumbersTR.put("elli", 50);
		wordNumbersTR.put("altmış", 60);
		wordNumbersTR.put("yetmiş", 70);
		wordNumbersTR.put("seksen", 80);
		wordNumbersTR.put("doksan", 90);
		wordNumbersTR.put("yüz", 100);
		wordNumbersTR.put("bin", 1000);
		wordNumbersTR.put("milyon", 1000000);
		wordNumbersTR.put("milyar", 1000000000);

		wordNumbersEN.put("zero", 0);
		wordNumbersEN.put("one", 1);
		wordNumbersEN.put("two", 2);
		wordNumbersEN.put("three", 3);
		wordNumbersEN.put("four", 4);
		wordNumbersEN.put("five", 5);
		wordNumbersEN.put("six", 6);
		wordNumbersEN.put("seven", 7);
		wordNumbersEN.put("eight", 8);
		wordNumbersEN.put("nine", 9);
		wordNumbersEN.put("ten", 10);
		wordNumbersEN.put("eleven", 11);
		wordNumbersEN.put("twelve", 12);
		wordNumbersEN.put("thirteen", 13);
		wordNumbersEN.put("fourteen", 14);
		wordNumbersEN.put("fifteen", 15);
		wordNumbersEN.put("sixteen", 16);
		wordNumbersEN.put("seventeen", 17);
		wordNumbersEN.put("eighteen", 18);
		wordNumbersEN.put("nineteen", 19);
		wordNumbersEN.put("twenty", 20);
		wordNumbersEN.put("thirty", 30);
		wordNumbersEN.put("forty", 40);
		wordNumbersEN.put("fifty", 50);
		wordNumbersEN.put("sixty", 60);
		wordNumbersEN.put("seventy", 70);
		wordNumbersEN.put("eighty", 80);
		wordNumbersEN.put("ninety", 90);
		wordNumbersEN.put("hundred", 100);
		wordNumbersEN.put("thousand", 1000);
		wordNumbersEN.put("million", 1000000);
		wordNumbersEN.put("billion", 1000000000);

		numberWordsTR.put(0, "sıfır");
		numberWordsTR.put(1, "bir");
		numberWordsTR.put(2, "iki");
		numberWordsTR.put(3, "üç");
		numberWordsTR.put(4, "dört");
		numberWordsTR.put(5, "beş");
		numberWordsTR.put(6, "altı");
		numberWordsTR.put(7, "yedi");
		numberWordsTR.put(8, "sekiz");
		numberWordsTR.put(9, "dokuz");
		numberWordsTR.put(10, "on");
		numberWordsTR.put(20, "yirmi");
		numberWordsTR.put(30, "otuz");
		numberWordsTR.put(40, "kırk");
		numberWordsTR.put(50, "elli");
		numberWordsTR.put(60, "altmış");
		numberWordsTR.put(70, "yetmiş");
		numberWordsTR.put(80, "seksen");
		numberWordsTR.put(90, "doksan");
		numberWordsTR.put(100, "yüz");
		numberWordsTR.put(1000, "bin");
		numberWordsTR.put(1000000, "milyon");
		numberWordsTR.put(1000000000, "milyar");

		numberWordsEN.put(0, "zero");
		numberWordsEN.put(1, "one");
		numberWordsEN.put(2, "two");
		numberWordsEN.put(3, "three");
		numberWordsEN.put(4, "four");
		numberWordsEN.put(5, "five");
		numberWordsEN.put(6, "six");
		numberWordsEN.put(7, "seven");
		numberWordsEN.put(8, "eight");
		numberWordsEN.put(9, "nine");
		numberWordsEN.put(10, "ten");
		numberWordsEN.put(11, "eleven");
		numberWordsEN.put(12, "twelve");
		numberWordsEN.put(13, "thirteen");
		numberWordsEN.put(14, "fourteen");
		numberWordsEN.put(15, "fifteen");
		numberWordsEN.put(16, "sixteen");
		numberWordsEN.put(17, "seventeen");
		numberWordsEN.put(18, "eighteen");
		numberWordsEN.put(19, "nineteen");
		numberWordsEN.put(20, "twenty");
		numberWordsEN.put(30, "thirty");
		numberWordsEN.put(40, "forty");
		numberWordsEN.put(50, "fifty");
		numberWordsEN.put(60, "sixty");
		numberWordsEN.put(70, "seventy");
		numberWordsEN.put(80, "eighty");
		numberWordsEN.put(90, "ninety");
		numberWordsEN.put(100, "hundred");
		numberWordsEN.put(1000, "thousand");
		numberWordsEN.put(1000000, "million");
		numberWordsEN.put(1000000000, "billion");
		
		
	}

	
	@Override
	public  int convertTextToNumber(String input) {
		HashMap<String, Integer> numberWords = new HashMap<String, Integer>();
	    if (locale.getLanguage().equals("tr")) {
	    	numberWords = wordNumbersTR;
	    } else {
	    	numberWords = wordNumbersEN;
	    }

	    int total = 0;
	    int currentNumber = 0;
	    String[] words = input.split("\\s+");
	    for (String word : words) {
	        Integer value = numberWords.get(word);
	        if (value != null) {
	            if (value == 100) {
	                currentNumber *= value;
	            } else if (value < 100) {
	                currentNumber += value;
	            } else {
	                currentNumber *= value;
	                total += currentNumber;
	                currentNumber = 0;
	            }
	        } else {
	            return -1;
	        }
	    }
	    return total + currentNumber;
	}

	@Override
	public  String convertNumberToText(int number) {
	    HashMap<Integer, String> wordNumbers = new HashMap<Integer, String>();
	    if (locale.getLanguage().equals("tr")) {
	        wordNumbers = numberWordsTR;
	    } else {
	        wordNumbers = numberWordsEN;
	    }

	    if (number == 0) {
	        return wordNumbers.get(0);
	    }

	    StringBuilder resultBuilder = new StringBuilder();
	    if (number >= 1000000000) {
	        int billions = number / 1000000000;
	        resultBuilder.append(wordNumbers.get(billions)).append(" ").append(wordNumbers.get(1000000000));
	        number %= 1000000000;
	        if (number > 0) {
	            resultBuilder.append(" ");
	        }
	    }

	    if (number >= 1000000) {
	        int millions = number / 1000000;
	        resultBuilder.append(convertThreeDigitNumberToText(millions)).append(" ").append(wordNumbers.get(1000000));
	        number %= 1000000;
	        if (number > 0) {
	            resultBuilder.append(" ");
	        }
	    }

	    if (number >= 1000) {
	        int thousands = number / 1000;
	        resultBuilder.append(convertThreeDigitNumberToText(thousands)).append(" ").append(wordNumbers.get(1000));
	        number %= 1000;
	        if (number > 0) {
	            resultBuilder.append(" ");
	        }
	    }

	    if (number >= 100) {
	        int hundreds = number / 100;
	        resultBuilder.append(wordNumbers.get(hundreds)).append(" ").append(wordNumbers.get(100));
	        number %= 100;
	        if (number > 0) {
	            resultBuilder.append(" ");
	        }
	    }

	    if (number > 0) {
	        if (resultBuilder.length() > 0 && !locale.getLanguage().equals("tr")) {
	            resultBuilder.append("and ");
	        }

	        if (number < 20) {
	            resultBuilder.append(wordNumbers.get(number));
	        } else {
	            int tens = number / 10;
	            resultBuilder.append(wordNumbers.get(tens * 10));
	            int ones = number % 10;
	            if (ones > 0) {
	                resultBuilder.append(" ").append(wordNumbers.get(ones));
	            }
	        }
	    }

	    String result = resultBuilder.toString();
	    return result;
	}

	private String convertThreeDigitNumberToText(int number) {
		HashMap<Integer, String> wordNumbers = new HashMap<Integer, String>();
		if (locale.getLanguage().equals("tr")) {
			wordNumbers = numberWordsTR;
		} else {
			wordNumbers = numberWordsEN;
		}

		StringBuilder resultBuilder = new StringBuilder();
		if (number >= 100) {
			int hundreds = number / 100;
			resultBuilder.append(wordNumbers.get(hundreds)).append(" ").append(wordNumbers.get(100));
			number %= 100;
			if (number > 0) {
				resultBuilder.append(" ");
			}
		}

		if (number > 0) {
			if (resultBuilder.length() > 0 && !locale.getLanguage().equals("tr")) {
				resultBuilder.append("and ");
			}

			if (number < 20) {
				resultBuilder.append(wordNumbers.get(number));
			} else {
				int tens = number / 10;
				resultBuilder.append(wordNumbers.get(tens * 10));
				int ones = number % 10;
				if (ones > 0) {
					resultBuilder.append(" ").append(wordNumbers.get(ones));
				}
			}
		}

		return resultBuilder.toString();
	}

}