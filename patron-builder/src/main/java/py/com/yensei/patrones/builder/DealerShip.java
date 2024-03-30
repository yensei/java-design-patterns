package py.com.yensei.patrones.builder;

import py.com.yensei.patrones.builder.domain.CarType;
import py.com.yensei.patrones.builder.domain.Engine;

public class DealerShip {

    private static final int ENGINE_CAPACITY_2700 = 2700;
    private static final Integer ENGINE_CAPACITY_1200 = 1200;
    private static final Integer ENGINE_CAPACITY_5400 = 5400;

    public void createLuxuryCar(Builder builder) {
        builder.setCarType(CarType.LUXURY);
        Engine engine = new Engine(ENGINE_CAPACITY_2700);
        builder.setSeats(4);
        builder.setElectricCar(Boolean.TRUE);
        builder.setBatteries(2);
        builder.setConvertible(Boolean.TRUE);
        builder.setLeatherSeats(Boolean.TRUE);
        builder.setEngine(engine);
    }


    public void createSmallCar(Builder builder) {
        builder.setCarType(CarType.SMALL);

        Engine engine = new Engine(ENGINE_CAPACITY_1200);
        builder.setBatteries(1);
        builder.setEngine(engine);
        builder.setSeats(4);
        
    }

    public void createSportCar(Builder builder) {
        builder.setCarType(CarType.SPORT);

        Engine engine = new Engine(ENGINE_CAPACITY_5400);
        builder.setSeats(2);
        builder.setElectricCar(Boolean.TRUE);
        builder.setBatteries(2);
        builder.setConvertible(Boolean.TRUE);
        builder.setEngine(engine);
        
    }

}
