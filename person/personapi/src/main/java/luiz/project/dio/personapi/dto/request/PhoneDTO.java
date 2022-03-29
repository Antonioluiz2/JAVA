package luiz.project.dio.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import luiz.project.dio.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
	private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

   
    private String number;
   
}
