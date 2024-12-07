package net.ymurzio.displayresolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DisplayResolutionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisplayResolutionApplication.class, args);
    }

    @GetMapping("/resolution_area")
    public String resolutionArea(@RequestParam(value = "width") int width,
                                 @RequestParam(value = "height") int height) {
        return Integer.toString(width * height);
    }

    @GetMapping("/aspect_ratio")
    public String aspectRatio(@RequestParam(value = "width") int width,
                              @RequestParam(value = "height") int height) {
        if (width == 0 || height == 0) {
            return "0:0";
        }

        int gcd = greatestCommonDivisor(width, height);

        return width / gcd + ":" + height / gcd;
    }

    /**
     * Greatest Common Divisor
     * It is preferred but not necessary to have the smaller number first.
     * The exception is when 1 of the arguments is 0.
     * If zero is first it will return 0. Otherwise, it will return the non-zero number.
     * @param alpha First number. Order doesn't matter.
     * @param bravo Second number. Order doesn't matter.
     * @return Returns the Greatest Common Divisor between the first & second numbers.
     */
    private int greatestCommonDivisor(int alpha, int bravo) {
        if (alpha == 0 && bravo == 0) {return 0;}
        if (bravo < 1) {return Math.max(alpha, -alpha);}
        return greatestCommonDivisor(bravo, alpha % bravo);
    }
}
