package link.attech.cicdwithgithubactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdWithGithubActionDemoApplication {
    @GetMapping("/message")
    public String getWelcome(){
        return "Welcome to attech";
    }
    public static void main(String[] args) {
        SpringApplication.run(CicdWithGithubActionDemoApplication.class, args);
    }

}
