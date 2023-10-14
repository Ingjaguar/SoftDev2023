package com.example.proyecto.proyecto.controller;

import com.example.proyecto.proyecto.entities.Employee;
import com.example.proyecto.proyecto.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/Employee")
    private String seeEmployees(Model model){
        model.addAttribute("employeesModel",employeeService.seeEmployees());
        return "empleados";
    }

    @GetMapping("/Employee/{id}")
    private String seeEmployeeById(@PathVariable("id") Long id){
        employeeService.seeEmployeeById(id);
        return "empleados";
    }

    @GetMapping("/nuevoempleado")
    // CREAR NUEVO EMPLEADO - Controlador para "nuevoempleado.html"
    private String nuevoEmpleado(Employee employee){
        return "nuevoempleado";
    }
    // CREA NUEVO EMPLEADO
    @PostMapping("/Employee")
    private String createEmployee(Employee employee){
        employeeService.createEmployee(employee);
        return "redirect:/Employee";
    }

    @GetMapping("/Employee/borrar/{id}")
    private String deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return "redirect:/Employee";
    }

    @GetMapping("/Employee/editar/{id}")
    private String seeEmployeeById(@PathVariable("id") Long id, Model model){
        Employee employee =  employeeService.seeEmployeeById(id);
        model.addAttribute("employee", employee);
        return "editarempleado.html";
    }

    @PostMapping("/Employee/editar/{id}")
    private String editEmployee(@PathVariable("id") Long id, Employee employee){
        employeeService.createEmployee(employee);
        return "redirect:/Employee";
    }
}
