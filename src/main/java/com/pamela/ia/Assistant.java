package com.pamela.ia;

import dev.langchain4j.service.SystemMessage;

public interface Assistant {
    @SystemMessage("Você é um assistente da CI&T especializado em projetos de IA.")
    String chat(String message);
}