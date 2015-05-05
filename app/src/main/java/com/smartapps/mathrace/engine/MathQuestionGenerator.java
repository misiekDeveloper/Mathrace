package com.smartapps.mathrace.engine;

/**
 * Created by user on 2015-05-04.
 */
import java.util.Random;

public class MathQuestionGenerator {
    private Random numberGenerator;
    private Operator[] operator;
    private int min;
    private int max;

    public MathQuestionGenerator(long seed, QuestionType type, int min, int max) {
        this.numberGenerator = new Random(seed);
        this.operator = new Operator[]{questionTypeToOperator(type)};
        this.min = min;
        this.max = max;
    }
    public MathQuestionGenerator(long seed, QuestionType[] type, int min, int max) {
        this.numberGenerator = new Random(seed);
        this.operator = questionTypeToOperator(type);
        this.min = min;
        this.max = max;
    }
    public MathQuestion generate() {
        return new Equation(operator[numberGenerator.nextInt(operator.length)], getRandomNumber(), getRandomNumber());
    }

    private int getRandomNumber() {
        return ( min + numberGenerator.nextInt( max - min + 1 ) );
    }

    private Operator questionTypeToOperator(QuestionType type) {
        Operator operator = null;
        switch (type) {
            case ADD: operator = new PlusOperator();
                break;
            case SUBTRACT: operator = new MinusOperator();
                break;
            case MULTIPLY: operator = new MultiplyOperator();
                break;
            case DIVIDE: operator = new DivisionOperator();
                break;
        }
        return operator;
    }
    private Operator[] questionTypeToOperator(QuestionType[] type) {
        Operator[] tab = new Operator[type.length];
        for (int i=0; i<type.length; i++) {
            tab[i] = questionTypeToOperator(type[i]);
        }
        return tab;
    }
}
