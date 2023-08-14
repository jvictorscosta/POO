package Aula4.restaurante.service;

import Aula4.restaurante.domain.Prato;
import Aula4.restaurante.repository.RepositoryRestaurante;

public class RestauranteService {
    public RepositoryRestaurante repositoryRestaurante;

    public RestauranteService(RepositoryRestaurante repositoryRestaurante){
        this.repositoryRestaurante= repositoryRestaurante;
    }





    public void criarPratoService(String nome, double preco, String descricao){

        Prato prato = new Prato(nome,preco,descricao);
        System.out.println("Nome: "+prato.getNome()+"\nDescrição: "+prato.getDescricao()+"\nPreço: "+prato.getPreco()+" reais");
        repositoryRestaurante.addPratos(prato);





    }
    public void listarPratosRestaurante(){
       repositoryRestaurante.listarPratos();
    }

}
