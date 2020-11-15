package edu.kamil.buggyShop;


import edu.kamil.buggyShop.persistance.MyService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@SpringBootApplication(scanBasePackages = "edu.kamil.buggyShop")
public class BuggyShopApplication {

    private final MyService myService;

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(BuggyShopApplication.class, args);
    }

}
