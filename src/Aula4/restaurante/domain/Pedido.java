package Aula4.restaurante.domain;

public class Pedido {
    private int numeroPedido;
    private Prato pratoPedido;
    private String obs;

    public Pedido(int numeroPedido, Prato pratoPedido, String obs) {
        this.numeroPedido = numeroPedido;
        this.pratoPedido = pratoPedido;
        this.obs = obs;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Prato getPratoPedido() {
        return pratoPedido;
    }

    public void setPratoPedido(Prato pratoPedido) {
        this.pratoPedido = pratoPedido;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
