package dio_java_basico.DesignPatternsJava.service;

import dio_java_basico.DesignPatternsJava.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId (Long id);
    void inserir (Cliente cliente);
    void atualizar (Long id, Cliente cliente);
    void deletar (Long id);
    
} 
