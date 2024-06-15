package com.dauphine.blogger.Service.Impl;

import com.dauphine.blogger.Models.Category;
import com.dauphine.blogger.Repository.CategoryRepository;
import com.dauphine.blogger.Service.CategoryService;
import org.springframework.stereotype.Service;
import com.dauphine.blogger.Service.Exception.CategoryNotFoundByIdException;
import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> getAllByName(String name) {
        return categoryRepository.findByName(name);
    }

    public Category getById(UUID id) throws CategoryNotFoundByIdException {
        return categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundByIdException("Category with id "
                + id + " not found"));
    }

    @Override
    public Category create(String name) {
        Category category = new Category(name);
        return categoryRepository.save(category);
    }

    @Override
    public Category updateName(UUID id, String name) throws CategoryNotFoundByIdException {
        Category category = getById(id);
        category.setName(name);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteById(UUID id) throws CategoryNotFoundByIdException {
        getById(id);
        categoryRepository.deleteById(id);
    }
}