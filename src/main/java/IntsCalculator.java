public class IntsCalculator implements Ints {

    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();

    }

    private int calculation(int a, int b, Calculator.Operation operation) {
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(operation)
                .result();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calculation(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int sub(int arg0, int arg1) {
        return calculation(arg0, arg1, Calculator.Operation.SUB);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calculation(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public double div(double a, double b) {
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return calculation(a, b, Calculator.Operation.POW);
    }

}