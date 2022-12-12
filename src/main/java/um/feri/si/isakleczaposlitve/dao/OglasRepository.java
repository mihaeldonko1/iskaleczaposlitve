package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Napotnica;
import um.feri.si.isakleczaposlitve.models.Oglas;
import um.feri.si.isakleczaposlitve.models.Podjetje;

import java.util.List;

public interface OglasRepository extends CrudRepository<Oglas, Long> {
@Query("select h from Oglas h where h.urnaPostavka > 6.0 and h.tipDela = 'Nefizicno' and h.podjetje is not null ")
    List<Oglas> najboljsiOglasi();

    @Query("select h from Oglas h, Delodajalec s where h.delodajalec = s and s.ime = ?1")
    List<Oglas> vrniOglaseOd(String ime);

}
