package com.mcp.aidemo;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class controller {

    private final serviceClass service;

    @McpTool(name = "GreetByName", description = "This api greets the person with their given name.")
    @GetMapping("/api/greetName/{name}")
    public String greetingByName(@PathVariable String name) {
        String msg = service.sayName(name);
        return  msg;
    }

    @McpTool(name = "GreetBySurname", description = "This api greets the person with their given surname.")
    @GetMapping("/api/greetSurname/{surname}")
    public String greetingBySurname(@PathVariable String surname) {
        String msg = service.saySurname(surname);
        return  msg;
    }
}
