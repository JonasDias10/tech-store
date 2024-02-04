import { Component } from '@angular/core';
import { ProductCardComponent } from "../product-card/product-card.component";
import { ProductService } from '../../services/product/product.service';
import { Product } from '../../models/product.model';

@Component({
    selector: 'app-home',
    standalone: true,
    templateUrl: './home.component.html',
    styleUrl: './home.component.scss',
    imports: [ProductCardComponent]
})
export class HomeComponent {

    products: Product[] = [];

    constructor(private productService: ProductService) {
        this.productService.findAll().subscribe(products => {
            this.products = products;
        });
    }

}
