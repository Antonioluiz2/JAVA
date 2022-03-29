package luiz.project.dio.personapi.mapper;

import org.springframework.web.bind.annotation.GetMapping;
import luiz.project.dio.personapi.dto.request.PersonDTO;
import luiz.project.dio.personapi.entity.Person;

import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper

public class PersonMapper {
	public static PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @GetMapping(consumes = "birthDate", value = "birthDate", produces = "dd-MM-yyyy")
	public
    Person toModel(PersonDTO personDTO) {
		return null;
	}

    public PersonDTO toDTO(Person person) {
		return null;
	}
}
