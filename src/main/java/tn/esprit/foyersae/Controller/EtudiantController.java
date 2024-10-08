package tn.esprit.foyersae.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae.entite.Bloc;
import tn.esprit.foyersae.entite.Etudiant;
import tn.esprit.foyersae.services.IBlocService;
import tn.esprit.foyersae.services.IEtudiantService;

import java.util.List;

public class EtudiantController {
    IEtudiantService iEtudiantService;

    @GetMapping("/get-all-Etudiant")
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiant = iEtudiantService.getAllEtudiant();
        return listEtudiant;
    }


    @PostMapping("/add-Etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = iEtudiantService.addEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/delete-etudiant/{etudiant-id}")
    public void deleteEtudiant(@PathVariable("etudiant-id") Long IdEtudiant) {
        iEtudiantService.deleteEtudiant(IdEtudiant);
    }
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= iEtudiantService.updateEtudiant(e);
        return etudiant;
    }}
