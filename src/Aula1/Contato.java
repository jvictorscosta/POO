package Aula1;

public class Contato {
    String nome;
    String numero;
    public void ligar(int numero){
        System.out.println("Realizando chamada para: "+numero);

    }
    public void detalhar(){
        System.out.println("nome "+nome);
        System.out.println("Numero "+numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.lang.String getNumero() {
        return numero;
    }

    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }
}
