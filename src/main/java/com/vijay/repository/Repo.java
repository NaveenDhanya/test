package com.vijay.repository;

import com.vijay.model.Userlist;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repo extends JpaRepository<Userlist, Integer> {

}