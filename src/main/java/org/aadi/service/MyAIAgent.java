package org.aadi.service;


import dev.langchain4j.service.spring.AiService;

@AiService
public interface MyAIAgent {

    String chat(String message);
}