package com.secure.notes.repositories;


import com.secure.notes.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUserName(String ownerUserName);
}