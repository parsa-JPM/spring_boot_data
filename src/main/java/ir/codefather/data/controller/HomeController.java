package ir.codefather.data.controller;

import ir.codefather.data.dao.UserRepo;
import ir.codefather.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/addUser")
    public String save(User user) {
        userRepo.save(user);
        return "home.jsp";
    }

    @RequestMapping("/getUser")
    public ModelAndView getUser(String id) {
        ModelAndView mv = new ModelAndView();
//        User user = userRepo.findById(id).orElse(new User());
        //complex query
        User user = userRepo.findByName(id);
        mv.addObject("obj", user);
        mv.setViewName("getUser.jsp");
        return mv;
    }

}
