package Operations;

public class Addition implements IMathOperation {
    private int operand1;
    private int operand2;

    public Addition(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public int processOperation() {
        return operand1 + operand2;
    }
}
