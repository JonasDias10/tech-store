package br.com.techstore.data.repositories.datasources;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.techstore.data.models.ProductModel;

public interface ProductJpaRepository extends JpaRepository<ProductModel, UUID> {

}
