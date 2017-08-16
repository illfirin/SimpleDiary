package Diary.DAO;

import org.hibernate.exception.spi.SQLExceptionConversionDelegate;
import org.springframework.stereotype.Repository;
import Diary.Model.Note;

import java.util.Arrays;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Repository
public class NoteDao
{
    JdbcTemplate template;
    public void setTemplate(JdbcTemplate template)
    {
        this.template = template;
    }

    public List<Note> getAllNotes()
    {
       return template.query("select * from Notes_table", new RowMapper<Note>()
       {
          public Note mapRow(ResultSet rs, int row) throws SQLException
          {
              Note note = new Note();

              note.setId(rs.getInt(1));
              note.setTitle(rs.getString(2));
              note.setContent(rs.getString(3))
              note.setTags(rs.getString(4));
              note.setCreation_time(rs.getString(5));

          }

       });
    }

}