package com.pamela.ia;

import dev.langchain4j.agent.tool.Tool;

public class ServiceTools {
    @Tool("Consulta o status de um projeto específico")
    public String consultarStatus(String nomeProjeto) {
        return "O projeto " + nomeProjeto + " está em dia e seguindo o cronograma da CI&T.";
    }
}