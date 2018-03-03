package com.victoriaholland.giflib.data;

import com.victoriaholland.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by victoria on 28/02/18.
 */

@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Spring"),
            new Category(2, "Summer"),
            new Category(3, "Autumn"),
            new Category(4, "Winter")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == (id)) {
                return category;
            }
        }
        return null;
    }
}
