package com.example.unsspring.service;

//Para este ejemplo práctico
//La lógica de negocio será realizar
// Un Simple CRUD del Estudiante
// Create - Read - Update - Delete
//Nota: En la clase service va la lógica
// del negocio (CRUD)

import com.example.unsspring.model.Estudiante;
import com.example.unsspring.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudianteService {
    
    //Invocamos a la clase repositorio para obtener sus métodos
    @Autowired
    private EstudianteRepository estudianteRepository;
    
    //Método CRUD:
    //READ ALL
    //Listar a todos los estudiantes en una list
    public List<Estudiante> getAllEstudiantes(){
        return estudianteRepository.findAll();
    }
    //READ BY ID
    //Método pata llamar a solo un estudiante
    public Estudiante getEstudianteById(Integer id){
        return estudianteRepository.findById(id).orElse(null);
    }

    //CREATE
    //Metodo para crear una nueva entidad tipo estudiante
    public Estudiante createEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    //UPDATE
    //Método para actualizar una entidada
    public Estudiante updateEstudiante(Estudiante estudiante, Integer id){
        Estudiante estu = estudianteRepository.findById(id).orElse(null);
        if(estu != null){
            //Si el estudiante que se quiere actualizar existe
            estu.setCodigo(estudiante.getCodigo());
            estu.setDni(estudiante.getDni());
            estu.setNombre(estudiante.getNombre());
            estu.setApellidos(estudiante.getApellidos());
            estu.setEdad(estudiante.getEdad());
            return estudianteRepository.save(estu);//aqui ya se actualizó
        }
        return null;
    }

    //DELETE
    //Método para eliminar a un estudiante
    public void deleteEstudiante (Integer id){
        estudianteRepository.deleteById(id);
    }



}
