package tn.esprit.foyersae.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idReservation ;
    private Date anneeUniversitaire ;
    private  boolean estValide;


}
