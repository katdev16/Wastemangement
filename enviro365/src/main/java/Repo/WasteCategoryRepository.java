package Repo;

import Entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Integer> {}