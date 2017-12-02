package com.fu.style.dao;

import com.fu.style.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserDao {
    User selectUserById(int userId);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int userId);
}
