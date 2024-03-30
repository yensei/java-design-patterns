package py.com.yensei.patrones.builder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import py.com.yensei.patrones.builder.domain.Car;
import py.com.yensei.patrones.builder.domain.CarType;
import py.com.yensei.patrones.builder.domain.Engine;

@AllArgsConstructor @NoArgsConstructor
public class CarBuilder implements Builder {

    private Integer seats;
    private CarType carType;
    private Integer bigWheels;
    private Engine engine;
    private Boolean leatherSeats;
    private Integer batteries;
    private Boolean convertible;
    private Boolean electricCar;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public void setWheels(int wheels) {
        this.bigWheels = wheels;
    }
    @Override
    public void setLeatherSeats(Boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }
    @Override
    public void setBatteries(int batteries) {
        this.batteries = batteries;
    }
    @Override
    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }
    @Override
    public void setElectricCar(Boolean electricCar) {
        this.electricCar = electricCar;
    }

    public Car getCar(){
        return new Car(this.carType, this.seats, this.bigWheels, this.engine, this.leatherSeats,
            this.batteries, this.convertible, this.electricCar );
    } 

}
