package com.example.proyecto.proyecto.service;

import com.example.proyecto.proyecto.entities.Movements;
import com.example.proyecto.proyecto.repository.MovementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovementsService {
    @Autowired
    MovementsRepository movementsRepository;

    public void createEditMovements(Movements movements){
        movementsRepository.save(movements);
    }

    public List<Movements> seeMovements(){
        List<Movements> movementsList = new ArrayList<Movements>();
        movementsList.addAll(movementsRepository.findAll());
        return movementsList;
    }

    public Movements seeMovementsById(Long id){
        return movementsRepository.findById(id).get();
    }

    public void deleteMovements(Long id){
        movementsRepository.deleteById(id);
    }

}
