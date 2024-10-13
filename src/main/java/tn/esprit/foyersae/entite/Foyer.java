package tn.esprit.foyersae.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.Set;
>>>>>>> af93d5f8a65296dfac7e29b1e5a587499217a48c

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    //
    @OneToOne(mappedBy = "F")
    private  Universite U;



    @OneToMany(mappedBy = "F")
     private List <Bloc> B;


  @OneToOne (mappedBy = "unv")
    private  Universite un;

  @OneToMany
  Set<Bloc> b;

}

