package br.com.techstore.domain.entities;

import java.util.UUID;

public record Product(UUID id, String name, String description, Double price, int amount, String imageUrl) {
    
}
