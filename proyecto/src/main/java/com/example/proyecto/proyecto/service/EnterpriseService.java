package com.example.proyecto.proyecto.service;

import com.example.proyecto.proyecto.entities.Enterprise;
import com.example.proyecto.proyecto.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public void createEditEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }

    public List<Enterprise> seeEnterprises(){
        List<Enterprise> enterpriseList = new ArrayList<Enterprise>();
        enterpriseList.addAll(enterpriseRepository.findAll());
        return enterpriseList;
    }

    public Enterprise seeEnterpriseById(Long id){
        return enterpriseRepository.findById(id).get();
    }

    public void deleteEnterprise(Long id){
        enterpriseRepository.deleteById(id);
        enterpriseRepository.deleteById(id);
    }

}
