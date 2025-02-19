package Repo;

import Entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;

interface WasteCategoryRepository extends JpaRepository<WasteCategory, Integer> {}