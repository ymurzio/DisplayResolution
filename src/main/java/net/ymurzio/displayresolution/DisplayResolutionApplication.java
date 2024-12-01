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
    public String resolutionArea(@RequestParam(value = "width") int width, @RequestParam(value = "height") int height) {
        return Integer.toString(width * height);
    }
}
