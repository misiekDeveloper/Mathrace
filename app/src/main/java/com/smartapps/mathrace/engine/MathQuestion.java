package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
public interface MathQuestion {
    String showQuestion();
    boolean check(int answer);
}
