package javaCalculator;

public class Ticket {
    // Attributes
    private int kilometers;
    private int age;

    // Constructor
    public Ticket(int kilometers, int age) {
        if (kilometers <= 0 || age <= 0) {
            throw new IllegalArgumentException("Kilometers and age must be positive numbers.");
        }
        this.kilometers = kilometers;
        this.age = age;
    }
    // Methods
    public double calculatePrice(){
        final double tiketPriceKM = 0.21;
        int discount = 0;
        if(this.age < 18){
            discount = 20;
        } else if (this.age > 65) {
            discount = 50;
        }
        double discountValue = (this.kilometers * tiketPriceKM) * (discount / 100.0);
        double priceTiket = (this.kilometers * tiketPriceKM) - discountValue;
        return priceTiket;
    }

}
