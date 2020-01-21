package com.yagna.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1App {

    private  static final Logger logger = LoggerFactory.getLogger(Module1App.class);
    public static void main(String[] args) {


        logger.warn("Before Starting Spring boot App");
        SpringApplication.run(Module1App.class, args);
        logger.warn("After Starting Spring boot App");
    }


}
