package Aula4.Aula;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro gol= new Carro("Josias","preto","gol",1014,4,"alcool");
        Veiculo Nmax= new Moto("pasdl","amarela","que anda",2011,1923);
        gol.exibirDados();
        Nmax.exibirDados();
    }
}
