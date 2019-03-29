package src.main.java.com.zpself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zengpeng on 2019/3/28
 */
@SpringBootApplication
@RestController
public class SpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
   /* @GetMapping("/hello")
    public String hello(){
        return "hello萨达萨达撒  ";
    }*/
}
