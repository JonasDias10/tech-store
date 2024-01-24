package br.com.techstore.domain.repositories;

import java.util.List;
import java.util.UUID;
import br.com.techstore.domain.entities.Product;

public interface ProductRepository {
    
    Product save(Product product);
    void deleteById(UUID id);
    List<Product> findAll();

}

