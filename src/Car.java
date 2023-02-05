public class Car {

    public String model;
    public double price;


    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void start() {
        System.out.println(model + " has started");
    }

    public void move() {
        System.out.println(model + " is moving");
    }

    public void stop() {
        System.out.println(model + " has stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
