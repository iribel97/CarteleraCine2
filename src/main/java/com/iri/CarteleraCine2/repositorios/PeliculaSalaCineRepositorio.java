/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.iri.CarteleraCine2.repositorios;

import com.iri.CarteleraCine2.entidades.PeliculaSalaCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author irina
 */
@Repository
public interface PeliculaSalaCineRepositorio extends JpaRepository<PeliculaSalaCine, Long>{
    
}
