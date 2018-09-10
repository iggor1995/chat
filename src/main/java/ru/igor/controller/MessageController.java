package ru.igor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.igor.entity.message.Message;
import ru.igor.entity.message.RegularMessage;
import ru.igor.service.api.MessageService;

import java.time.LocalDateTime;

@Controller
public class MessageController {

    @Autowired
    MessageService messageService;

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String home(){
//
//        Message message  = new RegularMessage();
//        ((RegularMessage) message).setContent("asda");
//        message.setTime(LocalDateTime.now());
//        message.setUserId(1);
//        return "home";
//    }
}
