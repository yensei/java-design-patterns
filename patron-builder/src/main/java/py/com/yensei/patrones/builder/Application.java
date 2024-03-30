package py.com.yensei.patrones.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import py.com.yensei.patrones.builder.domain.Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		DealerShip dealerShip = new DealerShip();

		CarBuilder builder = new CarBuilder();
		dealerShip.createSportCar(builder);

		Car car = builder.getCar();
		System.out.println("Mi tipo de auto : " + car.getCarType() );

	}

}
