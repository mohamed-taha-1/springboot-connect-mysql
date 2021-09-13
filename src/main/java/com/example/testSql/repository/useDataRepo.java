package com.example.testSql.repository;

import com.example.testSql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface useDataRepo extends JpaRepository<User , Integer> {
 User findAllByEmail(String email);
}
