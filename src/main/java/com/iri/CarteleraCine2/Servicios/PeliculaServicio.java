
package com.iri.CarteleraCine2.Servicios;

import com.iri.CarteleraCine2.entidades.Pelicula;
import com.iri.CarteleraCine2.repositorios.PeliculaRepositorio;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author irina
 */
@Service
public class PeliculaServicio {
    
    @Autowired
    private PeliculaRepositorio repoPeli;
    
    //CRUD DE LA ENTIDAD PELICULA  ----------------------------------------------------------------------------------------
    //Crear pelicula
    @Transactional
    public void crearPeli(Pelicula pelicula){
        repoPeli.save(pelicula);
    }
    
    //Eliminar pelicula
    @Transactional
    public void eliminarPeli(Long id) {
        Optional<Pelicula> peli = repoPeli.findById(id);
        if (peli.isPresent()) {
            repoPeli.deleteById(id);
        }
    }
    
    //Editar una pelicula
    @Transactional
    public void modificarPeli(Long id, String nombre, Integer duracion) {
        Pelicula pelicula =new Pelicula();
        Optional<Pelicula> peli = repoPeli.findById(id);
        if (peli.isPresent()) {
            pelicula.setNombre(nombre);
            pelicula.setDuracion(duracion);
            repoPeli.save(pelicula);
        }
    }
    
    //Mostrar pelicula por id
    public Pelicula mostrarUnaPeli(Long id){
        Optional<Pelicula> peli = repoPeli.findById(id);
        if (peli.isPresent()) {
            return peli.get();
        }
        return null;
    }
    
    //Mostrar pelicula por nombre
    public Pelicula mostrarPeliPorNombre(String nombre){
        return repoPeli.findByNombre(nombre);
    }
    
    //Mostrar todas las peliculas
    public List<Pelicula> mostrarPeliculas(){
        return repoPeli.findAll();
    }
}
