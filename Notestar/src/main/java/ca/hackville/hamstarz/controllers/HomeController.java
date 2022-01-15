package ca.hackville.hamstarz.controllers;

import ca.hackville.hamstarz.beans.Note;
import ca.hackville.hamstarz.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("newNote", new Note());
        return "addnote";
    }
    
    @RequestMapping(value = "/addNote", params = "save")
    public String addNewNote(@ModelAttribute Note note){
        noteRepo.save(note);
        return "redirect:/addnote";
    }
    
    @RequestMapping(value = "/addNote", params = "cancel")
    public String cancel(){
        return "redirect:/";
    }
            
    @GetMapping("/viewNote")
    public String goViewNote(Model model) {
        model.addAttribute("note", noteRepo.findAll());
        return "viewNote";
    }
}
