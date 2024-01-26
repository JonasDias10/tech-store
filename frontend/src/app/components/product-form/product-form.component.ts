import { Component } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { ProductFormService } from '../../services/product-form/product-form.service';
import { FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-product-form',
  standalone: true,
  imports: [MatButtonModule, MatFormFieldModule, MatInputModule, ReactiveFormsModule],
  templateUrl: './product-form.component.html',
  styleUrl: './product-form.component.scss'
})
export class ProductFormComponent {

  constructor(private productFormService: ProductFormService) {
  }

  closeForm() {
    this.productFormService.closeForm();
  }

  onSubmit() {
    this.productFormService.submitForm();
  }

  productForm(): FormGroup {
    return this.productFormService.productForm;
  }

}
