package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Admin;
import um.feri.si.isakleczaposlitve.models.Delodajalec;
import um.feri.si.isakleczaposlitve.models.Iskalec;

import java.util.List;

public interface DelodajalecRepository extends CrudRepository<Delodajalec, Long> {
    @Query("select h from Delodajalec h where h.username is not null and h.napotnica is not null")
    List<Delodajalec> kader_informatikov();

}
