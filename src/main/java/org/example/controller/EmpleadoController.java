package org.example.controller;

import org.example.service.IServicios;
import org.example.service.impl.EmpleadoServiceimpl;
import org.example.service.impl.PersonaServiceimpl;

public class EmpleadoController {

    IServicios iServicioEmpleado = new EmpleadoServiceimpl();

     public void agregarEmpleado(String nombre, String apellido){
        iServicioEmpleado.insert(nombre, apellido);
    }

    public void borrarEmpleado(Integer id){
        iServicioEmpleado.delete(id);
    }

    public String listarEmpleado(){
        return  iServicioEmpleado.listarTodos();
    }

    public String modificarEmpleado(String nombre, String apellido, Integer id){
        return iServicioEmpleado.update(nombre, apellido, id);
    }
}
