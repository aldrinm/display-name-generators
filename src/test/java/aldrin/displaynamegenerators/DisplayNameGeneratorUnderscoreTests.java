package aldrin.displaynamegenerators;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DisplayNameGeneratorUnderscoreTests {

    @Test
    void test_book_initialization() {
        //for demo
    }

    @Test
    void test_book_set_title() {
        //for demo
    }

    @Test
    void test_book_set_author() {
        //for demo
    }

    @Test
    void test_author_set_name() {
        //for demo
    }

    @Test
    void test_book_add_author() {
        //for demo
    }

    @Test
    void test_book_remove_author() {
        //for demo
    }


}
