package Aula4.restaurante.service;

import Aula4.restaurante.domain.Cliente;

public class ClienteService {
    public void cadastrarCliente(String nome, String endereco){
        Cliente cliente = new Cliente(nome, endereco);
    }

}
