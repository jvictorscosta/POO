package Aula4.restaurante.repository;

import Aula4.restaurante.domain.Prato;
import Aula4.restaurante.domain.Restaurante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositoryRestaurante {

    private List<Restaurante> restaurantes = new ArrayList<>();

    public void listarPratos(String restaurante){

        for (Prato prato : buscarRestaurante(restaurante).getPratos()) {
            System.out.println("Nome: "+prato.getNome());
            System.out.println("preço: "+prato.getPreco());
            System.out.println("descrição: "+prato.getDescricao());
            System.out.println("-----------------------");
        }
    }
    public void addRestaurante(Restaurante newRestaurante){
        this.restaurantes.add (newRestaurante);
    }
    public void addPrato(String restaurante, Prato prato){
        buscarRestaurante(restaurante).addPratoRestaurante(prato);
    }
    public void listarRestaurantes(){
        if(this.restaurantes==null||restaurantes.isEmpty()){
            System.out.println("Não existe restaurante cadastrado");
        }else {
            for (Restaurante restaurante : restaurantes) {
                System.out.println("Nome: "+restaurante.getNome());
                System.out.println("Endereço: "+restaurante.getEndereço());
                System.out.println("-----------------------");
            }
        }
    }
    public Restaurante buscarRestaurante(String nomeBuscado){
        for (Restaurante restaurante : restaurantes) {
            if(nomeBuscado.equals(restaurante.getNome())){
                return restaurante;
            }
        }
        System.out.println("Nenhum restaurante com esse nome foi encontrado.");
        return null;
    }

}
