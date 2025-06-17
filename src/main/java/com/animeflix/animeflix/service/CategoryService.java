package com.animeflix.animeflix.service;

import com.animeflix.animeflix.model.Category;
import com.animeflix.animeflix.repository.ICategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> listCategories(){
        return  categoryRepository.findAll();
    }

    public Optional<Category> findCategoryById(Long id){
        return categoryRepository.findById(id);
    }

    public Category updateCategory(Category category,Long id){
        return categoryRepository.findById(id).map(newCategory ->{
            newCategory.setName(category.getName());
            return  categoryRepository.save(newCategory);
        }).orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
    }

    public void deleteCategory(Long id){
        if(categoryRepository.findById(id).isPresent()){
            categoryRepository.deleteById(id);
        }else throw new IllegalArgumentException("Category not found with ID: " + id);
    }}
