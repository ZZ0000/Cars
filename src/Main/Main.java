package Main;

import German.Audi;
import German.Bmw;
import Japan.Honda;
import Japan.JapanCar;
import Japan.Tayota;
import Russia.Lada;
import Russia.RussianCar;

import java.util.Random;

/**
 * Created by semeykin on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Car lada = new Lada(1989);
        Car bmw = new Bmw(1989);
        Car tayota = new Tayota(2005);


       carGo(lada);

      //  lada.go();
      //  infoCar(lada);
       // infoCar(bmw);
        //infoCar(tayota);

    }

    private static void carGo(Car car) {
        boolean nonStop = true;
        for (int i = 1; i <6 ; i++){
            nonStop = car.go();
            if (!nonStop){
                break;
            }

        }
        if (nonStop){
            System.out.println("Car win!");
        };
    }

    private static void infoCar(Car car){
        System.out.println("Developer: "+car.getDeveloper());
        System.out.println("Brand: "+car.getBrand());
        System.out.println("Year: "+car.getYear());
        System.out.println("Number car: "+car.getNumberCar());
    }

}
