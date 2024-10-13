package tn.esprit.foyersae.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private  Long capaciteBloc;

<<<<<<< HEAD



//
    @ManyToOne()
    private Foyer F;

    @OneToMany()
    private List<Chambre> CH;
=======

    @ManyToOne
    private  Foyer f;

@OneToMany
    List<Chambre>c;
>>>>>>> af93d5f8a65296dfac7e29b1e5a587499217a48c


}
