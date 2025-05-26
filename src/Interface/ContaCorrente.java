package Interface;

public class ContaCorrente extends Conta {

    public ContaCorrente(String agencia,String numero,double saldo){
        super(agencia ,numero, saldo);
    }

    @Override
    public void sacar(double quantia){
        double taxa =  quantia * 0.10;
        double total = quantia + taxa;

        if(saldo >= total){
            saldo  -= total;
            System.out.println("Saque de R$: "+quantia + " realizado com sucesso com taxa de R$:" + taxa);
        }else{
            System.out.println("Saldo insuficiente para saque e taxa");
        }
    }

}