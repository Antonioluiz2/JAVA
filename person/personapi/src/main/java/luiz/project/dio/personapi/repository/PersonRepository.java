package luiz.project.dio.personapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import luiz.project.dio.personapi.entity.Person;
public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
