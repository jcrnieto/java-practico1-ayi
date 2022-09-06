package org.example;

import org.example.controller.ClienteController;
import org.example.controller.EmpleadoController;
import org.example.controller.PersonaController;
import org.example.dtos.request.PersonaDTO;
import org.example.dtos.response.PersonaResponseDTO;
import org.example.entity.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        PersonaController personaController = new PersonaController();
        List<Persona> personas = new ArrayList<>();

        personas = personaController.listarPersona();

        personas.forEach(persona -> {
            System.out.println("persona= " + persona);
        });
        System.out.println("--------------------------------------");
        for (Persona personaLista: personas){
            System.out.println("persona= " + personas);
        }
       /*  EmpleadoController empleadoController = new EmpleadoController();
        ClienteController clienteController = new ClienteController();
        Persona persona = new Persona(id, nombre, apellido, edad, direccion);
        Persona persona1 = new Persona(id, nombre, apellido, edad, direccion);
        PersonaDTO personaDTO = new PersonaDTO();
        PersonaResponseDTO personaResponseDTO = new PersonaResponseDTO();

        String nombre1 = "juan";
        String apellido1 = "Nieto";
        Integer id1= 32;

        String nombre2 = "lionel";
        String apellido2 = "messi";
        Integer id2= 38;

        String nombre3 = "cristiano";
        String apellido3 = "ronaldo";
        Integer id3= 40;

        persona.setNombre("lisandro");
        persona.setApellido("lopez");

        personaDTO.setNombre("lisandro");
        personaDTO.setApellido("lopez");


        persona1.setNombre("fernando");
        persona1.setApellido("gago");

        System.out.println("------Persona------");
        personaController.agregarPersona(persona);
        personaResponseDTO = personaController.modificarPersona(personaDTO, id2);
        System.out.println(personaResponseDTO.toString());
        System.out.println(personaController.listarPersonas().toString());
        personaController.borrarPersona(id1);


       // personaController.agregarPersona(nombre1, apellido1);
       // System.out.println(personaController.modificarPersona(nombre1, apellido1, id1));
        System.out.println(personaController.listarPersonas());
        personaController.borrarPersona(id1);


        System.out.println("------Empleado------");
        empleadoController.agregarEmpleado(nombre2, apellido2);
        System.out.println(empleadoController.modificarEmpleado(nombre2, apellido2, id2));
        System.out.println(empleadoController.listarEmpleado());
        empleadoController.borrarEmpleado(id2);*/


      /*  System.out.println("------Cliente------");
        clienteController.agregarCliente(nombre3, apellido3);
        System.out.println(clienteController.modificarCliente(nombre3,apellido3, id3));
        System.out.println(clienteController.listarCliente());
        clienteController.borrarCliente(id3);*/
    }
}
