package com.unir.forum.ms_books_catalogue.repositorio;

import com.unir.forum.ms_books_catalogue.models.libros.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {

    // Buscar por título (parcial, ignorando mayúsculas/minúsculas)
    List<Libro> findByTitulo(String titulo);

    // Buscar por género exacto
    List<Libro> findByGenero(String genero);

    // Buscar por autor (parcial, ignorando mayúsculas/minúsculas)
    List<Libro> findByAutor(String autor);

    // Filtrar por precio dentro de un rango
    List<Libro> findByPrecioBetween(Double precioMin, Double precioMax);
}
