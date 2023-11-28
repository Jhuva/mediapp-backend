package mitocode.mediappbackend.service;

import mitocode.mediappbackend.model.Patient;
import mitocode.mediappbackend.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepo repo;

    public String sayHello(Patient patient) {
        return repo.sayHello(patient);
    }

}
