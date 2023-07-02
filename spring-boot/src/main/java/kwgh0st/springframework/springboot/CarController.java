package kwgh0st.springframework.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {
    private List<Car> cars = new ArrayList<>();

    {
                cars.add(new Car(1, "BMW", "e46"));
                cars.add(new Car(2, "Chevrolet", "Cruze"));
                cars.add(new Car(3, "Opel", "Astra"));
                cars.add(new Car(4, "Skoda", "Superb"));
    }


    @RequestMapping("/cars")
    public List<Car> retrieveAllCars() {
        return cars;
    }
}
