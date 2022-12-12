package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Iskalec;
import um.feri.si.isakleczaposlitve.models.Oglas;

import java.util.List;

public interface IskalecRepository extends CrudRepository<Iskalec, Long> {
@Query("select h from Iskalec h where h.statusStudenta = true and h.letnik >= 2 and h.smerStudija = 'Informatika'")
    List<Iskalec> kader_informatikov();
}
