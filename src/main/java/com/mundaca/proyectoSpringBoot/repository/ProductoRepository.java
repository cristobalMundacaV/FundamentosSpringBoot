package com.mundaca.proyectoSpringBoot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mundaca.proyectoSpringBoot.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
