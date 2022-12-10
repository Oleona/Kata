package Parser;

public class ConverterResult {

    private int operand1;
    private String operationSign;
    private int operand2;
    private boolean isRoman;

    public int getOperand1(){
        return operand1;
    }
    public String getOperationSign(){
        return operationSign;
    }
    public int getOperand2(){
        return operand2;
    }
    public boolean getIsRoman(){
        return isRoman;
    }

    public ConverterResult(int operand1, String operationSign, int operand2, boolean isRoman) {
        this.operand1 = operand1;
        this.operationSign = operationSign;
        this.operand2 = operand2;
        this.isRoman = isRoman;
    }

}
