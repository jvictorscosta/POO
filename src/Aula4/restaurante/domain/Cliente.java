package Aula4.restaurante.domain;

public class Cliente {
    private int identificacao;
    private String nome;
    private String endereco;
    private int contador= 0;


    public Cliente( String nome, String endereco) {
        this.identificacao = contador+1;
        this.nome = nome;
        this.endereco = endereco;
        contador++;
    }
}
