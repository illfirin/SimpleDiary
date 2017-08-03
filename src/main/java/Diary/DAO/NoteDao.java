package Diary.DAO;

import org.springframework.stereotype.Repository;
import Diary.Model.Note;

import java.util.Arrays;
import java.util.List;

@Repository
public class Note
{
    private List<Note> notes = {};

    public List<Note> fetAllNotes()
    {
        return notes;
    }
}
