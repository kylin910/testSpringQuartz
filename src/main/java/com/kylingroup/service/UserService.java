package com.kylingroup.service;

import com.kylingroup.entity.User;

import java.util.List;

public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
}
