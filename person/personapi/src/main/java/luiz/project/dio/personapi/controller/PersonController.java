package luiz.project.dio.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.Builder;
//import lombok.AllArgsConstructor;
import luiz.project.dio.personapi.dto.request.PersonDTO;
import luiz.project.dio.personapi.dto.response.MessageResponseDTO;
import luiz.project.dio.personapi.entity.Person;
import luiz.project.dio.personapi.repository.PersonRepository;
//import luiz.project.dio.personapi.entity.Person;
//import luiz.project.dio.personapi.exception.PersonNotFoundException;
import luiz.project.dio.personapi.service.PersonService;

import java.util.List;
@RestController
@RequestMapping("/api/v1/people")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {
	private PersonRepository personRepository;

	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository=personRepository;
	}

    @PostMapping
    public String createPerson(@RequestBody Person person) {
    	Person save= personRepository.save(person);
    	return MessageResponseDTO.builder();
    			
    }
    	  
	
   /* @ResponseStatus(code= HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Validated PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }

    @GetMapping
   public List<Person> listAll() {
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id)  {
        return findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Validated PersonDTO personDTO)  {
        return updateById(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)  {
        personService.delete(id);
    }*/
}
