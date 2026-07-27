# Sistema de Loja - Design Patterns Comportamentais em Java

Este projeto é uma aplicação Java desenvolvida para demonstrar a aplicação prática dos principais **Padrões de Projeto Comportamentais (GoF)**, aplicando boas práticas de Programação Orientada a Objetos, princípios SOLID (como o *Open/Closed Principle* e *Single Responsibility Principle*) e tratamento de exceções de domínio.

---

## Sobre o Projeto

O objetivo do sistema é simular o fluxo de criação e processamento de orçamentos e pedidos de uma loja, cobrindo desde o cálculo de impostos e descontos até o gerenciamento de estados do orçamento e ações de pós-processamento de pedidos.

Com a utilização dos Design Patterns, o sistema evita o acúmulo de condicionais (`if/else` ou `switch`), promove o desacoplamento de código e facilita a extensão de novas regras de negócio sem a necessidade de alterar a lógica principal.

---

## 🛠️ Padrões de Projeto Aplicados

### 1. **Strategy**
Permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis.
* **Aplicação no projeto:** Cálculo de impostos (`ICMS`, `ISS`) implementando a interface `Imposto`, permitindo que a `CalculadoraDeImpostos` processe qualquer taxa de forma dinâmica.

### 2. **Chain of Responsibility**
Evita o acoplamento do remetente de uma solicitação ao seu receptor, dando a mais de um objeto a oportunidade de tratar a solicitação.
* **Aplicação no projeto:** Encadeamento de regras de desconto na `CalculadoraDeDescontos` (ex: desconto por quantidade de itens ou por valor), onde cada regra valida sua condição ou passa para a próxima.

### 3. **Template Method**
Define o esqueleto de um algoritmo em uma operação, adiando alguns passos para as subclasses.
* **Aplicação no projeto:** Criação de classes abstratas base para reaproveitar o fluxo comum de cálculos e validações de descontos e impostos, deixando apenas os detalhes específicos para as subclasses.

### 4. **State**
Permite que um objeto altere seu comportamento quando seu estado interno muda.
* **Aplicação no projeto:** Gerenciamento do ciclo de vida e transições do `Orcamento` (Em Análise, Aprovado, Reprovado, Finalizado), isolando a lógica de mudança de estado em classes dedicadas (`SituacaoOrcamento`).

### 5. **Command**
Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações e filas.
* **Aplicação no projeto:** Isolamento das rotinas de execução (como a geração de pedidos via `GeraPedido` e `GeraPedidoHandler`), aplicando o princípio da responsabilidade única (SRP).

### 6. **Observer**
Define uma dependência um-para-muitos entre objetos, para que quando um objeto mude de estado, todos os seus dependentes sejam notificados.
* **Aplicação no projeto:** Ações executadas de forma desacoplada após a criação/finalização do pedido (ex: envio de e-mail, salvar no banco de dados).

---

## Outras Boas Práticas Utilizadas

* **Custom Domain Exceptions:** Criação de exceções personalizadas (`DomainException` estendendo `RuntimeException`) para o tratamento claro e elegante de regras de negócio violadas.
* **Commits Semânticos:** Organização do histórico do Git utilizando a convenção *Conventional Commits* (`feat`, `fix`, `refactor`).

---

## Tecnologias Utilizadas

- **Java 21**
- **Programação Orientada a Objetos (POO)**
- **Design Patterns (GoF)**
- **Git & GitHub (Conventional Commits)**

---

## Estrutura de Pacotes

```text
src/loja/
├── desconto/       # Classes e estratégias para cálculo e cadeia de descontos
├── imposto/        # Interface Imposto, Calculadora e estratégias (ICMS, ISS)
├── orcamento/      # Modelo de Orcamento e controle de estados (State)
├── pedido/         # Comandos, Handlers e Observers de ações do pedido
└── DomainException.java # Exceção customizada de domínio