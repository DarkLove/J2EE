package com.fu.style.service.impl;

import com.fu.style.dao.IUserDao;
import com.fu.style.model.User;
import com.fu.style.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao dao ;

    public User selectUserById(int userId) {
        return dao.selectUserById(userId);
    }

    public int addUser(User user) {
        return dao.addUser(user);
    }

    public int updateUser(User user) {
        return dao.updateUser(user);
    }

    public int deleteUser(int userId) {
        return dao.deleteUser(userId);
    }
}
