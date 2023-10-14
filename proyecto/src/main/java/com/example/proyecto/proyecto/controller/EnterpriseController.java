package com.example.proyecto.proyecto.controller;

import com.example.proyecto.proyecto.entities.Enterprise;
import com.example.proyecto.proyecto.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EnterpriseController {

    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping("/Enterprise")
    private String enterpriseList(Model model){
        model.addAttribute("enterprisesModel",enterpriseService.seeEnterprises());
        return "empresas";
    }

    @GetMapping("/Enterprise/{id}")
    private String seeEnterpriseById(@PathVariable("id") Long id){
        enterpriseService.seeEnterpriseById(id);
        return "empresas";
    }

    @GetMapping("/nuevaempresa")
    private String nuevaEmpresa(Enterprise enterprise){
        return "nuevaempresa";
    }

    @PostMapping("/Enterprise")
    private String createEnterprise(Enterprise enterprise){
        enterpriseService.createEditEnterprise(enterprise);
        return "redirect:/Enterprise";
    }

    @GetMapping("/Enterprise/borrar/{id}")
    private String deleteEnterprise(@PathVariable("id") Long id){
        enterpriseService.deleteEnterprise(id);
        return "redirect:/Enterprise";
    }

    @GetMapping("/Enterprise/editar/{id}")
    private String seeEnterpriseById(@PathVariable("id") Long id, Model model){
        Enterprise enterprise = enterpriseService.seeEnterpriseById(id);
        model.addAttribute("enterprise", enterprise);
        return "editarempresa";
    }

    @PostMapping("/Enterprise/editar/{id}")
    private String editEnterprise(@PathVariable("id") Long id,Enterprise enterprise){
        enterpriseService.createEditEnterprise(enterprise);
        return "redirect:/Enterprise";
    }

}
