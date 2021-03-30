package ma.emsi.demo.repositories;

import ma.emsi.demo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public List<Patient> findByLastnameContainsOrFirstnameContains(String lastname, String firstname);
}
