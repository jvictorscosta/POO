package Aula2;

public class Teste {
    public static void main(String[] args) {
        Cliente laura= new Cliente("Laura","123123123", "laura.invisivel.com");
        Cliente jorge= new Cliente("Jorge", "123123123","jorginho.matador.com");
        laura.toString();
        Conta Laura=new Conta("Laura","123123",laura);
        System.out.println(laura.equals(jorge));

    }
}
