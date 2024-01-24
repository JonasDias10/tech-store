package br.com.techstore.data.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.techstore.domain.entities.Product;
import br.com.techstore.domain.usecases.product.CreateProduct;
import br.com.techstore.domain.usecases.product.DeleteProduct;
import br.com.techstore.domain.usecases.product.FindAllProducts;
import br.com.techstore.domain.usecases.product.UpdateProduct;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private CreateProduct createProduct;
    @Autowired
    private UpdateProduct updateProduct;
    @Autowired
    private DeleteProduct deleteProduct;
    @Autowired
    private FindAllProducts findAllProducts;

    @PostMapping("/")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createProduct.execute(product));
    }

    @PutMapping("/")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.OK).body(updateProduct.execute(product));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        deleteProduct.execute(id);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Product>> FindAll() {
        return ResponseEntity.status(HttpStatus.OK).body(findAllProducts.execute());
    }
    
}
