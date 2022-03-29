package luiz.project.dio.personapi.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import luiz.project.dio.personapi.dto.response.MessageResponseDTO;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME(),
    MOBILE(),
    COMMERCIAL();

  
	private final String description = "PhoneType";
	
}

