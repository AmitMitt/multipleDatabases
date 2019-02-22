package com.karexpert.multipleDatabases.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karexpert.multipleDatabases.model.user.User;


public interface UserRepository extends JpaRepository<User,Long> {

}


