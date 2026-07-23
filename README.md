# Sistema de Loja - Calculadora de Impostos e Descontos

Este projeto é uma aplicação Java desenvolvida para demonstrar o uso prático do padrão de projeto **Strategy** (GoF), aplicando boas práticas de Programação Orientada a Objetos e princípios SOLID (como o *Open/Closed Principle*).

## Sobre o Projeto

O objetivo do sistema é calcular impostos (como ICMS e ISS) e aplicar regras de negócio em orçamentos sem acoplar a lógica de cálculo à regra principal da loja.

Com a utilização do padrão **Strategy**, novas alíquotas ou tipos de impostos podem ser adicionados criando novas classes, sem a necessidade de alterar a classe principal da calculadora ou encher o código de condicionais (`if/else` ou `switch`).

---

## Design Pattern Utilizado

### **Strategy**
Permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. O Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

* **Exemplo no código:** As regras de cálculo de impostos (`ICMS`, `ISS`) implementam a mesma interface (`Imposto`), permitindo que a `CalculadoraDeImpostos` processe qualquer taxa de forma genérica.

---


## Tecnologias utilizadas

- **Java 21**
- **POO (Programação Orientada a Objetos)**
- **Design Patterns (GoF)**

## Estrutura de Pacotes

```text
src/loja/
├── desconto/       # Classes referentes às estratégias e regras de desconto
├── imposto/        # Interface Imposto, Calculadora e implementações (ICMS, ISS)
└── orcamento/      # Modelo de Orcamento