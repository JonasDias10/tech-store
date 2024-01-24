package br.com.techstore.data.mappers;

import java.util.List;
import java.util.stream.Collectors;
import br.com.techstore.data.models.ProductModel;
import br.com.techstore.domain.entities.Product;

public class ProductMapper {
    
    public static ProductModel toModel(Product product) {
        ProductModel productModel = new ProductModel();
        productModel.setId(product.id());
        productModel.setName(product.name());
        productModel.setDescription(product.description());
        productModel.setPrice(product.price());
        productModel.setAmount(product.amount());
        productModel.setImageUrl(product.imageUrl());
        return productModel;
    }

    public static Product toEntity(ProductModel productModel) {
        return new Product(
            productModel.getId(), 
            productModel.getName(), 
            productModel.getDescription(), 
            productModel.getPrice(), 
            productModel.getAmount(), 
            productModel.getImageUrl()
        );
    }

    public static List<ProductModel> toModelList(List<Product> products) {
        return products.stream()
            .map(ProductMapper::toModel)
            .collect(Collectors.toList());
    }

    public static List<Product> toEntityList(List<ProductModel> products) {
        return products.stream()
            .map(ProductMapper::toEntity)
            .collect(Collectors.toList());
    }

}
