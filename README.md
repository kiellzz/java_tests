# Atividade Prática - Testes Unitários com JUnit (JUnit 4 + Maven)

Este repositório contém a resolução da atividade prática de **testes unitários** utilizando **JUnit 4** e **Apache Maven**.

## ✅ Status do Projeto
Projeto configurado e validado com sucesso.

- **Total de testes executados:** 29  
- **Falhas:** 0  
- **Erros:** 0  
- **Status geral:** `BUILD SUCCESS` ✅

---

## ▶️ Como executar os testes (PowerShell)

No ambiente da faculdade, é necessário definir temporariamente o `JAVA_HOME` no terminal (sem precisar de permissão de administrador).

Execute **nessa ordem**:

```powershell
cd demo
$env:JAVA_HOME="C:\Users\Aluno\Downloads\OpenJDK25U-jdk_x64_windows_hotspot_25.0.3_9\jdk-25.0.3+9"
mvn test
mvn clean test (para limpar o cache de testes)

Observação: após rodar o comando do $env:JAVA_HOME, normalmente não aparece mensagem — isso é esperado.

📌 Escopo da atividade

A atividade consiste em regras de negócio em classes Java, cada uma com sua suíte de testes unitários:

1) Gestão de Produtos (Produto.java)
calcularDesconto: aplica 10% de desconto no valor informado.
verificarFreteGratis: retorna true quando o total excede R$ 100,00.
Testes com assertEquals, assertTrue, assertFalse.
2) Autenticação (Login.java)
autenticar: retorna sucesso apenas quando usuário é "admin" e senha é "123".
Testes para credenciais válidas, usuário errado, senha errada e campos vazios.
3) Verificação Numérica (Verificador.java)
isPar: verifica se um inteiro é par.
isPositivo: verifica se o número é maior que zero.
Testes com cenários de par/ímpar e positivo/negativo.
4) Desempenho Escolar (Aluno.java)
calcularMedia: média aritmética de duas notas.
isAprovado: aprovado quando média ≥ 7.0.
Testes cobrindo aprovação, reprovação e valores limítrofes.
5) Temperatura (Temperatura.java)
converterCelsiusParaFahrenheit: conversão usando F = (C × 1.8) + 32.
isTemperaturaAlta: true quando > 30°C.
Testes com valores positivos, negativos e limites.
🛠️ Tecnologias Utilizadas
Java (JDK configurado via JAVA_HOME)
Maven
JUnit 4.13.2
Estrutura padrão Maven: src/main/java e src/test/java
📄 Saída esperada no terminal (exemplo)
[INFO] Results:
[INFO] Tests run: 29, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
