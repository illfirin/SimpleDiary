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
    public int save(Note note)
    {
        String sql = "insert into Notes_table (id, title, content, tags, creation_time)
        values('+note.getId()+', '"+note.getTitle()+"', '"+note.getContent()+"', '"+note.getTags()+"'
            , '"+note.getCreation_time+"')";
        return template.update(sql);
    }

    public int update(Note note)
    {
        String sql = "update Notes_table set id = '+note.getId()+', title='"+note.getTitle()+"', content="'+note.getContent()+'",tags='"+note.getTags()+"',
                        creation_time='"+note.getCreation_time()+"' ";
        return template.update(sql);
    }

    public int delete(Note note)
    {
        String sql = "select * from Notes_table where id =?";
        return template.queryForObject(sql, new Object[]{id}, new BeadPropertyRowMapper<Note>(Note.classs));

    }

    public User getNoteById(int id)
    {
        String sql = "select * from Notes_table where id =" + id + "";
        return template.update(sql);
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
