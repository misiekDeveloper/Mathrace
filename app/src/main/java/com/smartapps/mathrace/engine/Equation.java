package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
public class Equation implements MathQuestion {
    private Operator operator;
    private int operandLeft;
    private int operandRight;

    public Equation(Operator operator, int operandLeft, int operandRight) {
        this.operandLeft = operandLeft;
        this.operandRight = operandRight;
        this.operator = operator;
    }
    @Override
    public String showQuestion() {
        StringBuilder sb = new StringBuilder();
        sb.append(operandLeft);
        sb.append(operator.getSign());
        sb.append(operandRight);
        return sb.toString();
    }
    @Override
    public boolean check(int answer) {
        if(operator.operationResult(operandLeft, operandRight) == answer)
            return true;
        else
            return false;
    }
}
