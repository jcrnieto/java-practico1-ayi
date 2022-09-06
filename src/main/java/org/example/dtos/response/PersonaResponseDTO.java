package org.example.dtos.response;

public class PersonaResponseDTO {

    private Integer id;
    private String nombre;

    private String apellido;

    private Integer edad;

    private Integer direcion;


    public PersonaResponseDTO(Integer id, String nombre, String apellido, Integer edad, Integer direcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direcion = direcion;
    }

    public PersonaResponseDTO(){}

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

    @Override
    public String toString() {
        return "PersonaResponseDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direcion=" + direcion +
                '}';
    }
}
