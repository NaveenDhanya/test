package com.vijay.service;

import com.vijay.model.Userlist;
import org.springframework.stereotype.Service;

@Service
public interface WebService {
public Userlist create(Userlist userdetails);
}
