/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.iri.CarteleraCine2.repositorios;

import com.iri.CarteleraCine2.entidades.PeliculaSalaCine;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author irina
 */
@Repository
public interface PeliculaSalaCineRepositorio extends JpaRepository<PeliculaSalaCine, Long>{
    
    @Query(value = "SELECT ps FROM PeliculaSalaCine ps WHERE ps.pelicula.nombre = :nombre AND ps.salaCine.id = :id")
    PeliculaSalaCine buscarRequerimiento1(@Param("nombre") String nombre,@Param("id") Long id);
    
    @Query(value="SELECT ps FROM PeliculaSalaCine ps WHERE ps.salaCine.nombre = :nombre")
    List<PeliculaSalaCine> buscarPeliPorSala(@Param("nombre") String nombre);
}
