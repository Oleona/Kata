import Parser.ParsingResult;
import Parser.ConverterResult;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersConverter {

    private static final String[] romeDigit = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] arabDigit = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final Map<String, Integer> romeArabMap = Stream.of(new Object[][]{
            {"I", 1},
            {"II", 2},
            {"III", 3},
            {"IV", 4},
            {"V", 5},
            {"VI", 6},
            {"VII", 7},
            {"VIII", 8},
            {"IX", 9},
            {"X", 10}
    }).collect(Collectors.toMap(p -> (String) p[0], p -> (Integer) p[1]));

    public static String convertArabicToRoman(Integer arabic) {
        StringBuilder resultArabToRome = new StringBuilder();
        for (int i = 0; i < arabDigit.length; i++) {
            while ((arabic - arabDigit[i]) >= 0) {
                arabic -= arabDigit[i];
                resultArabToRome.append(romeDigit[i]);
            }
        }
        return resultArabToRome.toString();
    }

    public static ConverterResult prepareDataForCalculation(ParsingResult parsingResult) {
        if (parsingResult.getOperand1().matches("\\d")) {
            return new ConverterResult(
                    Integer.parseInt(parsingResult.getOperand1()),
                    parsingResult.getOperationSign(),
                    Integer.parseInt(parsingResult.getOperand2()),
                    false
            );
        } else {
            int op1 = convertInputFromRomanToArabic(parsingResult.getOperand1());
            int op2 = convertInputFromRomanToArabic(parsingResult.getOperand2());
            String opSign = parsingResult.getOperationSign();

            return new ConverterResult(op1, opSign, op2, true);
        }
    }

    private static Integer convertInputFromRomanToArabic(String rome) {
        return romeArabMap.get(rome);
    }

}
