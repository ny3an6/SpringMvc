package com.ndmitrenko.springwithoutspringboot.repository;

import com.ndmitrenko.springwithoutspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllBySecondName(String secondName);
}
