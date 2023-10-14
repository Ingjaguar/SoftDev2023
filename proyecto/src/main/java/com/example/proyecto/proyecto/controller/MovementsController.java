package com.example.proyecto.proyecto.controller;

import com.example.proyecto.proyecto.entities.Movements;
import com.example.proyecto.proyecto.service.MovementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovementsController {

    @Autowired
    MovementsService movementsService;

    @GetMapping("/Movements")
    private String seeMovements(Model model){
        model.addAttribute("movementsModel",movementsService.seeMovements());
        return "movimientos";
    }

    @GetMapping("/Movements/{id}")
    private String seeMovementsById(@PathVariable("id") Long id){
        movementsService.seeMovementsById(id);
        return "movimientos";
    }

    @GetMapping("/nuevomovimiento")
    private String nuevoMovimiento(Movements movements){
        return "nuevomovimiento";
    }

    @PostMapping("/Movements")
    private String createMovement(Movements movements){
        movementsService.createEditMovements(movements);
        return "redirect:/Movements";
    }

    @GetMapping("Movements/borrar/{id}")
    private String deleteMovement(@PathVariable("id") Long id){
        movementsService.deleteMovements(id);
        return "redirect:/Movements";
    }

    @GetMapping("/Movements/editar/{id}")
    private String seeMovementById(@PathVariable("id") Long id, Model model){
        Movements movements = movementsService.seeMovementsById(id);
        model.addAttribute("movements", movements);
        return "editarmovimiento";
    }

    @PostMapping("/Movements/editar/{id}")
    private String editMovement(@PathVariable("id") Long id, Movements movements){
        movementsService.createEditMovements(movements);
        return "redirect:/Movements";
    }
}
