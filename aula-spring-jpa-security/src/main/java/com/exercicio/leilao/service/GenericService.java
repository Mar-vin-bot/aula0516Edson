package com.exercicio.leilao.service;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericService<T,ID> {
    T create(T object);
    List<T> readAll();
    T readById(ID id);
    T update(ID id, T object);
    void delete(ID id);
}
