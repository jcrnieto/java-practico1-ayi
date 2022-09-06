package org.example.controller;


import org.example.dtos.request.PersonaDTO;
import org.example.dtos.response.PersonaResponseDTO;
import org.example.entity.Persona;
import org.example.service.IPersonaService;
import org.example.service.IServicios;
import org.example.service.impl.PersonaServiceimpl;

import java.util.ArrayList;
import java.util.List;

public class PersonaController {

IPersonaService iPersonaServicios = new PersonaServiceimpl();

public List<Persona>listarPersona(){
    List<Persona> personas = new ArrayList<>();
    personas = iPersonaServicios.getAllPersonas();
    return personas;
}

/*public void agregarPersona(Persona persona){
    iPersonaServicios.insertPersona(persona);
}

public void borrarPersona(Integer id){
    iPersonaServicios.deletePersona(id);
}

public List<Persona> listarPersonas(){
  return  iPersonaServicios.listarPersona();
}

public PersonaResponseDTO modificarPersona(PersonaDTO persona, Integer id){
    return iPersonaServicios.updatePersona(persona, id);
}*/

}
