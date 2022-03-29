package luiz.project.dio.personapi.service;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import luiz.project.dio.personapi.dto.request.PersonDTO;
import luiz.project.dio.personapi.dto.response.MessageResponseDTO;
import luiz.project.dio.personapi.entity.Person;
import luiz.project.dio.personapi.exception.PersonNotFoundException;
//import luiz.project.dio.personapi.exception.PersonNotFoundException;
import luiz.project.dio.personapi.mapper.PersonMapper;
import luiz.project.dio.personapi.repository.PersonRepository;

//import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.stream.Collectors;


@Service
//@AllArgsConstructor(onConstructor = @__(@Autowired))
@Configuration
public class PersonService {
	

	 private PersonRepository personRepository;

	    private final PersonMapper personMapper = PersonMapper.INSTANCE;

	    public Object createPerson(PersonDTO personDTO) {
	        Person personToSave = personMapper.toModel(personDTO);

	        Person savedPerson = personRepository.save(personToSave);
	        return createMessageResponse(savedPerson.toString(), "Created person with ID ");
	    }

	    private Object createMessageResponse(String string, String string2) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<PersonDTO> listAll() {
	        List<Person> allPeople = personRepository.findAll();
	        return allPeople.stream()
	                .map(personMapper::toDTO)
	                .collect(Collectors.toList());
	    }

	   public PersonDTO findById(Long id) {
	        Person person = verify(id);

	        return personMapper.toDTO(person);
	    }

	    public void delete(Long id)  {
	        verify(id);
	        personRepository.deleteById(id);
	    }

	    private Person verify(Long id) {
			return null;
			
		}

		/*public Object updateById(Long id, PersonDTO personDTO) {
	        verify(id);

	        Person personToUpdate = personMapper.toModel(personDTO);

	        Person updatedPerson = personRepository.save(personToUpdate);
	        return createMessageResponse(updatedPerson.getId(), "Updated person with ID ");
	    }

		/*private static Object createMessageResponse(Long id, String message) {
	        return MessageResponseDTO
	                .builder()
	                .message(message + id)
	                .equals(message);
	                
	        
	   
	    }*/
}
