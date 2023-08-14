package Aula4.restaurante.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String endereço;
    private ArrayList<Prato> pratos;

    public Restaurante(String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço;
        this.pratos= new ArrayList<Prato>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void addPratoRestaurante(Prato newPrato){
        this.pratos.add (newPrato);

    };

}
