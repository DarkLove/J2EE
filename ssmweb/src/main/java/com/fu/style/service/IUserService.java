package com.fu.style.service;

import com.fu.style.model.User;

public interface IUserService {
    User selectUserById(int userId);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int userId);
}
