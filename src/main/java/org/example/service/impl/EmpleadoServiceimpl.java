package org.example.service.impl;

import org.example.service.IServicios;

public class EmpleadoServiceimpl implements IServicios {

  @Override
    public void insert(String nombre, String apellido){
        System.out.println("insertando datos de empleado: " + " " + nombre + " " + apellido);
    }
    @Override
    public void delete(Integer id){
        System.out.println("borrando datos de empleado: " +  id);
    }
    @Override
    public String listarTodos (){
        return "mostarndo datos de empleado: " ;
    }
    @Override
    public String update(String nombre, String apellido, Integer id){
        return "modificando datos de empleado: "+ nombre + " " + apellido + "con el id: " + id;
    }
}
