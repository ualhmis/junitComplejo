package junitenclase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(3)
    public void testA() {
        System.out.println("Test A");
    }

    @Test
    @Order(1)
    @Disabled
    public void testC() {
        System.out.println("Test C");
    }

    @Test
    @Order(2)
    public void testB() {
        System.out.println("Test B");
    }
}