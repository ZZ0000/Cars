package Russia;

import Main.Car;
import Main.CheapCar;
import Main.OldCar;

import java.util.Random;

/**
 * Created by semeykin on 12.10.2016.
 */
public abstract class RussianCar extends Car implements OldCar, CheapCar {
    final static String DEVELOPER = "Russia";
    final static double K_STOP_OLD = 0.67;

    public RussianCar(int year) {
        super(year, "RU");
    }

    @Override
    public String getDeveloper() {
        return this.DEVELOPER;
    }

    @Override
    public String getBrand() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean go() {
        if (! getInMove()) {
            start();
        }
        if (! getInMove()){
            return false;
        }
        double koefStop = K_STOP;
        if (year < 1990) {
            koefStop = K_STOP_OLD;
        }
        Random random = new Random();

        int x = (int) random.nextInt(99) + 1;
        if (x < koefStop * 100) {
            System.out.println("GO!");
        } else {
            stop();
            return false;
        }

        return true;
    }

    @Override
    protected void start() {
        Random r = new Random();
        int koef = year < 1990 ? 80 : 95;
        super.start();
        if (r.nextInt(100) > koef ){
            System.out.println("Not start!");
            stop();
        }
    }
}
