package javaCalculator;

public class Tiket {
    // Attributes
    private int kilometers;
    private int age;

    // Constructor
    public Tiket(int kilometers, int age) {
        if (kilometers <= 0 || age <= 0) {
            throw new IllegalArgumentException("Kilometers and age must be positive numbers.");
        }
        this.kilometers = kilometers;
        this.age = age;
    }

    // Getter e Setter
    // Methods

}
