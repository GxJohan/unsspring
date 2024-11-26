package com.example.unsspring.controller;

import com.example.unsspring.model.Escuela;
import com.example.unsspring.service.EscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/escuelas")
public class EscuelaController {
    
    @Autowired
    private EscuelaService escuelaService;

    //Metodo get all
    @GetMapping
    public List<Escuela> getEscuelas(){
        return escuelaService.getEscuelas();
    }

    //Metodo get by id
    @GetMapping("/{id}")
    public ResponseEntity<Escuela> getEscuelaById(@PathVariable Integer id){
        Escuela escuela = escuelaService.getEscuelaById(id);
        if(escuela!=null){
            return ResponseEntity.ok(escuela);

        }
        return ResponseEntity.notFound().build();
    }

    //Create

    //Update
    
    ///Delete

}
