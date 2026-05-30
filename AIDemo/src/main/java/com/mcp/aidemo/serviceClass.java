package com.mcp.aidemo;

import org.springframework.ai.mcp.annotation.McpTool;

import org.springframework.stereotype.Service;

@Service
public class serviceClass {

    @McpTool(name = "Service", description = "This api greets the person with their given name.")
    public String sayName(String name) {
        String s = "Hello AI Service from : " + name;
        return s;
    }

    public String saySurname(String surname) {
        String s = "Hello AI Service from : " + surname;
        return s;
    }
}
