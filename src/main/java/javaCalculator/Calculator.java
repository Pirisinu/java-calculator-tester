package javaCalculator;

public class Calculator {

    public float add(Float num1, Float num2){
        if (num1.isNaN()|| num2.isNaN()){
            throw new IllegalArgumentException("Invalid argument");
        } else return num1 + num2;
    }


}
