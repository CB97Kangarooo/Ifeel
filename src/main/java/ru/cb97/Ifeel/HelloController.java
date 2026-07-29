package ru.cb97.Ifeel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String alive() {
        return "Hello, I feel like I'm alive!";
    }
}
