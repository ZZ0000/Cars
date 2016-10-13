package Main;

/**
 * Created by semeykin on 12.10.2016.
 */
public interface CheapCar {
    final static double koefFuelConsumption = 1.5;
    final static double koefPrice = 0.5;
    final static double K_STOP = 0.91;

    void koefStop();
    void cheapPrice();
    void moreFuelConsumption();

}
