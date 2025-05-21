package junitenclase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.Assumptions;

class AssumptionTest {

    @Test
    void testOnlyOnLinux() {
        Assumptions.assumeTrue(System.getProperty("os.name").contains("Linux"),
                "Test ignored because it's not running on Linux");

        // Código de prueba que solo se ejecutará en Linux
        System.out.println("Running test on Linux");
    }
    
    
    @Test
    void testNotOnMac() {
        Assumptions.assumeFalse(System.getProperty("os.name").contains("Mac"),
                "Test ignored because it's running on Mac");

        // Código de prueba
        System.out.println("Running test on non-Mac system");
    }

    
    @Test
    void testWithAssumingThat() {
        int value = 32;
        
        Assumptions.assumingThat(value > 40, () -> {
            System.out.println("Executing additional assertions because value is greater than 40");
        });

        // Esta parte del test siempre se ejecuta
        System.out.println("This will always run");
    }

}
