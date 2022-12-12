package um.feri.si.isakleczaposlitve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import um.feri.si.isakleczaposlitve.dao.*;
import um.feri.si.isakleczaposlitve.models.*;

import java.util.Optional;


@RestController
@RequestMapping("/placilo")
public class PlaciloController {
    @Autowired
    private PlaciloRepository placiloDao;
    @Autowired
    private CekPlaciloRepository cekPlaciloDao;
    @Autowired
    private NakaziloNaTrrRepository trrDao;
    @Autowired
    private DenarRepository denarDao;


    @GetMapping("/getAll")
    public Iterable<Placilo> vrniVsaPlacila(){
        return placiloDao.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Placilo> vrniPlaciloById(@PathVariable(name = "id") long id){
        return placiloDao.findById(id);
    }

    //CekPlacilo

    @GetMapping("/cekplacilo/getAll")
    public Iterable<CekPlacilo> vrniVseDelodajalce(){
        return cekPlaciloDao.findAll();
    }
    @GetMapping("/cekplacilo/{id}")
    public Optional<CekPlacilo> vrniDelodajalcaById(@PathVariable(name = "id") long id){
        return cekPlaciloDao.findById(id);
    }
    @PostMapping("/cekplacilo/addCekPlacilo")
    public CekPlacilo dodajPlacilo(@RequestBody CekPlacilo placilo){
        return cekPlaciloDao.save(placilo);
    }

    @PutMapping("/cekplacilo/update/{id}")
    public ResponseEntity<CekPlacilo> updatePlacilo(@PathVariable long id, @RequestBody CekPlacilo delodajalecDetails) {
        Optional<CekPlacilo> updatePlacilo = cekPlaciloDao.findById(id);

        CekPlacilo vao = updatePlacilo.get();
        cekPlaciloDao.save(delodajalecDetails);

        return ResponseEntity.ok(vao);
    }

    @DeleteMapping("/cekplacilo/delete/{id}")
    public ResponseEntity<CekPlacilo> deletePlacilo(@PathVariable("id") long id) {
        Optional<CekPlacilo> val = cekPlaciloDao.findById(id);

        CekPlacilo vao=val.get();
        cekPlaciloDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

    //iskalec dela

    @GetMapping("/NakaziloNaTrr/getAll")
    public Iterable<NakaziloNaTRR> vrniVsaNakazila(){
        return trrDao.findAll();
    }
    @GetMapping("/NakaziloNaTrr/{id}")
    public Optional<NakaziloNaTRR> vrniNakaziloById(@PathVariable(name = "id") long id){
        return trrDao.findById(id);
    }
    @PostMapping("/NakaziloNaTrr/addIskalec")
    public NakaziloNaTRR dodajNakazilo(@RequestBody NakaziloNaTRR nakazilo){
        return trrDao.save(nakazilo);
    }

    @PutMapping("/NakaziloNaTrr/update/{id}")
    public ResponseEntity<NakaziloNaTRR> updateNakazilo(@PathVariable long id, @RequestBody NakaziloNaTRR iskalecDetails) {
        Optional<NakaziloNaTRR> updateNakazilo = trrDao.findById(id);

        NakaziloNaTRR vao = updateNakazilo.get();
        trrDao.save(iskalecDetails);

        return ResponseEntity.ok(vao);
    }
    @DeleteMapping("/NakaziloNaTrr/delete/{id}")
    public ResponseEntity<NakaziloNaTRR> deleteNakazilo(@PathVariable("id") long id) {
        Optional<NakaziloNaTRR> val = trrDao.findById(id);

        NakaziloNaTRR vao=val.get();
        trrDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

    //admin

    @GetMapping("/denar/getAll")
    public Iterable<Denar> vrniVesDenar(){
        return denarDao.findAll();
    }
    @GetMapping("/denar/{id}")
    public Optional<Denar> vrniDenarById(@PathVariable(name = "id") long id){
        return denarDao.findById(id);
    }


    @PostMapping("/denar/addIskalec")
    public Denar dodajDenar(@RequestBody Denar uporabnik){
        return denarDao.save(uporabnik);
    }

    @PutMapping("/denar/update/{id}")
    public ResponseEntity<Denar> updateDenar(@PathVariable long id, @RequestBody Denar adminDetails) {
        Optional<Denar> updateDenar = denarDao.findById(id);

        Denar vao = updateDenar.get();
        denarDao.save(adminDetails);

        return ResponseEntity.ok(vao);
    }
    @DeleteMapping("/denar/delete/{id}")
    public ResponseEntity<Denar> deleteDenar(@PathVariable("id") long id) {
        Optional<Denar> val = denarDao.findById(id);

        Denar vao=val.get();
        denarDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

}
