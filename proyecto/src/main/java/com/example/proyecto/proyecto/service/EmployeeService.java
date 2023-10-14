package com.example.proyecto.proyecto.service;

import com.example.proyecto.proyecto.entities.Employee;
import com.example.proyecto.proyecto.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> seeEmployees(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.addAll(employeeRepository.findAll());
        return employeeList;
    }

    public Employee seeEmployeeById(Long id){
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

}
