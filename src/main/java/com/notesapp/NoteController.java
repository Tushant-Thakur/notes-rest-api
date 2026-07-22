package com.notesapp;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteRepository repository;

    public NoteController(NoteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return repository.save(note);
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note updatedNote) {
        Note note = repository.findById(id).orElse(null);

        if (note != null) {
            note.setTitle(updatedNote.getTitle());
            note.setContent(updatedNote.getContent());
            return repository.save(note);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteNote(@PathVariable Long id) {
        repository.deleteById(id);
        return "Note deleted successfully";
    }
}