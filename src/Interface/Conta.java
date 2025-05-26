package Interface;

public abstract class Conta implements Operacao{
    protected String agencia;
    protected String numero;
    protected double saldo;

    public Conta(String agencia,String numero,double saldoInicial){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo = saldoInicial;
    }


    public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double quantia) {
        if(quantia > 0){
            saldo += quantia;
            System.out.println("\nDepositado: "+ quantia);
        }else{
            System.out.println("Valor invalido para deposito.");
        }
    }

    @Override
    public double obterSaldo() {
        return saldo;
    }

    public abstract void sacar(double valor);

}