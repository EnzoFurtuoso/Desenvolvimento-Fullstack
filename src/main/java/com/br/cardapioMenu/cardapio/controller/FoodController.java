package com.br.cardapioMenu.cardapio.controller;

import com.br.cardapioMenu.cardapio.entity.Food;
import com.br.cardapioMenu.cardapio.entity.FoodRequestDTO;
import com.br.cardapioMenu.cardapio.entity.FoodResponseDTO;
import com.br.cardapioMenu.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {

    }


    @GetMapping()
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodList = foodRepository.findAll()
                .stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
