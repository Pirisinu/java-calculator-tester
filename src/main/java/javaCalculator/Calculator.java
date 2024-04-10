package javaCalculator;

public class Calculator {

    public float add(float num1, float num2){
        if (Float.isNaN(num1)|| Float.isNaN(num2)){
            throw new IllegalArgumentException("Invalid argument");
        }
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)){
            throw new IllegalArgumentException("Invalid argument: NaN");
        }
        return num1 - num2;
    }

    public float divide(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)){
            throw new IllegalArgumentException("Invalid argument: NaN");
        }
        if (num2 == 0.0f) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)){
            throw new IllegalArgumentException("Invalid argument: NaN");
        }
        return num1 * num2;
    }

}
