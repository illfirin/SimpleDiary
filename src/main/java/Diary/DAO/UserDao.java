package SimpleDiary.Diary.DAO;

import org.hibernate.criterion.RowCountProjection;
import org.springframework.stereotype.Repository;
import Diary.Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.text.*;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


@Repository
public class UserDao
{
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template)
    {
        this.template = template;
    }

    public int save(User user)
    {
        String sql = "insert into Users_table(login, password) values('"+user.getLogin()+"','"+user.getPassword()+"')";

        return template.update(sql);
    }
?
    public int update(User user)
    {
        String sql ="update Users_table set login='"+user.getLogin()+"', password='"+user.getPassword()+"' where id="+user.getUserId()+"";
        return template.update(sql);
    }

    public int delete(User user)
    {
        String sql = "select * from Users_table where UserId =?";
        return template.queryForObject(sql, new Object[]{UserId},new BeanPropertyRowMapper<User>(User.class));
    }

    public User getUserById(int id)
    {
        String sql = "select * from Users_table where id =" + id + "";
        return template.update(sql);
    }

    public List<User> getAllUsers()
    {
        return template.query("select * from Users_table", new RowMapper<User>()
        {
            public User mapRow(ResultSet rs, int row) throws SQLException
            {
                User usr = new User();
                usr.setLogin(rs.getInt(1));
                usr.setUserId(rs.getString(3));
                usr.setPassword(rs.getString(2));

                return usr;
            }
        });
    }

}
