
package com.iri.CarteleraCine2.Servicios;

import com.iri.CarteleraCine2.entidades.Pelicula;
import com.iri.CarteleraCine2.repositorios.PeliculaRepositorio;
import com.iri.CarteleraCine2.repositorios.PeliculaSalaCineRepositorio;
import com.iri.CarteleraCine2.repositorios.SalaCineRepositorio;
import com.iri.CarteleraCine2.entidades.PeliculaSalaCine;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    //cantidad de pelis por sala
    public String peliPorSala(String nombreSala){
        int cantidad = repoPS.buscarPeliPorSala(nombreSala).size();
        if (cantidad < 3) {
            return "Sala casi Vacía";
        } else if (cantidad <= 5) {
            return "Sala casi llena";
        }
        
        return "Sala llena";
    }
    
    //listar peliculas y cantidad de estas de acuerdo a una fecha de publicacion
    public Map<List<Pelicula>, String> buscarPorFecha(Date fechaPublicacion){
        boolean bandera;
        List<PeliculaSalaCine> pelisSC = repoPS.buscarPorFecha(fechaPublicacion);
        List<Pelicula> peliculas = new ArrayList<>();
        for(PeliculaSalaCine aux : pelisSC){
            if (peliculas.isEmpty()) {
                peliculas.add(repoPeli.getById(aux.getPelicula().getId()));
            } else {
                bandera = false;
                for(Pelicula peli : peliculas){
                    if (peli == aux.getPelicula()) {
                        bandera = true;
                        break;
                    }
                }
                
                if (!bandera) {
                    peliculas.add(repoPeli.getById(aux.getPelicula().getId()));
                }
            }
        }
        
        Map<List<Pelicula>, String> resultado = new HashMap<>();
        resultado.put(peliculas, "La cantidad de películas publicadas en esta fecha es: " + pelisSC.size());

        return resultado;
    }
}
