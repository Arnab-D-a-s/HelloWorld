package das.tech.helloworld.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@Component
@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping(value = "getHelloWorld")
    public ResponseEntity<String> getResponse(){
        log.info("This is it");
        return ResponseEntity.ok("Hello World");
    }
}
