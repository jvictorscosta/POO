package Aula2;

public class Cliente {
    String nome;
    String cpf;
    String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public String toString(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("E-mail:"+email);
        return null;
    }
    public boolean equals(Cliente clienteComparado){
        if(this.cpf.equals(cpf)){return true;}

        return false;
    }

}
