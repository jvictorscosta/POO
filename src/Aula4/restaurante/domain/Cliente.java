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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
