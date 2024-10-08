package tn.esprit.foyersae.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae.entite.Etudiant;
import tn.esprit.foyersae.entite.Universite;
import tn.esprit.foyersae.services.IEtudiantService;
import tn.esprit.foyersae.services.IUniversiteService;

import java.util.List;

public class UniversiteController {

    IUniversiteService iUniversiteService;

    @GetMapping("/get-all-Universite")
    public List<Universite> getUniversite() {
        List<Universite> listUniversite= iUniversiteService.getAllUniveriste();
        return listUniversite;
    }


    @PostMapping("/add-Universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = iUniversiteService.addUniveriste(u);
        return universite;
    }

    @DeleteMapping("/delete-etudiant/{etudiant-id}")
    public void deleteUniversite(@PathVariable("universite-id") Long IdUniversite) {
        iUniversiteService.deleteUniversite(IdUniversite);
    }
    @PutMapping("/update-etudiant")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite= iUniversiteService.updateUniversite(u);
        return universite;
    }}

