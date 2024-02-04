import { Component, Input } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { Product } from '../../models/product.model';

@Component({
  selector: 'app-product-card',
  standalone: true,
  imports: [MatCardModule],
  templateUrl: './product-card.component.html',
  styleUrl: './product-card.component.scss'
})
export class ProductCardComponent {

  @Input() product!: Product;

  constructor() { }

  getFormattedPrice(): string {
    return this.product.price.toLocaleString('pt-br', {
      style: 'currency',
      currency: 'BRL'
    });
  }
  
}
