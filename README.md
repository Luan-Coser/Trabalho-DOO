# Sistema de Controle Financeiro Pessoal

Este projeto é um sistema simples de controle financeiro pessoal desenvolvido em Java, como atividade avaliativa da disciplina deDESENVOLVIMENTO DE SISTEMAS ORIENTADOS A OBJETOS (DOO) no curso de Ciência da Computação.

## 👨‍💻 Funcionalidades
- Registro de receitas e despesas.
- Cálculo automático do saldo total.
- Filtragem de transações por categoria.
- Tratamento de exceções personalizadas.

## 💡 Conceitos de POO Aplicados
- **Herança:** As classes `Receita` e `Despesa` herdam de `Transacao`.
- **Polimorfismo:** O método `calcularImpacto()` é sobrescrito nas subclasses.
- **Classe Abstrata:** `Transacao` é uma classe abstrata.
- **Interface:** `Registravel` define o contrato para registro de transações.
- **Collections:** Uso de `ArrayList` para armazenar transações.
- **Tratamento de Exceções:** `try-catch` e exceções personalizadas (`ValorNegativoException`, `CategoriaInvalidaException`).

## Cenário 
O cenário escolhido foi um sistema simples para controle financeiro passoal, para mapear os gastos.

## Diagrama
![image](https://github.com/user-attachments/assets/dc647927-a967-4258-b2dd-ca3d9df0c8d1)

