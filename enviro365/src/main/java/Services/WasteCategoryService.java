package Services;

import Entity.WasteCategory;
import Repo.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
class WasteCategoryService {
    @Autowired
    private WasteCategoryRepository repository;

    public List<WasteCategory> getAllCategories() {
        return repository.findAll();
    }
}
