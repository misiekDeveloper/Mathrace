package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
public class DivisionOperator implements Operator {
    private static final int PRIORITY = 2;
    private static final char SIGN = '/';
    @Override
    public int getPriority() {
        return PRIORITY;
    }

    @Override
    public int operationResult(int left, int right) {
        return left / right;
    }

    @Override
    public char getSign() {
        return SIGN;
    }
}
