package com.notesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.notesapp.model.Note;
import com.notesapp.service.NoteService;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService service;

    @PostMapping
    public Note create(@RequestBody Note note) {
        return service.create(note);
    }

    @GetMapping
    public List<Note> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Note getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Note update(@PathVariable Long id, @RequestBody Note note) {
        return service.update(id, note);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}