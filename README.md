# 🤖 AI Agent Enterprise - Java & LangChain4j

Este projeto demonstra a construção de um **Agente de IA de nível corporativo** utilizando o ecossistema moderno de **Java 17**. O foco principal é a orquestração de LLMs através do framework **LangChain4j**, permitindo que a inteligência artificial execute ações reais em sistemas Java.

---

## 🏗️ Arquitetura do Sistema

A arquitetura foi desenhada seguindo princípios de **baixo acoplamento** e **alta coesão**:

* **Interface Declarativa (`Assistant.java`)**: Define o contrato do serviço de IA, abstraindo a complexidade da comunicação com a API.
* **Function Calling (`ServiceTools.java`)**: Implementação de ferramentas via anotação `@Tool`, permitindo que a IA consulte dados em tempo real (RAG) e tome decisões baseadas em lógica de negócio.
* **Orquestração (`Main.java`)**: Configuração centralizada do modelo (OpenAI) e injeção de dependências.

---

## 🚀 Tecnologias e Conceitos Aplicados

* **Java 17**: Utilização de recursos modernos para garantir robustez e performance.
* **LangChain4j**: Orquestrador líder para integração nativa de LLMs em Java.
* **Maven**: Automação de build e gestão de dependências.
* **SDKMAN**: Gerenciamento rigoroso de versões do JDK no ambiente de desenvolvimento.
* **Qualidade (JUnit 5 & Mockito)**: Validação da lógica do Agente através de testes automatizados, garantindo previsibilidade no comportamento da IA.

---

## 🛠️ Como rodar o projeto

1.  **Pré-requisitos**: Ter o Java 17 configurado (recomenda-se uso do SDKMAN).
2.  **Configuração da API**: Definir a variável de ambiente:
    `export OPENAI_API_KEY='sua_chave_aqui'`
3.  **Compilação e Testes**:
    ```bash
    mvn clean install
    mvn test
    ```

---

## 💡 Diferenciais Técnicos
Este projeto não é apenas um "chatbot". Ele implementa:
1.  **Function Calling**: A IA identifica sozinha quando precisa acionar um método Java para resolver um problema.
2.  **Arquitetura Extensível**: É simples adicionar novas ferramentas ao Agente sem alterar o núcleo do sistema.
3.  **Build Reproduzível**: Estrutura preparada para ambientes de Integração Contínua (CI).