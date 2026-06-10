package com.itheima.smartmed.langchain4j.rag.assist;


import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
        chatModel = "openAiChatModel",
        chatMemoryProvider = "chatMemoryProviderSmartMed",
        tools = "appointmentTools"
)
public interface SmartMedAgent {

    @SystemMessage(fromResource = "smartmed-prompt-template.txt")
    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
