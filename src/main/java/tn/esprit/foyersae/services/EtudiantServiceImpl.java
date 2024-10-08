package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Etudiant;
import tn.esprit.foyersae.repositories.EtudiantRepository;

import java.util.List;

public class EtudiantServiceImpl implements IEtudiantService {

    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return  etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
