package br.com.techstore.domain.usecases.product;

import java.util.UUID;
import br.com.techstore.domain.repositories.ProductRepository;

public class DeleteProduct {
    
    private final ProductRepository productRepository;
    
    public DeleteProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void execute(UUID id) {
        productRepository.deleteById(id);
    }
    
}
