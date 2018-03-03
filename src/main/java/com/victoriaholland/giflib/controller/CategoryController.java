package com.victoriaholland.giflib.controller;

import com.victoriaholland.giflib.data.CategoryRepository;
import com.victoriaholland.giflib.data.GifRepository;
import com.victoriaholland.giflib.model.Category;
import com.victoriaholland.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by victoria on 28/02/18.
 */

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/categories")
    public String listCategories(ModelMap modelMap) {
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "categories";
    }

    @RequestMapping(value = "/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gifs);

        return "category";
    }
}
