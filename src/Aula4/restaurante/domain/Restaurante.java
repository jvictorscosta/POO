package Aula4.restaurante.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String endereço;
    private ArrayList pratos;

    public Restaurante(String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço;
        this.pratos= new ArrayList<>();

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

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

}
