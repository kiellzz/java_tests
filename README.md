# Atividade Prática - Testes Unitários com JUnit (JUnit 4 + Maven)

Este repositório contém a resolução da atividade prática de **testes unitários** utilizando **JUnit 4** e **Apache Maven**.

## ✅ Status do Projeto

Projeto configurado e validado com sucesso.

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
# Acessar a pasta do projeto
cd demo

# Configurar o JDK temporário
$env:JAVA_HOME="C:\Users\Aluno\Downloads\OpenJDK25U-jdk_x64_windows_hotspot_25.0.3_9\jdk-25.0.3+9"

# Executar os testes unitários
mvn test

# (Opcional) Limpar o cache e rodar os testes novamente
mvn clean test

```

### 💻 Cenário B: Uso Padrão (Sua Máquina / Em Casa)
Se você já tem o Java e o Maven configurados globalmente nas variáveis de ambiente do seu sistema, não há necessidade de setar o JAVA_HOME manualmente. Basta abrir o terminal na pasta do projeto e rodar:

PowerShell
```powershell
# 1. Acessar a pasta do projeto
cd demo

# 2. Executar os testes direto
mvn test

```

> 💡 **Observação:** Após rodar o comando do `$env:JAVA_HOME`, normalmente não aparece nenhuma mensagem no terminal — isso é esperado e significa que a variável foi definida com sucesso.

---

## 📌 Escopo da Atividade

A atividade consiste na implementação e validação de regras de negócio em classes Java, cada uma contendo sua respectiva suíte de testes unitários:

### 1. Gestão de Produtos (`Produto.java`)

* `calcularDesconto`: Aplica 10% de desconto no valor informado.
* `verificarFreteGratis`: Retorna `true` quando o total excede R$ 100,00.
* **Aferições:** Testes utilizando `assertEquals`, `assertTrue` e `assertFalse`.

### 2. Autenticação (`Login.java`)

* `autenticar`: Retorna sucesso apenas quando o usuário é `"admin"` e a senha é `"123"`.
* **Aferições:** Casos de teste para credenciais válidas, usuário incorreto, senha incorreta e campos vazios.

### 3. Verificação Numérica (`Verificador.java`)

* `isPar`: Verifica se um número inteiro é par.
* `isPositivo`: Verifica se o número é maior que zero.
* **Aferições:** Validação de cenários com par/ímpar e positivo/negativo.

### 4. Desempenho Escolar (`Aluno.java`)

* `calcularMedia`: Calcula a média aritmética de duas notas.
* `isAprovado`: Retorna `true` se a média for maior ou igual a `7.0`.
* **Aferições:** Testes cobrindo fluxos de aprovação, reprovação e valores limítrofes (borda).

### 5. Temperatura (`Temperatura.java`)

* `converterCelsiusParaFahrenheit`: Conversão térmica utilizando a fórmula $F = (C \times 1.8) + 32$.
* `isTemperaturaAlta`: Retorna `true` quando a temperatura ambiente for estritamente maior que `30°C`.
* **Aferições:** Validação de valores positivos, negativos e limites.

---

## 🛠️ Tecnologias Utilizadas

* **Java** (JDK configurado via `JAVA_HOME`)
* **Apache Maven** (Gerenciador de dependências e build)
* **JUnit 4.13.2** (Framework de testes)

> 📂 **Estrutura padrão Maven adotada:** `src/main/java` (código-fonte) e `src/test/java` (testes).

---

## 📄 Saída Esperada no Terminal (Exemplo)

```text
[INFO] Results:
[INFO] Tests run: 29, Failures: 0, Errors: 0, Skipped: 0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
