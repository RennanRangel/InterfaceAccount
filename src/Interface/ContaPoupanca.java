package Interface;

public class ContaPoupanca extends Conta {

    ContaPoupanca(String agencia, String numero, double saldoInicial){
        super(agencia ,numero, saldoInicial);
    }

    public void sacar(double quantia){
        double taxa = quantia * 0.005;
        double total = quantia + taxa;
         if(saldo >= total){
            saldo -=  total;
             System.out.println("Sacado: "+ quantia + " (Taxa: "+ taxa + ")");
         }else{
            System.out.println("Saldo insuficiente para saque e taxa.");
        }
    }
}