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

//    …or create a new repository on the command line
//    echo "# cicdwithgithub-action-demo" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin git@github.com:atumar4031/cicdwithgithub-action-demo.git
//    git push -u origin main

}
