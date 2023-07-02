package kwgh0st.springframework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarsJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY =
            """
            insert into cars (id, carBand, carModel)
            values (?, ?, ?)
            """;
    private static String DELETE_QUERY =
            """
            delete from cars where id=?
            """;
    private static String SELECT_QUERY =
            """
            select * from cars where id=?
            """;

    public void insert(Car car) {
        jdbcTemplate.update(INSERT_QUERY, car.getId(), car.getCarBand(), car.getCarModel());
    }

    public void deleteById(long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Car findById(long id) {
         return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Car.class), id);
    }
}
