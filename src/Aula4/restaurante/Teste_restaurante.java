package Aula4.restaurante;

import Aula4.restaurante.entrada_saida.in_out;
import Aula4.restaurante.repository.RepositoryRestaurante;
import Aula4.restaurante.service.ClienteService;
import Aula4.restaurante.service.RestauranteService;

import java.util.Scanner;

public class Teste_restaurante {

    public static void main(String[] args) {
        ClienteService clienteService= new ClienteService();
        RepositoryRestaurante repositoryRestaurante= new RepositoryRestaurante();

        RestauranteService restauranteService= new RestauranteService(repositoryRestaurante);
        in_out in_out = new in_out(clienteService,restauranteService);

        in_out.menu();


        }
    }

