package Aula2;

public class Conta {
    Cliente donoDaConta;
    String nomeDonoDaConta;
    String numeroDaConta;
    double saldo;

    Conta(String nomeDonoDaConta,String numeroDaConta,Cliente cliente){
        this.donoDaConta=cliente;
        this.nomeDonoDaConta=nomeDonoDaConta;
        this.numeroDaConta=numeroDaConta;
        this.saldo=0.00;

    }
    public void depositar(double deposito){
        this.saldo +=deposito;
    }
    public void sacar(double saque){
        if(this.saldo-saque<0){
            System.out.println("Você não possui saldo suficiente para esse saque.");
        }else {this.saldo -=saque;}
    }
    public boolean equals(Conta contaComparada){
        return this.numeroDaConta.equals(contaComparada.numeroDaConta);
    }


}
