package org.example.mapper;

import org.example.dtos.response.PersonaResponseDTO;
import org.example.entity.Persona;
import org.modelmapper.ModelMapper;

public class PersonaMapperImpl {
    private ModelMapper modelMapper = new ModelMapper();

    public PersonaResponseDTO toEntityToDto(Persona personaInput){
        PersonaResponseDTO personaResponseDTO = new PersonaResponseDTO();
        return modelMapper.map(personaInput, PersonaResponseDTO.class);
    }
}
