package com.qiao.train.controller;

import com.qiao.train.DAO.EmployeeTDAO;
import com.qiao.train.po.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/EmployeeT")
public class EmployeeTController {
    @Autowired
    private EmployeeTDAO EmpDAO;

    @GetMapping("getAllEmpT")
    public List<Employee> getAllEmpT() {
        return EmpDAO.getAllEmpT();
    }

    @GetMapping("/createEmpT")
    public int createEmpT(Employee emp) {
        return EmpDAO.createEmpT(emp);
    }

    @GetMapping("/deleteEmpT")
    public int deleteEmpT(int id) {
        return EmpDAO.deleteEmpT(id);
    }

    @GetMapping("/updateEmpT")
    public int updateEmpT(Employee emp) {
        return EmpDAO.updateEmpT(emp);
    }
}
