package kwgh0st.springframework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarsJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CarsJdbcRepository carsJdbcRepository;
    @Autowired
    private CarController controller;

    @Override
    public void run(String... args) throws Exception {
        for (Car car : controller.retrieveAllCars()) {
            carsJdbcRepository.insert(car);
        }

        carsJdbcRepository.deleteById(2);
    }
}
