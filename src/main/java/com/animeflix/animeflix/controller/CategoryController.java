package com.animeflix.animeflix.controller;

import com.animeflix.animeflix.model.Category;
import com.animeflix.animeflix.repository.ICategoryRepository;
import com.animeflix.animeflix.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @GetMapping
    public List<Category> listCategories(){
        return categoryService.listCategories();
    }

    @GetMapping("/{id}")
    public Optional<Category> findCategoryById(@PathVariable Long id){
        return categoryService.findCategoryById(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@RequestBody Category category, @PathVariable Long id){
       return categoryService.updateCategory(category, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@RequestBody Long id){
        categoryService.deleteCategory(id);
    }
}
