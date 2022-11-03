package com.example.circleci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CircleCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleCiApplication.class, args);
    }
    @GetMapping("/")
    public String greeting(){
        return """
				<p> Hello world!</p>
				<img src = https://natureconservancy-h.assetsadobe.com/is/image/content/dam/tnc/nature/en/photos/WOPA160517_D056-resized.jpg?crop=864%2C0%2C1728%2C2304&wid=600&hei=800&scl=2.88>
				 """;
    }
}
