package com.itheima.smartmed.langchain4j.rag.assist;


import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(wiringMode = AiServiceWiringMode.EXPLICIT, chatModel = "openAiChatModel")
public interface Assistant {

    String chat(String userMessage);
}
