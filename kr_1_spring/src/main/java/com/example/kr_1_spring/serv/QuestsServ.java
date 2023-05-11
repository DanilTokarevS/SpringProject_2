package com.example.kr_1_spring.serv;

import com.example.kr_1_spring.Entity.Quests;
import com.example.kr_1_spring.Entity.Users;
import com.example.kr_1_spring.repo.QuestsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestsServ {

    private final QuestsRepo questsRepo;

    @Autowired
    public QuestsServ(QuestsRepo questsRepo) {
        this.questsRepo = questsRepo;
    }


    public List<Quests> findAll(){
        return questsRepo.findAll();
    }

    public Quests findById(Integer id){
        return questsRepo.getOne(id);
    }

    public Quests save(Quests quests){
        return questsRepo.save(quests);
    }

    public void deleteById(Integer id){
        questsRepo.deleteById(id);
    }

}
