package ca.hackville.hamstarz.controllers;


import ca.hackville.hamstarz.beans.Note;
import ca.hackville.hamstarz.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    
    @Autowired
    NoteRepository noteRepo;
    
    
    @GetMapping("/")
    public String goHome() {
        return "index";
    }
    
    @RequestMapping("/addNote")
    public String goAddNote(Model model){
        model.addAttribute("note", new Note());
        return "addnote";
    }
    
    @RequestMapping(value = "/addNote", params = "save")
    public String addNewNote(@ModelAttribute Note note){
        noteRepo.save(note);
        return "redirect:/addNote";
    }
    
    @RequestMapping(value = "/addNote", params = "cancel")
    public String cancel(){
        return "redirect:/";
    }
            
    @RequestMapping("/viewNote")
    public String goViewNote(Model model) {
        model.addAttribute("notes", noteRepo.findAll());
        return "viewNote";
    }
    
    @RequestMapping(value = "/viewNote", params = "code")
    public String goSortedNote(Model model, @RequestParam String courseCode){
        model.addAttribute("sortedNotes", noteRepo.findByCourseCode(courseCode));
        model.addAttribute("notes", noteRepo.findAll());
        return "sortedNotes";
    }
    
    @RequestMapping(value = "/viewNote", params = "view")
    public String goIndividualNote(Model model, @RequestParam int noteId){
        Note viewNote = noteRepo.findById(noteId).get();
        model.addAttribute("viewNote", viewNote);
        return "viewIndividualNote";
    }
    
    @RequestMapping(value = "/updateNote", params = "edit")
    public String editNote(Model model, @RequestParam int noteId){
        Note editNote = noteRepo.findById(noteId).get();
        model.addAttribute("editnote", editNote);
        return "editnote";
    }
    
    @RequestMapping(value = "/editNote", params = "save")
    public String saveEditedNote(@ModelAttribute Note editnote){
        noteRepo.save(editnote);
        return "redirect:/viewNote?noteId="+ editnote.getId()+"&view=View+Note";
    }
    
    @RequestMapping(value = "/editNote", params = "cancel")
    public String editCancel(@ModelAttribute Note editnote){
        return "redirect:/viewNote?noteId="+ editnote.getId()+"&view=View+Note";
    }
    
    @RequestMapping(value = "/updateNote", params = "delete")
    public String deleteNote(@RequestParam int noteId){
        Note deleteNote = noteRepo.findById(noteId).get();
        noteRepo.delete(deleteNote);
        return "redirect:/viewNote";
    }
}
