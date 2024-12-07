package net.ymurzio.displayresolution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DisplayResolutionApplicationTests extends DisplayResolutionApplication {

    @Test
    void contextLoads() {
    }

    @Test
    void testMain() {
        DisplayResolutionApplication.main(new String[]{});
    }

    @Test void area() {
        DisplayResolutionApplication application = new DisplayResolutionApplication();

        String result = application.resolutionArea(1, 3);
        assertEquals(Integer.toString(3), result);

        String result1 = application.resolutionArea(1920, 1080);
        assertEquals(Integer.toString(2073600), result1);

        String result2 = application.resolutionArea(640, 480);
        assertEquals(Integer.toString(307200), result2);

        String result3 = application.resolutionArea(1680, 1050);
        assertEquals(Integer.toString(1764000), result3);

        String result4 = application.resolutionArea(2560, 1440);
        assertEquals(Integer.toString(3686400), result4);

        String result5 = application.resolutionArea(4096, 1714);
        assertEquals(Integer.toString(7020544), result5);

        String result6 = application.resolutionArea(0, 0);
        assertEquals(Integer.toString(0), result6);
    }

    @Test void aspect() {
        DisplayResolutionApplication application = new DisplayResolutionApplication();

        String result = application.aspectRatio(1, 3);
        assertEquals("1:3", result);

        String result2 = application.aspectRatio(640, 480);
        assertEquals("4:3", result2);

        String result3 = application.aspectRatio(1920, 1080);
        assertEquals("16:9", result3);

        String result4 = application.aspectRatio(0, 0);
        assertEquals("0:0", result4);

        String result5 = application.aspectRatio(50, 0);
        assertEquals("0:0", result5);

        String result6 = application.aspectRatio(0, 50);
        assertEquals("0:0", result6);
    }

}
