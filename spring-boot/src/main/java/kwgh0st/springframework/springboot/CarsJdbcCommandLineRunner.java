package kwgh0st.springframework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarsJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CarsJdbcRepository carsJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        carsJdbcRepository.insert();
    }
}
