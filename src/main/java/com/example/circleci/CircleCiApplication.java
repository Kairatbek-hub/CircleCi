package com.example.circleci;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CircleCiApplication {

    @Value("${hello}")
    String hello;

    @Value("${database}")
    String database;

    @Value("${awsaccesskey}")
    String awsaccesskey;

    @Value("${awssecretkey}")
    String awssecretkey;

    public static void main(String[] args) {
        SpringApplication.run(CircleCiApplication.class, args);
    }
    @GetMapping("/")
    public String greeting(){
        return String.format("""
							<p> Hello world!</p>
							<img src = https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-XJbJcBxJX1wCJftGkEsuRs7HtUYU0xlvNQ&usqp=CAU>
				   			<p>%s ->(from code) hello</p>
				                <p>%s ->(from code) database</p>
				                <p>%s ->(from code) awsaccesskey</p>
				                <p>%s ->(from code) awssecretkey</p>
				                """, hello, database, awsaccesskey, awssecretkey);
    }
}
