package ma.emsi.demo.repositories;

import ma.emsi.demo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
