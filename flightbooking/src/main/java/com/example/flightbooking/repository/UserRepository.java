package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.flightbooking.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
 
}