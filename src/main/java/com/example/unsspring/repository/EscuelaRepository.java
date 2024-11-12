package com.example.unsspring.repository;

import com.example.unsspring.model.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela,Integer>  {
    
}
