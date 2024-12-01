package net.ymurzio.displayresolution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DisplayResolutionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test void area() {
        DisplayResolutionApplication application = new DisplayResolutionApplication();
        String result = application.resolutionArea(1, 3);

        assertEquals(Integer.toString(3), result);
    }

}
