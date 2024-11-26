package com.example.unsspring.service;

import com.example.unsspring.model.Escuela;
import com.example.unsspring.repository.EscuelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EscuelaService {
    
    @Autowired
    private EscuelaRepository escuelaRepository;

    //Metodo CRUD
    public List<Escuela> getEscuelas(){
        return escuelaRepository.findAll();
    }
    //Obtener escuela por id
    public Escuela getEscuelaById(Integer id){
        return escuelaRepository.findById(id).orElse(null);
    }

    //Crear una escuela
    public Escuela creatEscuela(Escuela escuela){
        return escuelaRepository.save(escuela);

    }

    //Actualizar escula
    public Escuela updateEscuela(Integer id, Escuela escuela){
        Escuela escuela2 = escuelaRepository.findById(id).orElse(null);
        if (escuela2!=null){
            escuela2.setNombre(escuela.getNombre());
            escuela2.setDirectorDeEscuela(escuela.getDirectorDeEscuela());
            return escuelaRepository.save(escuela2);
        }
        return null;
    }

    //Eliminar escuela
    public void deleteEscuela(Integer id){
        escuelaRepository.deleteById(id);
    }

}
