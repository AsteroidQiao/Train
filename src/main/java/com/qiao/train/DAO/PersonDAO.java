package com.qiao.train.DAO;

import com.qiao.train.po.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonDAO {
    Person login(String name, String psd);

    List<Person> getAllUsers();

    Person getUserById(int id);

    int createUsers(Person users);

    int deleteUsers(int id);

    int updateUsers(Person users);
}
