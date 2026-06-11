package com.itheima.smartmed.langchain4j.rag;

import com.itheima.smartmed.langchain4j.rag.assist.MemoryChatAssistant;
import com.itheima.smartmed.langchain4j.rag.assist.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(3,"今天几号");
        System.out.println(answer);
    }
    @Autowired
    private MemoryChatAssistant memoryChatAssistant;

    @Test
    public void testUserMessage() {
        String answer = memoryChatAssistant.chat("我是环环");
        System.out.println(answer);

        String answer1 = memoryChatAssistant.chat("我18了");
        System.out.println(answer1);

        String answer2 = memoryChatAssistant.chat("我是谁");
        System.out.println(answer2);
    }

    @Test
    public void testV() {
        String answer1 = separateChatAssistant.chat2(10, "我是环环");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat2(10, "我是谁");
        System.out.println(answer2);
    }

    @Test
    public void testUserInfo() {
        String answer = separateChatAssistant.chat3(20, "我是谁，我多大了", "翠花", 18);
        System.out.println(answer);
    }
}