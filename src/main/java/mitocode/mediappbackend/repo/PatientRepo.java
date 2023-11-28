package mitocode.mediappbackend.repo;

import mitocode.mediappbackend.model.Patient;
import org.springframework.stereotype.Repository;

@Repository //Estereotipo
public class PatientRepo {
    public String sayHello(Patient patient) {
        return "Hello " + patient.getFirstname();
    }
}
