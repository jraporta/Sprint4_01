package cat.itacademy.s04.t01.n02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {


    @GetMapping("/HelloWorld")
    @ResponseBody
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hello " + name + ". You are executing a Gradle project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    @ResponseBody
    public String greet2(String name){
        return "Hello " + (name == null ? "UNKNOWN" : name) + ". You are executing a Gradle project.";
    }



}