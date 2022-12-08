package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Admin;
import um.feri.si.isakleczaposlitve.models.Oglas;

public interface AdminRepository extends CrudRepository<Admin, Long> {
}
