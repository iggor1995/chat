package ru.igor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.igor.entity.User;
import ru.igor.service.api.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showRegisterPage(){
        return "registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("name") String name, @RequestParam("password") String password,
                           @RequestParam("login") String login, @ModelAttribute("model")ModelMap model){
        User user = new User(name, login, password);
        userService.register(user);
        return "home";
    }
}
