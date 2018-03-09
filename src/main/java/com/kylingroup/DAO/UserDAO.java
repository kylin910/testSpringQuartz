package com.kylingroup.DAO;

import com.kylingroup.entity.User;

import java.util.List;

public interface UserDAO {
    public int save(User u);
    public List<User> findAll();
}