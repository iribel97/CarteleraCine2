
package com.iri.CarteleraCine2.Servicios;

import com.iri.CarteleraCine2.repositorios.PeliculaRepositorio;
import com.iri.CarteleraCine2.repositorios.PeliculaSalaCineRepositorio;
import com.iri.CarteleraCine2.repositorios.SalaCineRepositorio;
import com.iri.CarteleraCine2.entidades.PeliculaSalaCine;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author irina
 */
@Service
public class PeliculaSalaCineServicio {
    @Autowired
    private PeliculaSalaCineRepositorio repoPS;
    @Autowired
    private PeliculaRepositorio repoPeli;
    @Autowired
    private SalaCineRepositorio repoSala;
    
    //buscar por nombre
    public PeliculaSalaCine buscarPeliPorNombre(String nombre, Long idSala){
        return repoPS.buscarRequerimiento1(nombre, idSala);
    }
}
