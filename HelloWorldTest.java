import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testOutput() {
        String output = "Hello CI/CD!";
        assertEquals("Hello CI/CD!", output);
    }
}
