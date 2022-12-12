package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Admin;
import um.feri.si.isakleczaposlitve.models.Denar;

public interface DenarRepository extends CrudRepository<Denar, Long> {
}
