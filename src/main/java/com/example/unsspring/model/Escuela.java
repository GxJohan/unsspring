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

}
