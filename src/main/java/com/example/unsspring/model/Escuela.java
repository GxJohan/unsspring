package com.example.unsspring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "escuela")
public class Escuela {
    
    //Agregamos una Clave primaria id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Columna nombre
    @Column(length = 50, nullable = false)
    private String nombre;

    //Columna Director de Escuela
    @Column(length = 100, nullable = false)
    private String directorDeEscuela;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirectorDeEscuela() {
        return directorDeEscuela;
    }

    public void setDirectorDeEscuela(String directorDeEscuela) {
        this.directorDeEscuela = directorDeEscuela;
    }

    

}
