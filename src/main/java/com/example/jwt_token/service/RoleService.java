package com.example.jwt_token.service;

import com.example.jwt_token.dao.RoleDAO;
import com.example.jwt_token.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDAO roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}

