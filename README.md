# Atividade Prática - Testes Unitários com JUnit (JUnit 4 + Maven)

👉 **Contexto Acadêmico:** Este projeto foi desenvolvido como atividade prática para a disciplina de **Qualidade de Software**, correspondente ao **4º Período** do curso de Análise e Desenvolvimento de Sistemas (ADS) da **Faculdade Senac**.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit 4](https://img.shields.io/badge/JUnit%204-25A162?style=for-the-badge&logo=junit4&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

Este repositório contém a resolução da atividade prática focada em garantir a cobertura de código e regras de negócio utilizando testes unitários estruturados.

---

## ✅ Status do Projeto

Projeto inteiramente configurado, testado e validado com sucesso.

* **Total de testes executados:** 29  
* **Falhas:** 0  
* **Erros:** 0  
* **Status geral:** `BUILD SUCCESS` ✅

---

## ▶️ Como executar os testes (PowerShell)

### 🏢 Cenário A: No Ambiente da Faculdade
Como os computadores do SENAC possuem restrições de administrador, é necessário definir temporariamente o `JAVA_HOME` direto no terminal antes de rodar o Maven.

Execute os comandos na seguinte ordem:

```powershell
# 1. Acessar a pasta do projeto
cd demo

# 2. Configurar o JDK temporário do laboratório
$env:JAVA_HOME="C:\Users\Aluno\Downloads\OpenJDK25U-jdk_x64_windows_hotspot_25.0.3_9\jdk-25.0.3+9"

# 3. Executar os testes unitários
mvn test

```

> 💡 **Observação:** Após rodar o comando do `$env:JAVA_HOME`, o terminal não exibe mensagens de confirmação — isso é esperado e significa que a variável foi definida com sucesso.

### 💻 Cenário B: Uso Padrão (Sua Máquina / Em Casa)

Se você já tem o Java e o Maven configurados globalmente nas variáveis de ambiente do seu sistema pessoal, não há necessidade de setar o `JAVA_HOME` manualmente. Basta rodar:

```powershell
# 1. Acessar a pasta do projeto
cd demo

# 2. Executar os testes direto
mvn test

```

### 🧹 Limpando o cache de testes (Opcional)

Se alterar qualquer regra de negócio e quiser garantir uma execução limpa sem caches antigos do Maven, utilize:

```powershell
mvn clean test

```

---

## 📌 Escopo da Atividade

A atividade consiste na implementação e validação de regras de negócio em classes Java, cada uma contendo sua respectiva suíte de testes unitários:

### 1. Gestão de Produtos (`Produto.java`)

* `calcularDesconto`: Aplica 10% de desconto no valor informado.
* `verificarFreteGratis`: Retorna `true` quando o total excede R$ 100,00.
* **Aferições:** Testes robustos utilizando `assertEquals`, `assertTrue` e `assertFalse`.

### 2. Autenticação (`Login.java`)

* `autenticar`: Retorna sucesso apenas quando o usuário é `"admin"` e a senha é `"123"`.
* **Aferições:** Casos de teste cobrindo credenciais válidas, usuário incorreto, senha incorreta e campos vazios.

### 3. Verificação Numérica (`Verificador.java`)

* `isPar`: Verifica se um número inteiro é par.
* `isPositivo`: Verifica se o número é estritamente maior que zero.
* **Aferições:** Validação de cenários capciosos com números pares, ímpares, positivos e negativos.

### 4. Desempenho Escolar (`Aluno.java`)

* `calcularMedia`: Calcula a média aritmética de duas notas informadas.
* `isAprovado`: Retorna `true` se a média final for maior ou igual a `7.0`.
* **Aferições:** Testes de fluxo cobrindo aprovação, reprovação e valores de borda (limítrofes).

### 5. Temperatura (`Temperatura.java`)

* `converterCelsiusParaFahrenheit`: Conversão térmica utilizando a fórmula clássica $F = (C \times 1.8) + 32$.
* `isTemperaturaAlta`: Retorna `true` quando a temperatura ambiente for estritamente maior que `30°C`.
* **Aferições:** Validação de valores positivos, negativos e limites de temperatura.

---

## 🛠️ Tecnologias e Padrões Adotados

* **Java / OpenJDK 25**
* **Apache Maven 3.9.x** (Gerenciador de dependências e automação de build)
* **JUnit 4.13.2** (Framework de testes unitários)
* **Estrutura Padrão Maven:** `src/main/java` para os códigos de produção e `src/test/java` focado nas suítes de testes.

---

## 📄 Saída Real do Terminal (`BUILD SUCCESS`)

```text
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running test.AlunoTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] Running test.LoginTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] Running test.ProdutoTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] Running test.TemperaturaTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] Running test.VerificadorTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 29, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```

---

## 🧼 Organização do Repositório

O repositório conta com um arquivo `.gitignore` otimizado e metadados configurados para garantir que artefatos de build local (`target/`), caches temporários e arquivos portáteis (`maven.zip`) sejam completamente ignorados pelo rastreamento do Git. Isso mantém o foco estritamente na qualidade do código-fonte e na organização acadêmica.

```

```