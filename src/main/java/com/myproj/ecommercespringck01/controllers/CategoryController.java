package com.myproj.ecommercespringck01.controllers;


import com.myproj.ecommercespringck01.service.ICategoryServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private ICategoryServices categoryServices;

    CategoryController(ICategoryServices _categoryServices) {
        this.categoryServices = _categoryServices;
    }

    @GetMapping
    public List<String> getAllCategories(){
      return  this.categoryServices.getAllCategories();
    }
}
