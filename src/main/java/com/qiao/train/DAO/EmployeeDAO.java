package com.qiao.train.DAO;

import com.qiao.train.po.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeDAO {
    List<Employee> getAllEmp();
    int createEmp(Employee emp);
    int deleteEmp(int id);
    int updateEmp(Employee emp);
}
