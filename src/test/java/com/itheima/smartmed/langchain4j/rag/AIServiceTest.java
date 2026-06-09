package com.itheima.smartmed.langchain4j.rag;


import com.itheima.smartmed.langchain4j.rag.assist.Assistant;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AIServiceTest {


    @Autowired
    private OpenAiChatModel openAiChatModel;

    @Autowired
    private Assistant assistant;
    @Test
    public void testChat() {
        //创建AIService
        Assistant assistant = AiServices.create(Assistant.class, openAiChatModel);
        //调用service的接口
        String answer = assistant.chat("Hello, how many parameters do you have, what can you do?");
        System.out.println(answer);
    }

    @Test
    public void testChatq() {


        String answer = assistant.chat("Hello, how many parameters do you have, what can you do?");
        System.out.println(answer);
    }
}
