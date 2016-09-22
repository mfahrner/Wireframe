package com.theironyard.charlotte;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mfahrner on 9/21/16.
 */
@Controller
public class WireframeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
        Company company = new Company("YaMAMA Inc.", "We manage the world's largest database of YaMAMA jokes");

        model.addAttribute("name", company.getName());
        model.addAttribute("text", company.getDescription());
        return "home";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String addMessage(Model model, String email, String message) {
        List<Message> messageList = new ArrayList<>();
        Message m = new Message(email, message);
        messageList.add(m);
        return "redirect:/";
    }



}
