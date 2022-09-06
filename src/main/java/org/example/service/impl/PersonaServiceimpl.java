package org.example.service.impl;

import org.example.configuration.ConexionDB;
import org.example.constants.Constants;
import org.example.dtos.request.PersonaDTO;
import org.example.dtos.response.PersonaResponseDTO;
import org.example.entity.Persona;
import org.example.service.IPersonaService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaServiceimpl implements IPersonaService {

    private ConexionDB conexionDB = new ConexionDB();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    @Override
    public List<Persona> getAllPersonas() {
    conexionDB = new ConexionDB();

        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = conexionDB.getConnection();
            stmt = conn.prepareStatement(Constants.SQL_SELECT_PERSON);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Integer edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");

                persona = new Persona(id, nombre, apellido, edad, direccion);
                personas.add(persona);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                conexionDB.close(rs);
                conexionDB.close(stmt);
                conexionDB.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }


        return personas;
    }


}
  /*  private PersonaMapperImpl personaMapperImpl = new PersonaMapperImpl();
    @Override
    public void insertPersona(Persona persona) {
        Persona persona1 = new Persona();
        persona1 = persona;
        System.out.println("se inserta a: " + persona1.toString());
    }

    @Override
    public void deletePersona(Integer id) {
        System.out.println("borrando datos de persona: " + id);
    }


    @Override
    public List<Persona> listarPersona() {
        //creo la persona
        Persona persona = new Persona();
        //lista de personas
        List<Persona> listaPersona = new ArrayList<>();
        persona.setNombre("leo");
        persona.setApellido("messi");
        //agrego la persona
        listaPersona.add(persona);
        //devuelvo la lista
        return listaPersona;
    }

    @Override
    public PersonaResponseDTO updatePersona(PersonaDTO personaDTO, Integer id) {

        Persona personaModificada = new Persona();

        //recuperé el nombre y apellido
        personaModificada.setNombre(personaDTO.getNombre());
        personaModificada.setApellido(personaDTO.getApellido());
        //aqui se modifica el registro

        return personaMapperImpl.toEntityToDto(personaModificada);
    }

    /*@Override
    public Persona updatePersona(Persona persona, Integer id) {

        Persona personaModificada = new Persona();
        //recuperé el nombre y apellido
        personaModificada.setNombre(persona.getNombre());
        personaModificada.setApellido(persona.getApellido());
        //aqui se modifica el registro

        return personaModificada;
    }*/






    /*  @Override
    public void insert(String nombre, String apellido){
        System.out.println("insertando datos de persona: " + " " + nombre + " " + apellido);
    }
    @Override
    public void delete(Integer id){
        System.out.println("borrando datos de persona: " +  id);
    }
    @Override
    public String listarTodos (){
        return "mostarndo datos de persona: " ;
    }
    @Override
    public String update(String nombre, String apellido, Integer id){
        return "modificando datos de persona: "+ nombre + " " + apellido + "con el id: " + id;
    }*/