package mitocode.mediappbackend.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {

    private Integer idPatient;
    private String firstname;
    private String lastname;
    private String dni;
    private String address;
    private String phone;
    private String email;

}
