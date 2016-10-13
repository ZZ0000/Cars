package German;

import Main.PremiumCar;

/**
 * Created by semeykin on 12.10.2016.
 */
public class Audi extends GermanCar implements PremiumCar {
    interface NewCar{
        void newFunc();
    }

    @Override
    public void fastRade() {

    }

    @Override
    public void morePrice() {

    }

    @Override
    public void slowRide() {

    }

    @Override
    public void crash() {

    }

    @Override
    public void koefStop() {

    }

    @Override
    public void cheaperPrice() {

    }

    public Audi(int year) {
        super(year);
    }
}
