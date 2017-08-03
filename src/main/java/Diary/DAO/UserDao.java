package Diary.DAO;

import org.springframework.stereotype.Repository;
import Diary.Model.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao
{
    private List<User> users = {};

    public List<User> getAllUsers()
    {
        return users;
    }

}