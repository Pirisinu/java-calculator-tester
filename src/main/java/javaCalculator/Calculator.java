package javaCalculator;

public class Calculator {

    public float add(float num1, float num2){
        if (Float.isNaN(num1)|| Float.isNaN(num2)){
            throw new IllegalArgumentException("Invalid argument");
        }
        return num1 + num2;
    }

}
