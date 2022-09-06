package org.example.dtos.request;

public class PersonaDTO {

    private String nombre;

    private String apellido;

    private Integer edad;

    private Integer direcion;

    public PersonaDTO(){}

    public PersonaDTO(String nombre, String apellido, Integer edad, Integer direcion) {
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

    @Override
    public String toString() {
        return "PersonaDTO{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direcion=" + direcion +
                '}';
    }
}
