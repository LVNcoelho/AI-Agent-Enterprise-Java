package com.pamela.ia;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

public class Main {
    public static void main(String[] args) {
        String apiKey = System.getenv("OPENAI_API_KEY");

        Assistant assistant = AiServices.builder(Assistant.class)
            .chatLanguageModel(OpenAiChatModel.withApiKey(apiKey))
            .tools(new ServiceTools())
            .build();

        System.out.println("Agente Pronto! Pergunte algo sobre projetos.");
    }
}