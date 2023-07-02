package kwgh0st.springframework.springboot;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonJpaRepository {
    @Autowired
    private EntityManager entityManager;

    public void insert(Person person) {
        entityManager.merge(person);
    }

    public Person findById(long id) {
        return entityManager.find(Person.class, id);
    }

    public void deleteById(long id) {
        Person person = findById(id);
        entityManager.remove(person);
    }
}
