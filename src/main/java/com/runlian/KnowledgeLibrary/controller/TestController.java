package com.runlian.KnowledgeLibrary.controller;

import com.runlian.KnowledgeLibrary.dao.TestDOMapper;
import com.runlian.KnowledgeLibrary.dataobject.TestDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestDOMapper testDOMapper;
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(){
        TestDO aDo = testDOMapper.getDO(1);
        return aDo.getName();
    }
}
