package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
public class PlusOperator implements Operator {
    private static final int PRIORITY = 1;
    private static final char SIGN = '+';

    @Override
    public int getPriority() {
        return PRIORITY;
    }

    @Override
    public int operationResult(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    @Override
    public char getSign() {
        return SIGN;
    }
}
