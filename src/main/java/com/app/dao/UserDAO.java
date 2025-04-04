package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entiry.UserInfo;

 

@Repository
public interface UserDAO extends JpaRepository<UserInfo, Integer>{

	Optional<UserInfo> findByName(String username);

 
}
