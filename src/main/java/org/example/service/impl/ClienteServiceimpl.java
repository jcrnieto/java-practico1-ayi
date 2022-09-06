package org.example.service.impl;

import org.example.service.IServicios;

public class ClienteServiceimpl implements IServicios {

    @Override
    public void insert(String nombre, String apellido){
        System.out.println("insertando datos de cliente: " + " " + nombre + " " + apellido);
    }
    @Override
    public void delete(Integer id){
        System.out.println("borrando datos de cliente: " +  id);
    }
    @Override
    public String listarTodos (){
        return "mostarndo datos de cliente: " ;
    }
    @Override
    public String update(String nombre, String apellido, Integer id){
        return "modificando datos de cliente: "+ nombre + " " + apellido + "con el id: " + id;
    }
}
