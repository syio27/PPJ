package z15.Problem2;

public class Car {
    private String make;
    private int price;

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                '}';
    }
}
