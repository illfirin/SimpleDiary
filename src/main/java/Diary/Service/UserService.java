package Diary.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.Dao.UserDao;
import system.Model.User;

@Service
public class UserService
{
    @Autowired
    private UserDao user_dao;
    public List<User> getAllUsers()
    {
        return user_dao.getAllUsers;
    }

}