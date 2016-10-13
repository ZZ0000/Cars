package Main;

import java.util.Random;

/**
 * Created by semeykin on 12.10.2016.
 */
public abstract class Car {
    private String developer;
    protected int year;
    protected int Price = 10000;
    protected double fuelConsumption = 10.9391913931913;
    private boolean inMove = false;
    protected String numberCar;
    private Random random = new Random();

    protected String getDeveloper() {
        return developer;
    }

    protected String getBrand() {
        return null;
    }

    protected String getNumberCar(){
        return numberCar;
    }

    protected boolean go() {
        return true;
    }

    int getYear() {
        return year;
    }

    protected void start() {
        inMove = true;
        System.out.println("Start!");
    }

    public Car(int year, String number) {
        int digital1 = random.nextInt(9);
        int digital2 = random.nextInt(9);
        int digital3 = random.nextInt(9);
        int digital4 = random.nextInt(9);

        this.year = year;
        this.numberCar = number + digital1 + digital2 + digital3 + digital4;
    }

    protected void stop() {
        inMove = false;
        System.out.println("Stop");
    }

    protected boolean getInMove(){
        return inMove;
    }
}
