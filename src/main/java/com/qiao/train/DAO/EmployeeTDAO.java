package com.qiao.train.DAO;

import com.qiao.train.po.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeTDAO {
    List<Employee> getAllEmpT();
    int createEmpT(Employee emp);
    int deleteEmpT(int id);
    int updateEmpT(Employee emp);
}
