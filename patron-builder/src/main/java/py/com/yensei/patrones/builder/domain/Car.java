package py.com.yensei.patrones.builder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Car {

  private  CarType carType;
  private  Integer seats;
  private  Integer bigWheels;
  private  Engine  engine;
  private  Boolean leatherSeats;
  private  Integer batteries;
  private  Boolean convertible;
  private  Boolean electricCar;

}
