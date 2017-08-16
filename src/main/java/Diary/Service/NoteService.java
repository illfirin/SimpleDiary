package Diary.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Diary.DAO.NoteDao;
import Diary.Model.User;

@Service
public class NoteService
{
    @Autowired
    private NoteDao note_dao;

    public List<Note> getAllNotes()
    {
        return note_dao.getAllNotes();
    }
}