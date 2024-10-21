package cat.itacademy.s04.t01.n01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    @ResponseBody
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hello " + name + ". You're running a Maven project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    @ResponseBody
    public String greet2(@PathVariable(required = false) String name){
        return "Hello " + (name == null ? "UNKNOWN" : name) + ". You're running a Maven project.";
    }

}
