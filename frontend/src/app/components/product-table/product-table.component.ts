import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { Product } from '../../models/product.model';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { ProductService } from '../../services/product/product.service';
import { ProductFormService } from '../../services/product-form/product-form.service';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatDialog } from '@angular/material/dialog';
import { ConfirmationDialogComponent } from '../confirmation-dialog/confirmation-dialog.component';

@Component({
  selector: 'app-product-table',
  standalone: true,
  imports: [MatTableModule, MatPaginatorModule, MatIconModule, MatButtonModule],
  templateUrl: './product-table.component.html',
  styleUrl: './product-table.component.scss'
})
export class ProductTableComponent implements AfterViewInit {
  readonly displayedColumns: string[] = ['name', 'description', 'price', 'amount', 'imageUrl', 'edit', 'delete'];
  dataSource: MatTableDataSource<Product, MatPaginator>;

  constructor(
    private productService: ProductService,
    private productFormService: ProductFormService,
    private dialog: MatDialog
  ) {
    this.dataSource = new MatTableDataSource<Product>();
    this.updateTable();
  }

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
  }

  deleteProduct(id: string) {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: 'Tem certeza que deseja remover este produto?'
    });

    dialogRef.afterClosed().subscribe(confirmation => {
      if (confirmation) {
        this.productService.delete(id);
        setTimeout(() => this.updateTable(), 1000);
      }
    });
  }

  editProduct(product: Product) {
    this.productFormService.productForm.patchValue(product);
    this.productFormService.openForm();
  }

  updateTable() {
    this.productService.findAll().subscribe(products => {
      this.dataSource.data = products;
    });
  }

}
