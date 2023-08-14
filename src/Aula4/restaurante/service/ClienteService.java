package Aula4.restaurante.service;

import Aula4.restaurante.domain.Cliente;
import Aula4.restaurante.repository.RepositoryCliente;

public class ClienteService {
    public int contador=0;

    private RepositoryCliente repositoryCliente;
    public ClienteService(RepositoryCliente repositoryCliente){
        this.repositoryCliente=repositoryCliente;
    }

    public void cadastrarCliente(String nome, String endereco){
        Cliente cliente = new Cliente(nome, endereco, contador);
        contador++;
        repositoryCliente.adicionarCliente(cliente);
    }


}
