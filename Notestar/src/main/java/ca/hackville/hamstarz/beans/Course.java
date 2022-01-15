package ca.hackville.hamstarz.beans;
import java.io.Serializable;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable {
	
private static final long serialVersionUID = 292065859364113324L;
	
	private long id;
	private String courseName;
	private String courseCode;
}
