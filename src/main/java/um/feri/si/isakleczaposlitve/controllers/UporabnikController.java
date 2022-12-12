package um.feri.si.isakleczaposlitve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import um.feri.si.isakleczaposlitve.dao.AdminRepository;
import um.feri.si.isakleczaposlitve.dao.DelodajalecRepository;
import um.feri.si.isakleczaposlitve.dao.IskalecRepository;
import um.feri.si.isakleczaposlitve.dao.UporabnikRepository;
import um.feri.si.isakleczaposlitve.models.*;


import java.util.Optional;

@RestController
@RequestMapping("/uporabnik")
public class UporabnikController {
    @Autowired
    private UporabnikRepository uporabnikDao;
    @Autowired
    private DelodajalecRepository delodajalecDao;
    @Autowired
    private AdminRepository adminDao;
    @Autowired
    private IskalecRepository iskalecDao;


    @GetMapping("/getAll")
    public Iterable<Uporabnik> vrniVseUporabnike(){
        return uporabnikDao.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Uporabnik> vrniUporabnikaById(@PathVariable(name = "id") long id){
        return uporabnikDao.findById(id);
    }

    //delodajalec

    @GetMapping("/delodajalec/getAll")
    public Iterable<Delodajalec> vrniVseDelodajalce(){
        return delodajalecDao.findAll();
    }
    @GetMapping("/delodajalec/{id}")
    public Optional<Delodajalec> vrniDelodajalcaById(@PathVariable(name = "id") long id){
        return delodajalecDao.findById(id);
    }
    @PostMapping("/delodajalec/addDelodajalec")
    public Delodajalec dodajDelodajalca(@RequestBody Delodajalec uporabnik){
        return delodajalecDao.save(uporabnik);
    }

    @PutMapping("/delodajalec/update/{id}")
    public ResponseEntity<Delodajalec> updateDelodajalec(@PathVariable long id, @RequestBody Delodajalec delodajalecDetails) {
        Optional<Delodajalec> updateDelodajalec = delodajalecDao.findById(id);

        Delodajalec vao = updateDelodajalec.get();
        delodajalecDao.save(delodajalecDetails);

        return ResponseEntity.ok(vao);
    }

    @DeleteMapping("/delodajalec/delete/{id}")
    public ResponseEntity<Delodajalec> deletePodjetje(@PathVariable("id") long id) {
        Optional<Delodajalec> val = delodajalecDao.findById(id);

        Delodajalec vao=val.get();
        delodajalecDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

    //iskalec dela

    @GetMapping("/iskalec/getAll")
    public Iterable<Iskalec> vrniVseIskalce(){
        return iskalecDao.findAll();
    }
    @GetMapping("/iskalec/{id}")
    public Optional<Iskalec> vrniIskalcaById(@PathVariable(name = "id") long id){
        return iskalecDao.findById(id);
    }
    @PostMapping("/iskalec/addIskalec")
    public Iskalec dodajIskalca(@RequestBody Iskalec uporabnik){
        return iskalecDao.save(uporabnik);
    }

    @PutMapping("/iskalec/update/{id}")
    public ResponseEntity<Iskalec> updateIskalec(@PathVariable long id, @RequestBody Iskalec iskalecDetails) {
        Optional<Iskalec> updateIskalec = iskalecDao.findById(id);

        Iskalec vao = updateIskalec.get();
        iskalecDao.save(iskalecDetails);

        return ResponseEntity.ok(vao);
    }
    @DeleteMapping("/iskalec/delete/{id}")
    public ResponseEntity<Iskalec> deleteIskalec(@PathVariable("id") long id) {
        Optional<Iskalec> val = iskalecDao.findById(id);

        Iskalec vao=val.get();
        iskalecDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

    //admin

    @GetMapping("/admin/getAll")
    public Iterable<Admin> vrniVseAdmine(){
        return adminDao.findAll();
    }
    @GetMapping("/admin/{id}")
    public Optional<Admin> vrniAdmineById(@PathVariable(name = "id") long id){
        return adminDao.findById(id);
    }


    @PostMapping("/admin/addIskalec")
    public Admin dodajAdmin(@RequestBody Admin uporabnik){
        return adminDao.save(uporabnik);
    }

    @PutMapping("/admin/update/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable long id, @RequestBody Admin adminDetails) {
        Optional<Admin> updateAdmin = adminDao.findById(id);

        Admin vao = updateAdmin.get();
        adminDao.save(adminDetails);

        return ResponseEntity.ok(vao);
    }
    @DeleteMapping("/admin/delete/{id}")
    public ResponseEntity<Admin> deleteAdmin(@PathVariable("id") long id) {
        Optional<Admin> val = adminDao.findById(id);

        Admin vao=val.get();
        adminDao.delete(vao);

        return ResponseEntity.ok(vao);
    }


    @GetMapping("/informatiki")
    public Iterable<Iskalec> najboljsiInformatiki(){
        return iskalecDao.kader_informatikov();
    }


}

