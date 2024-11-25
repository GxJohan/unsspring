package com.example.unsspring.controller;

//CLase controlador
//Esta clase es la que "da la cara" al navegador
// O la que se expone a una vista (FrontEnd)
//Generalmente el controlador lleva mapeador las
//Rutas de acceso (Path's)
import com.example.unsspring.model.Estudiante;
import com.example.unsspring.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")//path para este controlador
public class EstudianteController {
    
    //Invocamos el servicio
    @Autowired
    private EstudianteService estudianteService;

    //Metodo (GET) para obtener la lista de estudiantes
    @GetMapping
    public List<Estudiante> getEstudiantes(){
        return estudianteService.getAllEstudiantes();
    }

    //Método para obtener un estudiante por su id
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getEstudianteById(@PathVariable Integer id) {
        Estudiante estu = estudianteService.getEstudianteById(id);
        if(estu !=null){
            //si es que existe...
            return ResponseEntity.ok(estu);
        }
        return ResponseEntity.notFound().build();
    }

    //Método para crear un estudiante
    //POST
    @PostMapping
    public Estudiante createEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.createEstudiante(estudiante);
    }

    //Método para actualizar o editar un estudiante
    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> updateEstudiante (
        @PathVariable Integer id,
        @RequestBody Estudiante estudiante){
            Estudiante estu = estudianteService.updateEstudiante(estudiante, id);
            if(estu!=null){
                return ResponseEntity.ok(estu);
            }
            return ResponseEntity.notFound().build();
    }

    //Método para eliminar estudiante
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudiante
    (@PathVariable Integer id){
        estudianteService.deleteEstudiante(id);
        return ResponseEntity.ok().build();
    }

    

}
