package com.runlian.KnowledgeLibrary.service;

import com.runlian.KnowledgeLibrary.dao.UserDOMapper;
import com.runlian.KnowledgeLibrary.dataobject.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDOMapper userDOMapper;

    public User findUserById(String userId) {
        User userById = userDOMapper.findUserById(userId);
        return userById;
    }

    public User findByUsername(User user) {
        User byUserName = userDOMapper.findByUserName(user.getUsername());
        return byUserName;
    }
}
