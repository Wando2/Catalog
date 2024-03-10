package com.estudos.catalog.services;

import com.estudos.catalog.dto.CategoryDTO;
import com.estudos.catalog.entities.Category;
import com.estudos.catalog.repositories.ICategoryRepository;
import com.estudos.catalog.services.exceptions.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        var list = repository.findAll();
        return CategoryDTO.convert(list);

    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new CategoryDTO(entity);

    }

    @Transactional
    public CategoryDTO insert(CategoryDTO dto) {
        Category entity = new Category();
        entity.setName(dto.getName());
        entity = repository.save(entity);
        return new CategoryDTO(entity);
    }
}
