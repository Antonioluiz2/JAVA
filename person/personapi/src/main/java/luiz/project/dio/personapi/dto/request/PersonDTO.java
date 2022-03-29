package luiz.project.dio.personapi.dto.request;


import luiz.project.dio.personapi.entity.Person;
import java.util.List;



public class PersonDTO extends Person {
  

    private Long id;
    
    private String firstName;

   
   
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneDTO> phones;
}