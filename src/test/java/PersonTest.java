import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p = new Person("James" , "12312123");
        assertEquals("James","12312123" , p.getName());
    }
}