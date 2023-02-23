package com.example.jwt_token.dao;

import com.example.jwt_token.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends CrudRepository<Role, String> {

}