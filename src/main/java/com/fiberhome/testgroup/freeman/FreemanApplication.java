package com.fiberhome.testgroup.freeman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FreemanApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreemanApplication.class, args);
    }

}
