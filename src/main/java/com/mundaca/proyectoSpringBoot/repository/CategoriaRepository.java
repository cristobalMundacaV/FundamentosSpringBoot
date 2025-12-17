package com.mundaca.proyectoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mundaca.proyectoSpringBoot.models.Categoria;
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
