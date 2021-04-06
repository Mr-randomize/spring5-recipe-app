package com.iviberberi.spring5recipeapp.repositories;

import com.iviberberi.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
