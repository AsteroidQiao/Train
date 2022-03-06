package com.qiao.train.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.qiao.train.DAO.PersonDAO;
import com.qiao.train.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class PersonController {
    @Autowired

    private PersonDAO MyPersonDAO;

    @GetMapping("/login")
    public Person login(String name, String psd) {
        Person p1 = MyPersonDAO.login(name, psd);
        return MyPersonDAO.login(name, psd);
    }

    @GetMapping("/getAllUser")
    public List<Person> getAllUser() {
        return MyPersonDAO.getAllUsers();
    }
    @GetMapping("/getUserById")
    public Person getUserById(int id){
        return MyPersonDAO.getUserById(id);
    }
}
