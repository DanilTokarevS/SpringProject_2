package com.example.kr_1_spring.repo;

import com.example.kr_1_spring.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
        Optional<Users> findByUserId(int userId);
}
