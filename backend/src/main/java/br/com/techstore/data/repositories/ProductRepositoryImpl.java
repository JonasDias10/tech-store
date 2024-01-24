package br.com.techstore.data.repositories;

import java.util.List;
import java.util.UUID;
import br.com.techstore.data.mappers.ProductMapper;
import br.com.techstore.data.models.ProductModel;
import br.com.techstore.data.repositories.datasources.ProductJpaRepository;
import br.com.techstore.domain.entities.Product;
import br.com.techstore.domain.repositories.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {

    private final ProductJpaRepository productJpaRepository;

    public ProductRepositoryImpl(ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    @Override
    public Product save(Product product) {
        ProductModel productModel = ProductMapper.toModel(product);
        return ProductMapper.toEntity(productJpaRepository.save(productModel));
    }

    @Override
    public void deleteById(UUID id) {
        productJpaRepository.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return ProductMapper.toEntityList(productJpaRepository.findAll());
    }
    
}
