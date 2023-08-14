package Aula4.restaurante.service;

import Aula4.restaurante.domain.Prato;
import Aula4.restaurante.domain.Restaurante;
import Aula4.restaurante.repository.RepositoryRestaurante;

import java.util.List;

public class RestauranteService {
    public RepositoryRestaurante repositoryRestaurante;

    public RestauranteService(RepositoryRestaurante repositoryRestaurante){
        this.repositoryRestaurante= repositoryRestaurante;
    }
    public void criarRestaurante(String nome, String endereço){
        Restaurante restaurante = new Restaurante(nome,endereço);
        repositoryRestaurante.addRestaurante(restaurante);
    }
    public Prato criarPratoService(String nome, double preco, String descricao){

        Prato prato = new Prato(nome,preco,descricao);
        System.out.println("Nome: "+prato.getNome()+"\nDescrição: "+prato.getDescricao()+"\nPreço: "+prato.getPreco()+" reais");
        return prato;
//tirar acima dps
    }
    public void listarPratosRestaurante(String restauranteParaPrato){
       repositoryRestaurante.listarPratos(restauranteParaPrato);
    }
    public void listarRestaurante(){
         repositoryRestaurante.listarRestaurantes();
    }
    public Restaurante buscarRestauranteNome(String nomeProcurado){

        return(repositoryRestaurante.buscarRestaurante(nomeProcurado));
    }
    public void adicionarPratoRestaurante(Restaurante restaurante, Prato prato){
        restaurante.addPratoRestaurante(prato);

    }

}
