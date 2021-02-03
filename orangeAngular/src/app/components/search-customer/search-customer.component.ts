import { Component, OnInit, ViewChild } from '@angular/core';
import { CustomerServiceService } from "src/app/services/customer-service.service";
import { ContractServiceService } from "src/app/services/contract-service.service";
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';
import { TokenStorageService } from 'src/app/services/token-storage-service.service';
import { Router } from '@angular/router';
import {Customer} from 'src/app/class/customer';
@Component({
  selector: 'app-search-customer',
  templateUrl: './search-customer.component.html',
  styleUrls: ['./search-customer.component.css']
})
export class SearchCustomerComponent implements OnInit {

  listData : MatTableDataSource<Customer>;
  listData2 : MatTableDataSource<any>;
  listData3 : MatTableDataSource<any>;

  found : boolean;
  displayedColumns: string[]=['first_name','last_name','gender',/*'nationality','date_birth','place_birth','address',*/'identity','num_identity','custCode','creation_date',/*'contact','email',*/'actions'];
  displayedColumns2: string[]=['co_code']
  @ViewChild(MatSort) sort: MatSort;
  @ViewChild(MatPaginator) paginator: MatPaginator;

  firstname:string ="";
  lastname:string="";
  custcode:string ="";
  numidentity:string="";

  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username: string;
  tokenStr: string;

  constructor(private router: Router,private token: TokenStorageService,private customerService: CustomerServiceService,private contractService: ContractServiceService) { }

  ngOnInit(): void {
    this.customerService.getCustomersList().subscribe(
        result   => {
          console.log(result);
          this.listData=new MatTableDataSource(result);
          this.listData.sort=this.sort;
          this.listData.paginator=this.paginator;

        },
        error1 => {
          console.log(error1);
        }

      )

      this.isLoggedIn = !!this.token.getToken();

      if (this.isLoggedIn) {
      this.username= sessionStorage.getItem('username');
      }

  }

  customerDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updateCustomer(id: number){
    this.router.navigate(['update', id]);
  }

  findAll() {
    this.customerService.getCustomersList().subscribe(
      result   => {
        console.log(result);
        this.listData=new MatTableDataSource(result);
        this.listData.sort=this.sort;
        this.listData.paginator=this.paginator;

      },
      error1 => {
        console.log(error1);
      }

    )

    this.contractService.getAll().subscribe(
      result   => {
        console.log(result);
        this.listData2=this.listData3;

      },
      error1 => {
        console.log(error1);
      }

    )

}

findCustomer() {
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



  findCustomerByF() {
    this.customerService.getCustomerByFirstname(this.firstname).subscribe(
      result  => {
        console.log(result);
        this.listData = result;
      },
      error1 => {
        console.log(error1);
      }

    );
}

findCustomerByL() {
  this.customerService.getCustomerByLastname(this.lastname).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByC() {
  this.customerService.getCustomerByCustcode(this.custcode).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByN() {
  this.customerService.getCustomerByNumidentity(this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByFL() {
  this.customerService.getCustomerByFirstnameLastname(this.firstname,this.lastname).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByFC() {
  this.customerService.getCustomerByFirstnameCustcode(this.firstname,this.custcode).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByFN() {
  this.customerService.getCustomerByFirstnameNumidentity(this.firstname,this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByFLC() {
  this.customerService.getCustomerByFirstnameLastnameCustcode(this.firstname,this.lastname,this.custcode).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByFLN() {
  this.customerService.getCustomerByFirstnameLastnameNumidentity(this.firstname,this.lastname,this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByFLCN() {
  this.customerService.getCustomerByFirstnameLastnameCustcodeNumidentity(this.firstname,this.lastname,this.custcode,this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByFCN() {
  this.customerService.getCustomerByFirstnameCustcodeNumidentity(this.firstname,this.custcode,this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByLC() {
  this.customerService.getCustomerByLastnameCustcode(this.lastname,this.custcode).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByLN() {
  this.customerService.getCustomerByLastnameNumidentity(this.lastname,this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByLCN() {
  this.customerService.getCustomerByLastnameCustcodeNumidentity(this.lastname,this.custcode,this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

findCustomerByCN() {
  this.customerService.getCustomerByCustcodeNumidentity(this.custcode,this.numidentity).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

  onSearchClear1(){
    this.firstname="";
    this.applyFilter();
  }


  onSearchClear2(){
    this.lastname="";
    this.applyFilter();
  }

  onSearchClear3(){
    this.custcode="";
    this.applyFilter();
  }

  onSearchClear4(){
    this.numidentity="";
    this.applyFilter();
  }


  textCount1: number;
  textCount2: number;
  textCount3: number;
  textCount4: number;

  textCount5: number;



  applyFilter(){

    this.textCount1=this.firstname.length;
    console.log("length:" +this.textCount1);

    this.textCount2=this.lastname.length;
    console.log("length:" +this.textCount2);

    this.textCount3=this.custcode.length;
    console.log("length:" +this.textCount3);

    this.textCount4=this.numidentity.length;
    console.log("length:" +this.textCount4);


    if(this.textCount1==0 && this.textCount2==0 && this.textCount3==0 && this.textCount4==0){
      this.findAll();
    }

   else if(this.textCount1>0 && this.textCount2==0 && this.textCount3==0 && this.textCount4==0){
      this.findCustomerByF();
      this.findCustomer();
    }

    else if(this.textCount1==0 && this.textCount2>0 && this.textCount3==0 && this.textCount4==0){
      this.findCustomerByL();
    }

    else if(this.textCount1==0 && this.textCount2==0 && this.textCount3>0 && this.textCount4==0){
      this.findCustomerByC();
    }

    else if(this.textCount1==0 && this.textCount2==0 && this.textCount3==0 && this.textCount4>0){
      this.findCustomerByN();
    }

    ////////////////////////////////////////

    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3==0 && this.textCount4==0){
      this.findCustomerByFL();
    }

    else if(this.textCount1>0 && this.textCount2==0 && this.textCount3>0 && this.textCount4==0){
      this.findCustomerByFC();
    }

    else if(this.textCount1>0 && this.textCount2==0 && this.textCount3==0 && this.textCount4>0){
      this.findCustomerByFN();
    }

    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3>0 && this.textCount4==0){
      this.findCustomerByFLC();
    }

    ////////////////////////////////////////

    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3==0 && this.textCount4>0){
      this.findCustomerByFLN();
    }

    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3>0 && this.textCount4>0){
      this.findCustomerByFLCN();
    }

    else if(this.textCount1>0 && this.textCount2==0 && this.textCount3>0 && this.textCount4>0){
      this.findCustomerByFCN();
    }

    else if(this.textCount1==0 && this.textCount2>0 && this.textCount3>0 && this.textCount4==0){
      this.findCustomerByLC();
    }

     ////////////////////////////////////////

     else if(this.textCount1==0 && this.textCount2>0 && this.textCount3==0 && this.textCount4>0){
      this.findCustomerByLN();
    }

    else if(this.textCount1==0 && this.textCount2>0 && this.textCount3>0 && this.textCount4>0){
      this.findCustomerByLCN();
    }

    else if(this.textCount1==0 && this.textCount2==0 && this.textCount3>0 && this.textCount4>0){
      this.findCustomerByCN();
    }

  }

}

