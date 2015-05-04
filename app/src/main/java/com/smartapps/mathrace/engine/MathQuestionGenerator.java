package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
import java.util.Random;

public class MathQuestionGenerator {
    private Random numberGenerator;
    private QuestionType questionType;
    private int min;
    private int max;

    public MathQuestionGenerator(long seed, QuestionType questionType, int min, int max) {
        this.numberGenerator = new Random(seed);
        this.questionType = questionType;
        this.min = min;
        this.max = max;
    }
    public MathQuestion generate() {
        switch(questionType) {
            case ADD: ;break;
            case MULTIPLY: ;break;
            case SUBTRACT: ;break;
            case DEVIDE: ;break;
        }
        return null;
    }

}
