package tn.esprit.foyersae.services;

import org.springframework.stereotype.Service;
import tn.esprit.foyersae.entite.Chambre;
import tn.esprit.foyersae.repositories.ChambreRepository;

import java.util.List;
@Service

public class ChambreServiceImpl  implements IChambreService {
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }

    @Override
    public List<Chambre> getAllChambre() {
        return null;
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
      return   chambreRepository.save(chambre);
    }
}
