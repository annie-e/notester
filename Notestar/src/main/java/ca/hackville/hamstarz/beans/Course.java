package ca.hackville.hamstarz.beans;
import java.io.Serializable;

import lombok.*;
//Xiaoya

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable {
	
private static final long serialVersionUID = 292065859364113324L;
	
	private int id;
	private String courseName;
	private String courseCode;
}
