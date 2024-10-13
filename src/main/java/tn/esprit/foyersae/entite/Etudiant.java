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


<<<<<<< HEAD

    @ManyToMany(mappedBy = "E")
    private List<Reservation> R;
=======
    @ManyToMany (mappedBy = "rsv")
    List<Reservation> rsr;

>>>>>>> af93d5f8a65296dfac7e29b1e5a587499217a48c

}
