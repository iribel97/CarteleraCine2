
package com.iri.CarteleraCine2.requerimientos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author irina
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimerRequerimiento {
    private String nombrePelicula;
    private Long idSala;
}
