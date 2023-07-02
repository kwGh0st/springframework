package kwgh0st.springframework.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private List<Book> books = new ArrayList<>();

    {
        books.add(new Book(1, "TitleOne", "Author one"));
        books.add(new Book(2, "TitleTwo", "Author two"));
        books.add(new Book(3, "TitleThree", "Author three"));
        books.add(new Book(4, "TitleFour", "Author four"));

    }


    @RequestMapping("/books")
    public List<Book> retrieveAllBooks() {
        return books;
    }
}
