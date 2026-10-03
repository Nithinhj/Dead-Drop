package com.example.DeadDrop.repository;

import com.example.DeadDrop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepositary extends JpaRepository<User, Long> {
}
