package luiz.project.dio.personapi.dto.response;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class MessageResponseDTO {
	private static String message;
	MessageResponseDTO(){
		builder();
		build();
		message();
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Ola Amigo!!!");
	}

	
	public static String builder() {
		
		 	return  " Hello World";
	}
	public static String build() {
		
	 	return  " Hello World";
}
	public static String message() {
		return message;
		
	}
	
}
