package br.com.techstore.core.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.techstore.data.repositories.ProductRepositoryImpl;
import br.com.techstore.data.repositories.datasources.ProductJpaRepository;
import br.com.techstore.domain.repositories.ProductRepository;
import br.com.techstore.domain.usecases.product.CreateProduct;
import br.com.techstore.domain.usecases.product.DeleteProduct;
import br.com.techstore.domain.usecases.product.FindAllProducts;
import br.com.techstore.domain.usecases.product.UpdateProduct;

@Configuration
public class ProductConfiguration {

    @Bean
    CreateProduct createProduct(ProductRepository productRepository) {
        return new CreateProduct(productRepository);
    }

    @Bean
    UpdateProduct updateProduct(ProductRepository productRepository) {
        return new UpdateProduct(productRepository);
    }

    @Bean
    FindAllProducts findAllProducts(ProductRepository productRepository) {
        return new FindAllProducts(productRepository);
    }

    @Bean
    DeleteProduct deleteProduct(ProductRepository productRepository) {
        return new DeleteProduct(productRepository);
    }

    @Bean
    ProductRepository productRepository(ProductJpaRepository productJpaRepository) {
        return new ProductRepositoryImpl(productJpaRepository);
    }

}
