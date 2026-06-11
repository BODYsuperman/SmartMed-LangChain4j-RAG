package com.itheima.smartmed.langchain4j.rag.config;

import dev.langchain4j.http.client.jdk.JdkHttpClientBuilder;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.ollama.OllamaEmbeddingModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OllamaConfig {

    @Bean
    public EmbeddingModel embeddingModel() {

        return OllamaEmbeddingModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("qwen3-embedding:latest")
                .httpClientBuilder(new JdkHttpClientBuilder())
                .build();
    }

}