package com.example.coursecatalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursecatalog.model.Catalog;

public interface CatalogRepo extends JpaRepository<Catalog,Integer> {

}
