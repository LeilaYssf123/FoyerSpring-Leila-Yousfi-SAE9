package tn.esprit.foyersae.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae.entite.Etudiant;
import tn.esprit.foyersae.entite.Foyer;
import tn.esprit.foyersae.services.IEtudiantService;
import tn.esprit.foyersae.services.IFoyerService;

import java.util.List;

public class FoyerController {

    IFoyerService iFoyerService;

    @GetMapping("/get-all-Foyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyer = iFoyerService.getAllFoyer();
        return listFoyer;
    }


    @PostMapping("/add-Foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = iFoyerService.addFoyer(f);
        return foyer;
    }

    @DeleteMapping("/delete-foyer/{foyer-id}")
    public void deleteFoyer(@PathVariable("foyer-id") Long IdFoyer) {
        iFoyerService.deleteFoyer(IdFoyer);
    }
    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer= iFoyerService.updateFoyer(f);
        return foyer;
    }}

