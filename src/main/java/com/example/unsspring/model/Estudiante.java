package com.example.unsspring.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="alumno")
public class Estudiante {
    
    //La este atributo ID es clave primaria y ademas 
    //Es autoincremental 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Columna codigo (int) unique, not null
    @Column(unique = true, nullable = false )
    private int codigo;

    //Columna dni (int) not null
    @Column(nullable = false)
    private int dni;

    //Columna nombre varchar(25) not null
    @Column(nullable = false, length = 25)
    private String nombre;

    //Columna apellidos varchar (50) not null
    @Column(nullable = false, length = 50)
    private String apellidos;

    //Columna edad int not null
    @Column(nullable = false)
    private int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    





}
