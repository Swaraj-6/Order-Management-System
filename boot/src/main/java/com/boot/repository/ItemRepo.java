package com.boot.repository;

import com.boot.entity.Category;
import com.boot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepo extends JpaRepository<Item, Integer> {
    List<Item> findByCategory(Category category);
    List<Item> findByItemContaining(String item);
}
