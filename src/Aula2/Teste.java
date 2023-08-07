package Aula2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Banco myBanco = new Banco();
        Scanner scanner = new Scanner(System.in);
        boolean fechar =  false;
        int escolhaMenu;

        while (!fechar) {
             System.out.println("\n===== MENU =====");
             System.out.println("1 - Criar contas");
             System.out.println("2 - Mostrar contas");
             System.out.println("3 - Depositar");
             System.out.println("4 - Sacar");
             System.out.println("5 - Sair");
             System.out.print("Escolha uma opção: ");
             escolhaMenu = scanner.nextInt();
             scanner.nextLine();

             switch (escolhaMenu) {
                 case 1:

                    System.out.println("Qual o nome da conta que deseja criar? ");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Qual o CPF da conta que deseja criar? ");
                    String cpfCliente = scanner.nextLine();
                    System.out.println("Qual o email da conta que deseja criar? ");
                    String emailCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, emailCliente);
                    System.out.println("Qual numero da nova conta? ");

                    String numeroConta = scanner.nextLine();

                    myBanco.criarConta(numeroConta, cliente);

                 break;
                 case 2:
                     myBanco.mostrarConstas();
                     break;
                 case 3:
                     System.out.println("Para qual conta deseja fazer um deposito?");
                     Conta contaADepositar = myBanco.buscarConta(scanner.nextLine());
                     System.out.println("Qual o valor do deposito? ");
                     double deposito = scanner.nextDouble();
                     myBanco.depositarBanco(contaADepositar,deposito);
                     break;

                 case 4:
                     System.out.println("Para qual conta deseja fazer um saque?");
                     Conta contaASacar = myBanco.buscarConta(scanner.nextLine());
                     System.out.println("Qual o valor do deposito? ");
                     double saque = scanner.nextDouble();
                     myBanco.sacarBanco(contaASacar,saque);
                     break;

                 case 5:
                     fechar = true;
                     break;


                 default:
                     System.out.println("Opção inválida. Tente novamente.");

             }



        }
    }

}
