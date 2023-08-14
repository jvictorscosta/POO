package Aula4.restaurante.repository;

import Aula4.restaurante.domain.Prato;
import Aula4.restaurante.domain.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RepositoryRestaurante {
    private List<Prato> pratos= new ArrayList<>();
    private List<Restaurante> restaurantes;
    private List<Restaurante> restauranteBanco;

    public RepositoryRestaurante() {
        this.restauranteBanco = new ArrayList<>();
    }

    public void adicionarRestaurante(Restaurante restaurante) {
        this.restauranteBanco.add(restaurante);
    }

    public void addPratos(Prato newPrato){
        this.pratos.add (newPrato);
    }
    public void listarPratos(){
        for (Prato prato : pratos) {
            System.out.println("Nome: "+prato.getNome());
            System.out.println("preço: "+prato.getPreco());
            System.out.println("descrição: "+prato.getDescricao());
            System.out.println("-----------------------");
        }
    }
    public void addRestaurante(Restaurante newRestaurante){
        this.restaurantes.add (newRestaurante);
    }
}
