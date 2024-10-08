package tn.esprit.foyersae.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae.entite.Chambre;
import tn.esprit.foyersae.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")

public class ChambreController {
    IChambreService chambreService;

    @GetMapping("/get-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.getAllChambre();
        return listChambres;
    }


    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void deleteChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.deleteChambre(chId);
    }
    @PutMapping("/modify-chambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }}
