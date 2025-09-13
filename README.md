#  Sistema de Contas Bancárias em Java

Este projeto demonstra o uso de **interfaces**, **classes abstratas** e **herança** em Java para modelar um sistema simples de contas bancárias.  
Foram implementados dois tipos de conta: **Conta Corrente** e **Conta Poupança**, cada uma com suas regras específicas de saque e taxa.

---

##  Estrutura do Projeto

---

## ⚙️ Funcionalidades

### Interface `Operacao`
Define o contrato que todas as contas devem seguir:
- `depositar(double quantia)`
- `sacar(double quantia)`
- `obterSaldo()`

### Classe Abstrata `Conta`
- Representa uma conta genérica.  
- Contém atributos comuns: **agência**, **número** e **saldo**.  
- Implementa métodos de depósito e obtenção de saldo.  
- Define o método abstrato `sacar()` que deve ser sobrescrito.

### `ContaCorrente`
- Herda de `Conta`.  
- Aplica uma **taxa de 10% sobre o valor do saque**.

### `ContaPoupanca`
- Herda de `Conta`.  
- Aplica uma **taxa de 0,5% sobre o valor do saque**.

---

## 🚀 Exemplo de Execução

```java
public class Main {
    public static void main(String[] args) {

        Conta poupanca = new ContaPoupanca("12345","001", 1000);
        poupanca.depositar(500);
        poupanca.sacar(200);
        System.out.println("Saldo Poupança: " + poupanca.obterSaldo());

        System.out.println("\n==========================");

        Conta corrente = new ContaCorrente("67890","002",2000);
        corrente.depositar(1000);
        corrente.sacar(500);
        System.out.println("Saldo Corrente: " + corrente.obterSaldo());
    }
}


