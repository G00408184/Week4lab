package ie.atu.week4lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week4LabApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week4LabApplication.class, args);
    }

}
