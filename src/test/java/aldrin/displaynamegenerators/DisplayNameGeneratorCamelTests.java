package aldrin.displaynamegenerators;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayNameGeneration(CamelCaseGenerator.class)
class DisplayNameGeneratorCamelTests {

    @Test
    void testBookInitialization() {
        //for demo
    }

    @Test
    void testBookSetTitle() {
        //for demo
    }

    @Test
    void testBookSetAuthor() {
        //for demo
    }

    @Test
    void testAuthorSetName() {
        //for demo
    }

    @Test
    void testBookAddAuthor() {
        //for demo
    }

    @Test
    void testBookRemoveAuthor() {
        //for demo
    }

}