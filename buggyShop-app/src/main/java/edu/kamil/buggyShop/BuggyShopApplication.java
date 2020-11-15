package edu.kamil.buggyShop;


import edu.kamil.buggyShop.persistance.MyService;
import edu.kamil.buggyShop.persistance.model.Article;
import edu.kamil.buggyShop.persistance.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@SpringBootApplication

public class BuggyShopApplication {

    private final MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(BuggyShopApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

}
