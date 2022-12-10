import Parser.ConverterResult;
import Operations.*;

public class Calculator {

    public IMathOperation chooseOperationType(ConverterResult data) throws Exception {
        switch (data.getOperationSign()) {
            case "+":
                return new Addition(data.getOperand1(), data.getOperand2());
            case "-":
                if (data.getOperand1() <= data.getOperand2() && data.getIsRoman()) {
                    throw new Exception("No negative numbers and zero in the Roman numeral system. Subtraction is not possible");
                }
                return new Subtraction(data.getOperand1(), data.getOperand2());
            case "*":
                return new Multiplication(data.getOperand1(), data.getOperand2());
            case "/":
                if (data.getOperand1() < data.getOperand2() && data.getIsRoman()) {
                    throw new Exception("No zero number in the Roman numeral system. Division is not possible");
                }
                return new Division(data.getOperand1(), data.getOperand2());
            default:
                return null;
        }
    }
}
