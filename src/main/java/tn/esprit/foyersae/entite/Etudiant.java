package tn.esprit.foyersae.entite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEtudiant;
    private  String nomEt;
    private  String prenomEt;
    private  Long cin;
    private String ecole ;
    private Date dateNaissance ;


    @ManyToMany (mappedBy = "rsv")
    List<Reservation> rsr;


}
