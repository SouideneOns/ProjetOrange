import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import {Customer} from 'src/app/class/customer';
import { CustomerServiceService } from "src/app/services/customer-service.service";

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {

  id: number;
  customer: Customer;
  submitted = false;

  constructor(private route: ActivatedRoute,private router: Router,
    private customerService: CustomerServiceService) { }

  ngOnInit() {
    this.customer = new Customer();

    this.id = this.route.snapshot.params['id'];

    this.customerService.getCustomer(this.id)
      .subscribe(data => {
        console.log(data)
        this.customer = data;
      }, error => console.log(error));

  }

  updateCustomer() {
    this.customerService.updateCustomer(this.id, this.customer)
      .subscribe(data => console.log(data), error => console.log(error));
    this.customer = new Customer();

  }

  onSubmit() {
    this.updateCustomer();
    this.router.navigate(['/searchCustomer'])
    .then(() => {
      window.location.reload();
    });
    ;
  }

  gotoList() {
    this.router.navigate(['/searchCustomer']);
  }

}
