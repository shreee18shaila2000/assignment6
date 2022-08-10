package com.nagarro.LibraryManagement1.repository;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.LibraryManagement1.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
public User findByUsernameAndPassword(String username,String password);
}

