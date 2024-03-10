package com.estudos.catalog.dto;

import com.estudos.catalog.entities.Category;

import java.util.List;

public class CategoryDTO {
    private Long id;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public static List<CategoryDTO> convert(List<Category> list) {
        return list.stream().map(CategoryDTO::new).toList();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
