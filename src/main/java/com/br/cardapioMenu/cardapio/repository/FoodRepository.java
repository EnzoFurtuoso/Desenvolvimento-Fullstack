package com.br.cardapioMenu.cardapio.repository;

import com.br.cardapioMenu.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
