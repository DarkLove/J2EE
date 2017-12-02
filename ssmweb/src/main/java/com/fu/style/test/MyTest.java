package com.fu.style.test;

import com.fu.style.dao.IUserDao;
import com.fu.style.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class MyTest {

    @Autowired
    IUserDao dao ;

    @Test
    public void findUserById(){
       User user = dao.selectUserById(1);
       System.out.print(user.toString());
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setName("李四");
        user.setPassword("444444");
        int i = dao.addUser(user);
        System.out.print("addUser ============ "+i+" ============");
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(2);
        user.setName("李四四");
        user.setPassword("444444 44444");
        int i = dao.updateUser(user);
        System.out.print("updateUser ============ "+i+" ============");
    }

    @Test
    public void deleteUser(){
        int i = dao.deleteUser(2);
        System.out.print("deleteUser ============ "+i+" ============");
    }

}
