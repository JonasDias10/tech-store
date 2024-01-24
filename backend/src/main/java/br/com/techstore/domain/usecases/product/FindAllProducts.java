package br.com.techstore.domain.usecases.product;

import java.util.List;
import br.com.techstore.domain.entities.Product;
import br.com.techstore.domain.repositories.ProductRepository;

public class FindAllProducts {

    private final ProductRepository productRepository;

    public FindAllProducts(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> execute() {
        return productRepository.findAll();
    }

}