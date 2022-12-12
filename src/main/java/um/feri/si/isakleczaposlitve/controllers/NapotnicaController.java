package um.feri.si.isakleczaposlitve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import um.feri.si.isakleczaposlitve.dao.NapotnicaRepository;
import um.feri.si.isakleczaposlitve.models.Napotnica;

import java.util.Optional;

@RestController
@RequestMapping("/Napotnica")
public class NapotnicaController {
    @Autowired
    private NapotnicaRepository napotnicaDao;
    @GetMapping("/getAll")
    public Iterable<Napotnica> vrniVseNapotnice(){
        return napotnicaDao.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Napotnica> vrniNapotniceById(@PathVariable(name = "id") long id){
        return napotnicaDao.findById(id);
    }
    @PostMapping("/addNapotnica")
    public Napotnica dodajNapotnice(@RequestBody Napotnica oglas){
        return napotnicaDao.save(oglas);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Napotnica> updateNapotnice(@PathVariable long id,@RequestBody Napotnica napotniceDetails) {
        Optional<Napotnica> updateOglas = napotnicaDao.findById(id);

        Napotnica vao = updateOglas.get();
        napotnicaDao.save(napotniceDetails);

        return ResponseEntity.ok(vao);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Napotnica> deleteNapotnica(@PathVariable("id") long id) {
        Optional<Napotnica> val = napotnicaDao.findById(id);

        Napotnica vao=val.get();
        napotnicaDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

    @GetMapping("/vsota-napotnice/{vsota}")
    public Iterable<Napotnica> vrniNapotnicepoDenarju(@PathVariable(name = "vsota") double vsota){
        return napotnicaDao.vrniNapotnicepoDenarju(vsota);
    }
}
