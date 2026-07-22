package com.notesapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.notesapp.model.Note;
import com.notesapp.repository.NoteRepository;
import com.notesapp.exception.ResourceNotFoundException;

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
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Note not found with id: " + id));
    }

    public Note update(Long id, Note newNote) {

        // 🔥 FIXED: No null, proper exception
        Note note = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Note not found with id: " + id));

        note.setTitle(newNote.getTitle());
        note.setContent(newNote.getContent());

        return repo.save(note);
    }

    public void delete(Long id) {

        // 🔥 FIXED: check before delete
        Note note = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Note not found with id: " + id));

        repo.delete(note);
    }
}