package kwgh0st.springframework.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {

    @RequestMapping("/cars")
    public List<Car> retrieveAllCars() {
        return Arrays.asList(
                        new Car(1, "BMW", "e46"),
                        new Car(2, "Chevrolet", "Cruze"),
                        new Car(3, "Opel", "Astra"),
                        new Car(4, "Skoda", "Superb")
        );
    }
}
