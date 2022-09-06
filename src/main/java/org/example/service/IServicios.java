package org.example.service;

public interface IServicios {

    // metodos abstarctos
    void insert(String nombre, String apellido);
    void delete(Integer id);

    String listarTodos();
    String update(String nombre, String apellido, Integer id);

}
