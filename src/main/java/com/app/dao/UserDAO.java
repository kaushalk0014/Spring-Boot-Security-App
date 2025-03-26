package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entiry.UserDetails;

@Repository
public interface UserDAO extends JpaRepository<UserDetails, Integer>{

}
