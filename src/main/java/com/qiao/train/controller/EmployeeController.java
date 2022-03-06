package com.qiao.train.controller;


import com.qiao.train.DAO.EmployeeDAO;
import com.qiao.train.po.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeDAO EmpDAO;

    @GetMapping("getAllEmp")
    public List<Employee> getAllEmp() {
        return EmpDAO.getAllEmp();
    }

    @GetMapping("/createEmp")
    public int createEmp(Employee emp) {
        return EmpDAO.createEmp(emp);
    }

    @GetMapping("/deleteEmp")
    public int deleteEmp(int id) {
        return EmpDAO.deleteEmp(id);
    }

    @GetMapping("/updateEmp")
    public int updateEmp(Employee emp) {
        return EmpDAO.updateEmp(emp);
    }
}
