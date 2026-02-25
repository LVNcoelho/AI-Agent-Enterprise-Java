# 🤖 AI Agent Enterprise - Java & LangChain4j

Este projeto demonstra a construção de um **Agente de IA** robusto utilizando **Java 17** e o framework **LangChain4j**. O objetivo é criar um assistente inteligente capaz de executar ferramentas personalizadas (Tools) e ser validado por testes automatizados.

## 🚀 Tecnologias Utilizadas
* **Java 17**: Linguagem base.
* **Maven**: Gestão de dependências e build.
* **LangChain4j**: Framework para integração com LLMs (OpenAI).
* **JUnit 5 & Mockito**: Testes unitários e mocking de comportamento.

## 🏗️ Estrutura do Projeto
O projeto segue o padrão Maven para garantir escalabilidade e organização:
* `src/main/java`: Contém a interface do Agente, as ferramentas (Tools) e a classe principal de configuração.
* `src/test/java`: Contém os testes unitários que garantem a integridade da arquitetura.

## 🛠️ Como Executar
1. Clone o repositório.
2. Configure sua chave da OpenAI no ambiente: `export OPENAI_API_KEY='sua_chave_aqui'`.
3. Execute o comando de build e teste:
   ```bash
   mvn clean compile test