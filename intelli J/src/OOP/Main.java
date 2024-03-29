import OOP.Car;

public class Main {
    public static void main (String[] args) {
        Car dodge = new Car("dodge", "SRT", "black", 2);
        Car mustang = new Car("Ford", "Mustang", "silver", 2);

        dodge.move();

        System.out.println("\n");

        mustang.move();

        System.out.println("\n");

        displyCarDetails(dodge);
    }

    public static void displyCarDetails(Car car) {
        System.out.println("The " + car.getName() + " has: color - " + car.getColor() + ", model - " + car.getModel() + ", and " + car.getDoors() + " doors");

        car.move();
    }
}