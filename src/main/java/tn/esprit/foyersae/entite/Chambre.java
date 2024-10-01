package tn.esprit.foyersae.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private  Long numeroChambre;

    @Enumerated(EnumType.STRING)

    private  TypeChambre typeC;

    @ManyToOne
    private Bloc b;


    @OneToMany
    List<Reservation> rsv;

}
