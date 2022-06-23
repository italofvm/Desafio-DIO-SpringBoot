package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public abstract class ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    abstract void deletar(Long id);
}
