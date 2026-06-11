package com.itheima.smartmed.langchain4j.rag.controller;


import com.itheima.smartmed.langchain4j.rag.assist.SmartMedAgent;
import com.itheima.smartmed.langchain4j.rag.bean.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@Tag(name="SmartMed")
@RestController
@RequestMapping("/smartmed")
public class SmartMedController {

    @Autowired
    private SmartMedAgent smartMedAgent;

    @Operation(summary = "chat")
    @PostMapping(value = "/chat", produces = "text/stream;charset=utf-8")
    public Flux<String> chat(@RequestBody ChatForm chatForm) {
        return smartMedAgent.chat(chatForm.getMemoryId(), chatForm.getMessage());
    }

}
