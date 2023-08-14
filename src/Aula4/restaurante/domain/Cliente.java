package Aula4.restaurante.domain;

public class Cliente {
    private int identificacao;
    private String nome;
    private String endereco;



    public Cliente( String nome, String endereco, int id) {
        this.identificacao = id;
        this.nome = nome;
        this.endereco = endereco;

    }
}
