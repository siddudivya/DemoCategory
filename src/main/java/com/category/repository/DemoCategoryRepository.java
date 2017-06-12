package com.category.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.category.model.Category;

@Repository
public interface DemoCategoryRepository extends CrudRepository<Category, Serializable>{

}
