package Operations;

public class Division implements IMathOperation {
    private int operand1;
    private int operand2;

    public Division(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public int processOperation() {
        return operand1 / operand2;
    }
}
