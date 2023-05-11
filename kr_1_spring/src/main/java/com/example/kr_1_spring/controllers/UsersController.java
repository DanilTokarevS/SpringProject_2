package com.example.kr_1_spring.controllers;

import com.example.kr_1_spring.Entity.Quests;
import com.example.kr_1_spring.Entity.Users;
import com.example.kr_1_spring.serv.QuestsServ;
import com.example.kr_1_spring.serv.UsersServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    private final QuestsServ questsServ;
    private final UsersServ usersServ;

    @Autowired
    public UsersController(QuestsServ questsServ, UsersServ usersServ) {
        this.questsServ = questsServ;
        this.usersServ = usersServ;
    }


    @GetMapping("/admin")
    public String showTables(Model model) {
        List<Quests> quests = questsServ.findAll();
        List<Users> users = usersServ.findAll();

        model.addAttribute("users", users);
        model.addAttribute("quests", quests);

        return "admin";
    }

    @GetMapping("/user-create")
    public String createForm(){
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(Users user){
        usersServ.save(user);
        return "redirect:/admin";
    }

    @GetMapping("/quest-create")
    public String createFormQ(){
        return "quest-create";
    }

    @PostMapping("/quest-create")
    public String createQuest(Quests quests){
        questsServ.save(quests);
        return "redirect:/admin";
    }


    @GetMapping("/user-delete/{id}")
    public String deleteUser (@PathVariable("id") Integer id){
        usersServ.deleteById(id);
        return "redirect:/users";

    }



    @GetMapping("/quest-delete/{id}")
    public String questUser (@PathVariable("id") Integer id){
        questsServ.deleteById(id);
        return "redirect:/users";
    }



    @GetMapping("/users")
    public String showQuest(Model model, Users users){
       Quests quests = questsServ.findById(users.getUserId());

        model.addAttribute("quest", quests);


        return "user";
    }





}
