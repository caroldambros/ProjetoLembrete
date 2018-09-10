package br.com.db1.dao;

import java.util.List;

public interface DAO {
	List<T> findAll();

	T findById(Integer id);

	List<T> findByName(String descricao);

	boolean save(T t);

	boolean delete(Integer id);


}
