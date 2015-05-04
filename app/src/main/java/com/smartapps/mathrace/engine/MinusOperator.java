package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
public class MinusOperator implements Operator {
    private static final int PRIORITY = 1;
    private static final char SIGN = '-';

    @Override
    public int getPriority() {
        return PRIORITY;
    }

    @Override
    public int operationResult(int left, int right) {
        return left - right;
    }

    @Override
    public char getSign() {
        return SIGN;
    }
}
