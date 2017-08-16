package Diary.Model;

public class User
{
    private String login;
    private String password;
    private int UserId;

    public User()
    {

    }

    public User(String login, String password)
    {
        this.login = login;
        this.password = password;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin()
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    @Override
    public String toString()
    {
        return "User{"+ "name="+ '\'' + ", password="
    }


}