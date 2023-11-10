
package com.iri.CarteleraCine2.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author irina
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeliculaSalaCine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date fechaPublicacion;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    
    @ManyToOne
    private Pelicula pelicula;
    
    @ManyToOne
    private SalaCine salaCine;
}
