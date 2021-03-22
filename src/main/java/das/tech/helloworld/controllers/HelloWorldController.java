package das.tech.helloworld.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@Component
@RestController
public class HelloWorldController {

    @GetMapping(value = "getHelloWorld")
    public ResponseEntity getResponse(){
        return ResponseEntity.ok("Hello World");
    }
}
