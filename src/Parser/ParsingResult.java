package Parser;

public class ParsingResult {
    private String operand1;
    private String operationSign;
    private String operand2;

    public String getOperand1(){
        return operand1;
    }
    public String getOperationSign(){
        return operationSign;
    }
    public String getOperand2(){
        return operand2;
    }

    public ParsingResult(String operand1, String operationSign, String operand2) {
        this.operand1 = operand1;
        this.operationSign = operationSign;
        this.operand2 = operand2;
    }



}
