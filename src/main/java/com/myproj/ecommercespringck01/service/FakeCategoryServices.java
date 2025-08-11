package com.myproj.ecommercespringck01.service;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeCategoryServices implements ICategoryServices {

    @Override
    public List<String> getAllCategories(){
        return List.of();
    }

}
