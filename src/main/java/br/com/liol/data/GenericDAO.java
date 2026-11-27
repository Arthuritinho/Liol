package br.com.liol.data;

import br.com.liol.exceptions.PersistenciaException;
import java.util.List;

public interface GenericDAO<T, ID> {
    void inserir(T entidade) throws PersistenciaException;
    void atualizar(T entidade) throws PersistenciaException;
    void excluir(ID id) throws PersistenciaException;
    T buscarPorId(ID id) throws PersistenciaException;
    List<T> listarTodos() throws PersistenciaException;
}