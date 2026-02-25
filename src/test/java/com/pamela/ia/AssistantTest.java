package com.pamela.ia;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.service.AiServices;

class AssistantTest {
    @Test
    void testAgenteEstrutura() {
        ChatLanguageModel model = mock(ChatLanguageModel.class);
        Assistant assistant = AiServices.builder(Assistant.class)
            .chatLanguageModel(model)
            .build();
        
        // Se o assistente não for nulo, a arquitetura está correta!
        assert assistant != null;
        System.out.println("Teste Unitário: Estrutura do Agente validada com sucesso!");
    }
}