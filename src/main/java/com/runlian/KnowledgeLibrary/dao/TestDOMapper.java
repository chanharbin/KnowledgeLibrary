package com.runlian.KnowledgeLibrary.dao;

import com.runlian.KnowledgeLibrary.dataobject.TestDO;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDOMapper {
    TestDO getDO(int id);
}
