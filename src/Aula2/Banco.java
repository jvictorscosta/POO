package Aula2;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Banco {
    ArrayList<Conta> contas = new ArrayList<>() ;

    public void criarConta(String numeroConta,Cliente clienteConta) {
        Conta conta = new Conta(clienteConta.nome, numeroConta,clienteConta);
        contas.add(conta);


    }
    public void mostrarConstas(){
        System.out.println("Mostrando contas: ");
        System.out.println();
        for(Conta contas: contas){
            System.out.println();
            System.out.println("Cliente:"+contas.nomeDonoDaConta);
            System.out.println("Numero da conta: "+contas.numeroDaConta);
            System.out.println("Saldo: "+contas.saldo);
            System.out.println("Dono da conta: "+contas.donoDaConta.nome);
        }
    }
    public Conta buscarConta(String contaBuscada){
        for(Conta conta: contas){
            if(conta.numeroDaConta.equals(contaBuscada)){
                System.out.println("Cliente:"+conta.nomeDonoDaConta);
                System.out.println("Numero da conta: "+conta.numeroDaConta);
                System.out.println("Saldo: "+conta.saldo);
                System.out.println("Dono da conta: "+conta.donoDaConta.nome);
                return conta;
            }
        }
        System.out.println("Não encontrada.");
        return null;
    }
    public void depositarBanco(Conta conta,double deposito){
        conta.depositar(deposito);
        System.out.println("Novo saldo :"+conta.saldo+",00");
    }
    public void sacarBanco(Conta conta,double saque){
        conta.sacar(saque);
        System.out.println("Novo saldo :"+conta.saldo+",00");
    }
}
