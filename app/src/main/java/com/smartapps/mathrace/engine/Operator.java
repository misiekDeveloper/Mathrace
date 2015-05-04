package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
public interface Operator {
    int getPriority();
    int operationResult(int left, int right);
    char getSign();
}
