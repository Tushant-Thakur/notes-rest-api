package com.notesapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.notesapp.model.Note;
import com.notesapp.repository.NoteRepository;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository repo;

    public Note create(Note note) {
        return repo.save(note);
    }

    public List<Note> getAll() {
        return repo.findAll();
    }

    public Note getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Note update(Long id, Note newNote) {
        Note note = repo.findById(id).orElse(null);
        if (note != null) {
            note.setTitle(newNote.getTitle());
            note.setContent(newNote.getContent());
            return repo.save(note);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}