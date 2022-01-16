/*
    Hackville Project - Notester Java File - NoteRepository.java
    Created by: Team Hamstarz
    Created on: Jan 14-15, 2022
*/

package ca.hackville.hamstarz.repositories;

import ca.hackville.hamstarz.beans.Note;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {
    List<Note> findByCourseCode(String code);
}
