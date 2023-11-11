package com.vijay.service.impl;
import com.vijay.model.Userlist;
import com.vijay.repository.Repo;
import com.vijay.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {

    @Autowired
    Repo repo;
    @Override
    public Userlist create(Userlist userdetails) {
        return repo.save(userdetails);
    }
}
