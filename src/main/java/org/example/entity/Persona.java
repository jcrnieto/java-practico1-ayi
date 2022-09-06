package org.example.entity;

public class Persona {

    private Integer id;
    private String nombre;

    private String apellido;

    private Integer edad;

    private Integer direcion;

    public Persona(int id, String nombre, String apellido, Integer edad, String direccion){}

    public Persona(Integer id, String nombre, String apellido, Integer edad, Integer direcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direcion = direcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDirecion() {
        return direcion;
    }

    public void setDirecion(Integer direcion) {
        this.direcion = direcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona(String nombre, String apellido, Integer edad, Integer direcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direcion = direcion;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direcion=" + direcion +
                '}';
    }
}
