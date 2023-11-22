package projeto.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = "projeto.spring.rest.controller")
public class vendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(vendasApplication.class, args);
    }
 }
