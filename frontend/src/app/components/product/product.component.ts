import { Component } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { ProductTableComponent } from "../product-table/product-table.component";
import { ProductFormService } from '../../services/product-form/product-form.service';
import { ProductFormComponent } from '../product-form/product-form.component';

@Component({
    selector: 'app-product',
    standalone: true,
    templateUrl: './product.component.html',
    styleUrl: './product.component.scss',
    imports: [MatButtonModule, ProductTableComponent, ProductFormComponent]
})
export class ProductComponent {
    
    constructor(private productFormService: ProductFormService) {
    }

    openForm() {
        this.productFormService.openForm();
    }

    isProductFormOpen(): boolean {
        return this.productFormService.isProductFormOpen;
    }

}
