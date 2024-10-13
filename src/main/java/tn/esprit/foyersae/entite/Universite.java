package tn.esprit.foyersae.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversitaire;
    private String nomUniversitaire;
    private String adresse;


<<<<<<< HEAD
    //
    @OneToOne
    private Foyer F;
=======
    @OneToOne
    private  Foyer f;

>>>>>>> af93d5f8a65296dfac7e29b1e5a587499217a48c
}
