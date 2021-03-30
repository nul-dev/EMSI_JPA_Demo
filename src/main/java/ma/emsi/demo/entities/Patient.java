package ma.emsi.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "Patients")
public class Patient {
    @Id @Column(name = "PatientId") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idCardNumber, lastname, firstname, address;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private boolean sex;
}
