package com.example.kr_1_spring.serv;

import com.example.kr_1_spring.Entity.Users;
import com.example.kr_1_spring.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServ {

    private final UsersRepo usersRepo;

    @Autowired
    public UsersServ(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public List<Users> findAll(){
        return usersRepo.findAll();
    }

    public Users findById(Integer id){
        return usersRepo.getOne(id);
    }

    public Users save(Users user){
        return usersRepo.save(user);
    }

    public void deleteById(Integer id){
        usersRepo.deleteById(id);
    }

}
