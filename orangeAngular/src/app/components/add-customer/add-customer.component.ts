import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

import { TokenStorageService } from 'src/app/services/token-storage-service.service';
import { Customer } from "src/app/class/customer";
import { CustomerServiceService } from "src/app/services/customer-service.service";


@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})

export class AddCustomerComponent implements OnInit {

  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username: string;
  tokenStr: string;
  date : Date =  new Date();
  modif : Date =  new Date();
  customer : Customer=new Customer();
  submitted = false;
  checked2:boolean=true;

  constructor(private token: TokenStorageService,private toastr: ToastrService,private customerService : CustomerServiceService, private router : Router) {}

  ngOnInit(): void {
    this.isLoggedIn = !!this.token.getToken();
    let str = this.date.toDateString();
    this.customer.creationDate=str;
  }

  newCustomer():void {
    this.submitted = false;
    this.customer = new Customer();
  }

  save(){
    this.customerService.createCustomer(this.customer).subscribe(
      data => {
        console.log(data);
        this.toastr.success('Customer Registered','Success',{
        timeOut:2000,
        progressBar:false,});
        this.goToList();
      },

      error => {
      console.log(error);
      this.customer = new Customer();
      this.toastr.error('Customer not Registered ','Error',{
      timeOut:2000,
      progressBar:false,});
      }
    );
  }



  onSubmit(){
   this.submitted = true;
   this.save();
  }

  goToList(){
   this.router.navigate(['/searchCustomer'])
  }

  Cancel(){
  this.router.navigate(['/searchCustomer'])
  }

  checked: boolean = false;

 changeValue(value) {
     this.checked = !value;
 }

}
