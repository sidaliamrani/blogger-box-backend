package com.dauphine.blogger.Service;

import java.util.List;
import java.util.UUID;
import com.dauphine.blogger.models.Category;

public interface CategoryService {

    List<Category> getAll();

    List<Category> getAllByName(String name);

    Category getById(UUID id);

    Category create(String name);

    Category updateName(UUID id, String name);

    void deleteById(UUID id);
}
