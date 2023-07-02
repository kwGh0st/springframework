package kwgh0st.springframework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarsJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY =
            """
            insert into cars (id, carBand, carModel)
            values (1, 'BMW', 'e90')
            """;

    public void insert() {
        jdbcTemplate.update(INSERT_QUERY);
    }
}
