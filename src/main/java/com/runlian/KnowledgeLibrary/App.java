package com.runlian.KnowledgeLibrary;

import com.runlian.KnowledgeLibrary.dao.TestDOMapper;
import com.runlian.KnowledgeLibrary.dataobject.TestDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.runlian.KnowledgeLibrary"})
@RestController
@MapperScan("com.runlian.KnowledgeLibrary.dao")
public class App 
{
    @RequestMapping(value = "/")
    public String home(){
        return "yes";
    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
