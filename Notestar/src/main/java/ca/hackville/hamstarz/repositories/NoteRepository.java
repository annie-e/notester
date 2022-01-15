package ca.hackville.hamstarz.repositories;

import ca.hackville.hamstarz.beans.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Integer>{

}
