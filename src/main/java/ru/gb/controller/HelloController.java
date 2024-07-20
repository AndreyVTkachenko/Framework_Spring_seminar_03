package ru.gb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // GET http://localhost:8080/hello
    @GetMapping("/hello")
    public String helloPage() {
        return """
                <h1>Hello World!</h1>
                <h2>I'm testing my new application.</h2>
                <h3>Works great!</h3>
                """;
    }

    // GET http://localhost:8080/home
    @GetMapping("/home")
    public String homePage() {
        return "Home page";
    }

    // GET http://localhost:8080/user
    @GetMapping("/user")
    public String helloUserPage(@RequestParam String username) {
        return "<h1>Hello, " + username + "!</h1>";
    }

    // GET http://localhost:8080/people/Andrew
    // GET http://localhost:8080/people/Alex
    @GetMapping("/people/{username}")
    public String helloPagePathVariable(@PathVariable String username) {
        return "<h1>Hello, " + username + "!</h1>";
    }
}
