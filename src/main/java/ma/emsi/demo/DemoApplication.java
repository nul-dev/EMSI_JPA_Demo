package ma.emsi.demo;

import ma.emsi.demo.entities.Patient;
import ma.emsi.demo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "AB123456", "MERZAK", "Mohamed", "Casablanca", new Date(), true));
        patientRepository.save(new Patient(null, "AB123456", "AGOURRAM", "Yassine", "Casablanca", new Date(), true));

        patientRepository.findAll().forEach(System.out::println);

        patientRepository.findByLastnameContainsOrFirstnameContains("ZAK", "ine").forEach(System.out::println);

    }
}
