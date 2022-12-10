import Parser.InputParser;
import Parser.ConverterResult;
import Parser.ParsingResult;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.print("Input a pair of Roman or Arabic operands and an operation sign in the format: " +
                "\noperand1 space getOperationSign space operand2:\n ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toUpperCase();

        ParsingResult parsedInput = InputParser.parse(input);
        ConverterResult preparedData = NumbersConverter.prepareDataForCalculation(parsedInput);

        Calculator calculator = new Calculator();
        var operationType = calculator.chooseOperationType(preparedData);
        var operationResult = operationType.processOperation();

        if (preparedData.getIsRoman()) {
            System.out.println(NumbersConverter.convertArabicToRoman(operationResult));
        } else {
            System.out.println(operationResult);
        }

    }
}
