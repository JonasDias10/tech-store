import { Injectable } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductService } from '../product/product.service';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ProductFormService {

  isProductFormOpen: boolean = false;
  productForm!: FormGroup;
  private router: Router = new Router();

  constructor(
    private formBuilder: FormBuilder,
    private productService: ProductService
  ) { 
    this.createProductForm();
  }

  openForm() {
    this.isProductFormOpen = true;
  }

  closeForm() {
    this.isProductFormOpen = false;
  }

  createProductForm(): void {
    this.productForm = this.formBuilder.group({
      id: [''],
      name: ['', [Validators.required, Validators.maxLength(255)]],
      description: ['', [Validators.required, Validators.maxLength(255)]],
      price: ['', Validators.required],
      amount: ['', Validators.required],
      imageUrl: ['', [Validators.required, Validators.maxLength(255)]],
    });
  }

  submitForm() {
    this.productService.save(this.productForm.value);
    this.productForm.reset();
    this.closeForm();
      
    setTimeout(() => this.refresh(), 1000);
  }
  
  private refresh() {
    this.router.navigateByUrl('/', {skipLocationChange:true}).then(()=> {
      this.router.navigate([`/products`]);
    });
  }

}
