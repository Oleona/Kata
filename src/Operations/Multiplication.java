package Operations;

public class Multiplication implements IMathOperation {
    private int operand1;
    private int operand2;

    public Multiplication(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public int processOperation() {
        return operand1 * operand2;
    }
}
