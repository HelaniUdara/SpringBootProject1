package com.helani.SpringBootProject1.repository;

import com.helani.SpringBootProject1.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Integer> {
}
