package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Bloc;
import tn.esprit.foyersae.entite.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant (Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    List<Etudiant> getAllEtudiant ();
    Etudiant updateEtudiant (Etudiant etudiant);

}
