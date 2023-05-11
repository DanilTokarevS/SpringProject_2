package com.example.kr_1_spring.repo;

import com.example.kr_1_spring.Entity.Quests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestsRepo extends JpaRepository<Quests, Integer> {
}
