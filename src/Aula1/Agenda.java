package Aula1;

public class Agenda {
    public Contato[] contatos;

    public Agenda(Contato[] contatos){
        this.contatos = contatos;
    }

    public Agenda() {
    }

    public Contato buscarNome(String nome){
        for (int i =0;i< contatos.length;i++){
             if(nome.equals(contatos[i])){
                 return contatos[i];
             }
        }
        return null;
    }

    public void deletar(Contato contato){
        for (int i =0;i< contatos.length;i++){
            if(contatos[i].equals(contato)){
                contatos[i]=null;
            }
        }
    }

}
