package com.ndmitrenko.springwithoutspringboot.repository;

import com.ndmitrenko.springwithoutspringboot.model.Estate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateRepository extends JpaRepository<Estate, Long> {
}
