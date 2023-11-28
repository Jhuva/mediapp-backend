package mitocode.mediappbackend.controller;

import mitocode.mediappbackend.model.Patient;
import mitocode.mediappbackend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

        @GetMapping
        public String sayHello() {
        //Patient patient = new Patient(1, "jhuvael");
        return service.sayHello(null);
    }

}
