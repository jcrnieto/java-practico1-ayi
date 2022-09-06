package org.example.service;

import org.example.dtos.request.PersonaDTO;
import org.example.dtos.response.PersonaResponseDTO;
import org.example.entity.Persona;

import java.util.ArrayList;
import java.util.List;

public interface IPersonaService {

    List<Persona> getAllPersonas();

   /* void insertPersona(Persona persona);
    void deletePersona(Integer id);

    List<Persona> listarPersona();
    PersonaResponseDTO updatePersona(PersonaDTO persona, Integer id);

    */
}
