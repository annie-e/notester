/*
    Hackville Project - Notester Java File - Note.java
    Created by: Team Hamstarz
    Created on: Jan 14-15, 2022
*/

package ca.hackville.hamstarz.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Note implements Serializable {
	
	private static final long serialVersionUID = 292065859364113324L;
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String date;
	private String courseName;
        private String courseCode;
	private String notes;
}
