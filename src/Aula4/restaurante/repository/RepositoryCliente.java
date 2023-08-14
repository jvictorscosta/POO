package Aula4.restaurante.repository;

import Aula4.restaurante.domain.Cliente;

import java.util.ArrayList;
import java.util.List;

public class RepositoryCliente {
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        //excluir isso depois
        for(Cliente clienteTeste : clientes){
        System.out.println("Nome: "+ clienteTeste.getNome());
        }

    }


}
