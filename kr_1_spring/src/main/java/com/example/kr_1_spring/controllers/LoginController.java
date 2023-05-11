package com.example.kr_1_spring.controllers;

import com.example.kr_1_spring.Entity.Users;
import com.example.kr_1_spring.dao.LoginForm;
import com.example.kr_1_spring.repo.UsersRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    private final UsersRepo usersRepo;

    public LoginController(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @GetMapping
    public String getLogin() {
        log.info("login");
        return "login";
    }

    @PostMapping
    public String redirect(@ModelAttribute("loginForm") LoginForm loginForm) {
        try {
            Users user = usersRepo.findByUserId(loginForm.getUserId())
                    .orElseThrow(() -> new UserPrincipalNotFoundException(
                            "User with user_id " +
                                    loginForm.getUserId() +
                                    "is not found")
                    );
            if(user.getUserId()>=400000){
            return "redirect:/users/admin";
            }

            else {
                return "redirect:/users/user";
            }


        } catch (UserPrincipalNotFoundException e) {
            log.warn(e.getMessage());
        }

        return null;
    }


}
