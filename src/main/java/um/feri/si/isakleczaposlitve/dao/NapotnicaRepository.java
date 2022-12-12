package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Admin;
import um.feri.si.isakleczaposlitve.models.Napotnica;

import java.util.List;

public interface NapotnicaRepository extends CrudRepository<Napotnica, Long> {
    @Query("select h from Napotnica h, Placilo s where h.placilo = s and s.vsotaDenarja > ?1")
    List<Napotnica> vrniNapotnicepoDenarju(Double vsota);
}
