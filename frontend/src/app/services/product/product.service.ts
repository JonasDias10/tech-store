import { Injectable } from '@angular/core';
import { Product } from '../../models/product.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private readonly API = 'http://localhost:8080/products/';

  constructor(
    private http: HttpClient
  ) { }

  save(product: Product) {
    return this.http.post<Product>(this.API, product).subscribe();
  }

  update(product: Product) {
    return this.http.put<Product>(this.API, product).subscribe();
  }

  delete(id: string) {
    return this.http.delete(this.API + id).subscribe();
  }

  findAll() {
    return this.http.get<Product[]>(this.API);
  }

}
