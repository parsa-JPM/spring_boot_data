package ir.codefather.data.controller;

import ir.codefather.data.dao.UserRepo;
import ir.codefather.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
