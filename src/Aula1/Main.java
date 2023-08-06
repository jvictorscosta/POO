package Aula1;

public class Main {
    public static void main(String[] args) {
        Agenda agenda=new Agenda();


        Contato contato1 = new Contato();
        contato1.nome = "Tony";
        contato1.numero = "123";
        Contato contato2 = new Contato();
        contato1.nome = "zé";
        contato1.numero = "456";
        Contato contato3 = new Contato();
        contato1.nome = "Dom";
        contato1.numero = "789";
        Contato[] lista = new Contato[] {contato1, contato2, contato3};
        agenda.contatos = lista;

    contato1.detalhar();
        System.out.println(agenda.buscarNome("Tony"));


    }
}