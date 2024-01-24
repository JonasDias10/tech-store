package br.com.techstore.domain.usecases.product;

import br.com.techstore.domain.entities.Product;
import br.com.techstore.domain.repositories.ProductRepository;

public class CreateProduct {
    
    private final ProductRepository productRepository;

    public CreateProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product execute(Product product) {
        return productRepository.save(product);
    }
    
}
