
package com.iri.CarteleraCine2.controladores;

import com.iri.CarteleraCine2.Servicios.PeliculaSalaCineServicio;
import com.iri.CarteleraCine2.entidades.PeliculaSalaCine;
import com.iri.CarteleraCine2.requerimientos.PrimerRequerimiento;
import com.iri.CarteleraCine2.requerimientos.SegundoRequerimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author irina
 */
@RestController
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
    private PeliculaSalaCineServicio servPS;
    
    /*
     * Buscar la película de acuerdo con el nombre de la película e identificador de la sala. REQUERIDO
    */
    @GetMapping("/nombrePeli/idSala")
    public PeliculaSalaCine PrimerRequerimientoControlador(@RequestBody PrimerRequerimiento primero){
        return servPS.buscarPeliPorNombre(primero.getNombrePelicula(), primero.getIdSala());
    }
    
    
    /*
     *Se necesita buscar por el nombre de la sala de cine y presentar
     * REQUERIDO:
     * Si la sala de cine tiene menos de 3 películas presente un mensaje “Sala casi Vacía”
     * Si la sala de cine tiene entre 3 y 5 películas, presente “Sala casi Llena”
     * Si la sala de cine tiene más de 5 películas presente “Sala Llena”
    */
    @GetMapping("/estado")
    public String estadoSala(@RequestBody SegundoRequerimiento segundo){
        return servPS.peliPorSala(segundo.getNombreSala());
        
    }
}
