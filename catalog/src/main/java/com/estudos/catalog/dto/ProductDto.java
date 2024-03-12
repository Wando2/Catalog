package com.estudos.catalog.dto;

import java.util.List;
import java.util.Set;

public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imgUrl;

    private Set<CategoryDTO> categories;


    public ProductDto() {
    }

    public ProductDto(Long id, String name, Double price, String description, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgUrl = imgUrl;

    }

    public ProductDto(ProductDto entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        description = entity.getDescription();
        imgUrl = entity.getImgUrl();
        categories = entity.getCategories();
    }

    public ProductDto(ProductDto entity, Set<CategoryDTO> categories) {
        this(entity);
        this.categories.addAll(categories);
    }

    private Set<CategoryDTO> getCategories() {
        return categories;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

}
