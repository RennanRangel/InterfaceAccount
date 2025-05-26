package Interface;

public class Main {
    public static void main(String[] args) {

      Conta Poupanca = new ContaPoupanca("12345","001", 1000);
      Poupanca.depositar(500);
      Poupanca.sacar(200);
      System.out.println("Saldo Poupança: "+ Poupanca.obterSaldo());

        System.out.println("\n==========================");


        Conta Corrente = new ContaCorrente("67890","002",2000);
        Corrente.depositar(1000);
        Corrente.sacar(500);
        System.out.println("Saldo  Corrente: "+ Corrente.obterSaldo());


    }
}