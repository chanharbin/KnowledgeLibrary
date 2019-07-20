package com.runlian.KnowledgeLibrary.dao;

import com.runlian.KnowledgeLibrary.dataobject.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDOMapper {
    User findByUserName(String name);

    User findUserById(String id);
}
