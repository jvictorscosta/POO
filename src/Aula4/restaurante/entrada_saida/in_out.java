package Aula4.restaurante.entrada_saida;

import Aula4.restaurante.repository.RepositoryRestaurante;
import Aula4.restaurante.service.ClienteService;
import Aula4.restaurante.service.RestauranteService;

import java.util.Scanner;

public class in_out {
    private ClienteService clienteService;
    private RestauranteService restauranteService;

    Scanner scanner = new Scanner(System.in);

    public in_out(ClienteService clienteService,RestauranteService restauranteService) {
        this.clienteService = clienteService;
        this.restauranteService= restauranteService;

    }

    public void menu(){


        System.out.println("Seja bem vindo!");



            while (true){
                System.out.println("");
                System.out.println("Menu:");
                System.out.println("Digite a opção que deseja.");
                System.out.println("");
                System.out.println("1. Criar prato");
                System.out.println("2. Fazer pedido");
                System.out.println("3. Cadastrar Cliente");
                System.out.println("4. Verificar historico de pedidos");
                System.out.println("5. Lista de pratos");
                System.out.println("0. Sair");


                int opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao == 1) {
                    System.out.println("");
                    System.out.println("Criando novo prato.");
                    criarPrato();
                    System.out.println("Prato criado com sucesso!");
                    System.out.println("");

                } else if (opcao == 2) {
                    System.out.println("Imprimindo todas as contas");

                    // efetuando a busca
                    // List<Conta> contas = contaService.buscarTodas();

                    System.out.println("Contas cadastradas: ");
                    // for (Conta conta : contas) {
                    //     System.out.println(conta);
                    // }

                } else if (opcao ==3){
                    criarCliente();
                } else if (opcao ==5){
                    restauranteService.listarPratosRestaurante();
                }else if (opcao == 0) {
                    break;
                } else {
                    System.out.println("Opção inválida!");
                    System.out.println("");
                }
            }
            scanner.close();
        }
        void criarPrato(){


            System.out.println("digite o nome do prato: ");
            String nomePrato= scanner.nextLine();

            System.out.print("digite o preço do prato: ");
            double precoPrato= scanner.nextDouble();

            System.out.print("digite a descrição do prato: ");
            scanner.nextLine();
            String descricaoPrato = scanner.nextLine();
            restauranteService.criarPratoService(nomePrato,precoPrato,descricaoPrato);
            System.out.println("");
            System.out.println("Em qual restaurante deseja adicionar este prato?: ");


        }
        public void criarCliente(){
            scanner.nextLine();

            System.out.print("Para se cadastrar digite seu nome: ");
            String nomeCliente= scanner.nextLine();
            System.out.print("Digite seu endereço: ");
            String  enderecoCliente= scanner.nextLine();

            clienteService.cadastrarCliente(nomeCliente,enderecoCliente);


        }
    }

