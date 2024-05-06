package com.boot.service;

import com.boot.payload.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto, Integer category_id);

    void deleteCategory(Integer category_id);

    CategoryDto getCategory(Integer category_id);

    List<CategoryDto> getCategories();
}
