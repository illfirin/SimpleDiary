package diary.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import Diary.Model.User;
import Diary.Service.UserService;
import java.annotation.NonNull;

@Controller
public class UserController
{
    @Autowired
    UserDao dao;

    @RequestMapping("/userform")
    public ModelAndView showform()
    {
        return new ModelAndView("userform", "comand", new User());
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("usr") User usr)
    {
        dao.save(usr);
        return new ModelAndView("redirect:/login");
    }

    @RequestMapping(value ="/validate", method = RequestMethod.GET)
    public ModelAndView validateUser(User user)
    {
        ModelAndView modAndView = new ModelAndView();
        modAndView.addObject("userFromServer", user);
        modAndView.setViewName("home");
        return modAndView;
    }

    @RequestMapping(value ="/check", method = RequestMethod.POST)
    public @ResponseBody
    String checkUser(@ModelAttribute("userFromServer") User user)
    {
        if( @NonNull dao.getName(user) && user.getPassword(dao.getUserByName(user.getName))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }



}
