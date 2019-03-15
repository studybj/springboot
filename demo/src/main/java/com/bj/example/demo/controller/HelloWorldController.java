package com.bj.example.demo.controller;
import com.bj.example.demo.util.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @Value("${cupSize}")
    private String cupSize;

    @Value("${height}")
    private String height;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/properties", method = RequestMethod.GET)
    public String displayProperties() {
        return girlProperties.getCupSize() + girlProperties.getHeight();
    }

    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public String display() {
        return "cupSize=" + cupSize + ", height=" + height;
    }

    @RequestMapping(value = "/content", method = RequestMethod.GET)
    public String displayContent() {
        return content;
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }


}
