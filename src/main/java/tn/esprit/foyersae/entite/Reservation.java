package tn.esprit.foyersae.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    private String idReservation ;
    private Date anneeUniversitaire ;
    private  boolean estValide;

<<<<<<< HEAD
    //

    @ManyToOne
    private Chambre CH ;

    @ManyToMany
    private List<Etudiant> E;
=======
    @ManyToMany
    List<Etudiant> etd;

>>>>>>> af93d5f8a65296dfac7e29b1e5a587499217a48c

}
