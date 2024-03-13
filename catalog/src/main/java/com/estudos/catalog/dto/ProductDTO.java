package com.estudos.catalog.dto;

import com.estudos.catalog.entities.Category;
import com.estudos.catalog.entities.Product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imgUrl;

    private Set<CategoryDTO> categories;


    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, Double price, String description, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgUrl = imgUrl;

    }

    public ProductDTO(ProductDTO entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        description = entity.getDescription();
        imgUrl = entity.getImgUrl();
        categories = entity.getCategories();
    }

    public ProductDTO(Product entity, Set<CategoryDTO> categories) {
        this(entity);
        this.categories.addAll(categories);
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        price = product.getPrice();
        description = product.getDescription();
        imgUrl = product.getImgUrl();
        categories = convertToDto(product.getCategories());
    }

    public Set<CategoryDTO> getCategories() {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    private Set<CategoryDTO> convertToDto(Set<Category> categories) {
        return categories.stream().map(CategoryDTO::new).collect(Collectors.toSet());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
