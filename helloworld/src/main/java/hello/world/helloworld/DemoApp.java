package hello.world.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApp {
    public static void maind(String[] args){
        SpringApplication.run(DemoApp.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }
}
