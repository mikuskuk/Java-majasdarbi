package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        int divideByZero = 13 / 0;
    }

    public void methodB() throws ArithmeticException {
        methodC();
    }

    public void methodC() throws ArithmeticException {
        try {
            int divideByZero = 13 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        Exercise2 exercise = new Exercise2();

        try {
            exercise.methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            exercise.methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
