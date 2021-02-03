import { Customer } from 'src/app/class/customer';
import { Component, OnInit, Input } from '@angular/core';
import { CustomerServiceService } from "src/app/services/customer-service.service";
import { Router, ActivatedRoute } from '@angular/router';
import { ContractServiceService } from "src/app/services/contract-service.service";
import { Observable } from "rxjs";
import { Contract } from 'src/app/class/contract';


@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  id: number;
  customer: Customer;
  firstname:string ="";
  listData2: Observable<Contract[]>;

  constructor(private route: ActivatedRoute,private router: Router,
    private customerService: CustomerServiceService ,private contractService: ContractServiceService ) { }

  ngOnInit() {
    this.customer = new Customer();

    this.id = this.route.snapshot.params['id'];

    this.customerService.getCustomer(this.id)
      .subscribe(data => {
        console.log(data)
        this.customer = data;
      }, error => console.log(error));


  }

  list(){
    this.router.navigate(['searchCustomer']);
  }

  findCustomer() {
    this.firstname=this.customer.firstName;
    this.contractService.getCustomerByCustomerID(this.firstname).subscribe(
      result  => {
        console.log(result);
        this.listData2 = result;
      },
      error1 => {
        console.log(error1);
      }

    );
  }

}
