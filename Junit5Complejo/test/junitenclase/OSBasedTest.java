package junitenclase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;

class OSBasedTest {

    @Test
    void testBasedOnOSLinux() {
        boolean isLinux = System.getProperty("os.name").contains("Linux");

        Assumptions.assumingThat(isLinux, 
            () -> System.out.println("Running Linux-specific test")
        );
    }
    
    @Test
    void testBasedOnOSWindows() {
        boolean isWindows = System.getProperty("os.name").contains("Windows");

        Assumptions.assumingThat(isWindows, 
            () -> System.out.println("Running Windows-specific test")
        );
    }

}