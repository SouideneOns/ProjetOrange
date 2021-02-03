import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TokenStorageService } from 'src/app/services/token-storage-service.service';

import  { Contract } from 'src/app/class/contract';
import  { ContractServiceService } from "src/app/services/contract-service.service";
import {ToastrService} from 'ngx-toastr';

import { Observable } from "rxjs";
import { Customer } from "src/app/class/customer";
import { Market } from "src/app/class/market";
import { OfferF } from "src/app/class/offerf";
import { OfferM } from "src/app/class/offerm";
import { OfferG } from "src/app/class/offerg";
import { CustomerServiceService } from "src/app/services/customer-service.service";


@Component({
  selector: 'app-create-contract',
  templateUrl: './create-contract.component.html',
  styleUrls: ['./create-contract.component.css']
})
export class CreateContractComponent implements OnInit {

  customers: Observable<Customer[]>;
  markets: Observable<Market[]>;
  offersf: Observable<OfferF[]>;
  offersg: Observable<OfferG[]>;
  offersm: Observable<OfferM[]>;

  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username: string;
  tokenStr: string;

  date : Date =  new Date();

  contract : Contract =new Contract();
  submitted = false;

  constructor(private customerService : CustomerServiceService,private token: TokenStorageService,private toastr: ToastrService,private contractService :ContractServiceService, private router : Router) { };


  ngOnInit(): void {
    this.isLoggedIn = !!this.token.getToken();
    let str = this.date.toDateString();
    this.contract.creation_date =str;

    this.reloadData();
    this.customerService.getCustomersList().subscribe(
      result   => {
        console.log(result);
        this.customers = result;
      },
      error1 => {
        console.log(error1);
      }

    );

    this.reloadData2();
    this.contractService.getAllMarkets().subscribe(
      result   => {
        console.log(result);
        this.markets = result;
      },
      error1 => {
        console.log(error1);
      }

    );

    this.reloadData3();
    this.contractService.getAllOffersF().subscribe(
      result   => {
        console.log(result);
        this.offersf = result;
      },
      error1 => {
        console.log(error1);
      }

    );

    this.reloadData4();
    this.contractService.getAllOffersM().subscribe(
      result   => {
        console.log(result);
        this.offersm = result;
      },
      error1 => {
        console.log(error1);
      }

    );

    this.reloadData5();
    this.contractService.getAllOffersG().subscribe(
      result   => {
        console.log(result);
        this.offersg = result;
      },
      error1 => {
        console.log(error1);
      }

    );

  }

  reloadData() {
    this.customers = this.customerService.getCustomersList();
  }

  reloadData2() {
    this.markets = this.contractService.getAllMarkets();
  }

  reloadData3() {
    this.offersf = this.contractService.getAllOffersF();
  }


  reloadData4() {
    this.offersm = this.contractService.getAllOffersM();
  }


  reloadData5() {
    this.offersg = this.contractService.getAllOffersG();
  }


  newContract():void{
    this.submitted = false;
    this.contract = new Contract();
  }

  save(){
    this.contractService.createContract(this.contract).subscribe(
      data => {
        console.log(data);
        this.toastr.success('Contract Registered','Success',{
        timeOut:2000,
        progressBar:false,});
        this.goToHome();
      },

      error => {
      console.log(error);
      this.contract = new Contract();
      this.toastr.error('Contract not Registered ','Error',{
      timeOut:2000,
      progressBar:false,});
      }
    );
  }


  onSubmit(){
    this.submitted = true;
    this.save();
   }

   goToHome(){
    this.router.navigate(['/home'])
   }

   Cancel(){
   this.router.navigate(['/home'])
   }

   checked: boolean = false;

  changeValue(value) {
      this.checked = !value;
  }

 }
