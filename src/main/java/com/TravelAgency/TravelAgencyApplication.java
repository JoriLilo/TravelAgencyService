package com.TravelAgency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

//@ComponentScan("thymeleaf")
public class TravelAgencyApplication {


        public static void main(String[] args) {
            var context= SpringApplication.run(TravelAgencyApplication.class, args);




        }


}
