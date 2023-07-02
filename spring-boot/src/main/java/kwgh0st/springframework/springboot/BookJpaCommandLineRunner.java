package kwgh0st.springframework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    BookJpaRepository bookJpaRepository;
    @Autowired
    BookController controller;
    @Override
    public void run(String... args) throws Exception {
        for (Book book : controller.retrieveAllBooks()) {
            bookJpaRepository.save(book);
        }

        bookJpaRepository.deleteById(1L);

        System.out.println(bookJpaRepository.findById(2L));
        System.out.println(bookJpaRepository.findById(3L));
    }
}
