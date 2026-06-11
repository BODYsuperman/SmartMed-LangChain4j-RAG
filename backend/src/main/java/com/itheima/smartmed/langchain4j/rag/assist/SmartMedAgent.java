package com.itheima.smartmed.langchain4j.rag.assist;


import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
//        chatModel = "openAiChatModel",
        chatMemoryProvider = "chatMemoryProviderSmartMed",
        streamingChatModel = "openAiStreamingChatModel",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverSmartMedPincone"
)
public interface SmartMedAgent {

    @SystemMessage(fromResource = "smartmed-prompt-template1.txt")
    Flux<String> chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
