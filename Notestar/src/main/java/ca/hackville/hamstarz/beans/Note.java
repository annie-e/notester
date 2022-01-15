package ca.hackville.hamstarz.beans;

import java.io.Serializable;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note implements Serializable {
	
	private static final long serialVersionUID = 292065859364113324L;
	
	private int id;
	private String title;
	private String date;
	private Course course;
	private String notes;
}
