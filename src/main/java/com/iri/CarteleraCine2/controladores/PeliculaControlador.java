
package com.iri.CarteleraCine2.controladores;

import com.iri.CarteleraCine2.Servicios.PeliculaServicio;
import com.iri.CarteleraCine2.entidades.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author irina
 */
@RestController
@RequestMapping("/pelicula")
public class PeliculaControlador {
    
    @Autowired
    private PeliculaServicio peliServ;
    
    //CREAR UNA PELICULA
    @PostMapping("/crear")
    public Pelicula crearPelicula(@RequestBody Pelicula peli){
        peliServ.crearPeli(peli);
        return peliServ.mostrarPeliPorNombre(peli.getNombre());
    }
    
    //ELIMINAR UNA PELICULA POR ID
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPelicula(@PathVariable Long id){
        peliServ.eliminarPeli(id);
    }
    
    //EDITAR UNA PELICULA
    @PostMapping("/editar/{id}")
    public Pelicula editarUnaPelicula(@PathVariable Long id,@RequestBody Pelicula peli){
        peliServ.modificarPeli(id, peli.getNombre(), peli.getDuracion());
        return peliServ.mostrarUnaPeli(id);
    }
    
    //MOSTRAR PELICULAS
    @GetMapping
    public List<Pelicula> mostrarPeliculas(){return peliServ.mostrarPeliculas();}

}
