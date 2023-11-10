
package com.iri.CarteleraCine2.controladores;

import com.iri.CarteleraCine2.Servicios.PeliculaSalaCineServicio;
import com.iri.CarteleraCine2.entidades.PeliculaSalaCine;
import com.iri.CarteleraCine2.requerimientos.PrimerRequerimiento;
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
}
