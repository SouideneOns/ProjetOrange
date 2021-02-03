import { Component, OnInit, ViewChild } from '@angular/core';
import { ContractServiceService } from "src/app/services/contract-service.service";
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';
import { TokenStorageService } from 'src/app/services/token-storage-service.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-search-contract',
  templateUrl: './search-contract.component.html',
  styleUrls: ['./search-contract.component.css']
})
export class SearchContractComponent implements OnInit {

  listData : MatTableDataSource<any>;
  listData2 : MatTableDataSource<any>;
  found : boolean;
  displayedColumns: string[]=['coCode','status','customerID','simID','marketID','offerID','actions'];

  @ViewChild(MatSort) sort: MatSort;
  @ViewChild(MatPaginator) paginator: MatPaginator;

  coCode:string ="";
  status:string="";
  customerID="";
  simID:string="";

  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username: string;
  tokenStr: string;


  constructor(private router: Router,private token: TokenStorageService,private contractService: ContractServiceService) { }

  ngOnInit(): void {

    this.contractService.getContractList().subscribe(
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
  updateContract(id: number){
    this.router.navigate(['update2', id]);
  }

  detailsContract(id: number){
    this.router.navigate(['details2', id]);
  }

  findAll() {
    this.contractService.getContractList().subscribe(
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
}

  findContractByC() {
    this.contractService.getContractByCoCode(this.coCode).subscribe(
      result  => {
        console.log(result);
        this.listData = result;
      },
      error1 => {
        console.log(error1);
      }

    );
}


findContractByS() {
  this.contractService.getContractByStatus(this.status).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}
findContractBySI() {
  this.contractService.getContractBySimID(this.simID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}
findContractByCu() {
  this.contractService.getContractByCustomerID(this.customerID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

getContractByCSI(){
  this.contractService.getContractByCoCodeandSimID(this.coCode,this.simID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}

getContractByCS(){
  this.contractService.getContractByCoCodeAndStatus(this.coCode,this.status).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );

}
getContractByCCu(){
  this.contractService.getContractByCoCodeAndCustomerID(this.coCode,this.customerID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );

}
getContractByCSIS(){
this.contractService.getContractByCoCodeAndSimIDAndStatus(this.coCode,this.simID,this.status).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }

  );
}
getContractByCSICu(){
  this.contractService.getContractByCoCodeAndSimIDAndCustomerID(this.coCode,this.simID,this.customerID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }
  );
}

getContractByCSCu(){
  this.contractService.getContractByCoCodeAndStatusAndCustomerID(this.coCode,this.status,this.customerID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }
  );
}

getContractBySIS(){
  this.contractService.getContractBySimIDAndStatus(this.simID,this.status).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }
  );
}
getContractBySICu(){
  this.contractService.getContractBySimIDAndCustomerID(this.simID,this.customerID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }
  );
}
getContractBySCu(){
  this.contractService.getContractByStatusAndCustomerID(this.status,this.customerID).subscribe(
    result  => {
      console.log(result);
      this.listData = result;
    },
    error1 => {
      console.log(error1);
    }
  );
}
getContractByCSISCu(){
  this.contractService.getContractByCoCodeAndSimIDAndStatusAndCustomerID(this.coCode,this.simID,this.status,this.customerID).subscribe(
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
    this.coCode="";
    this.applyFilter();
  }

  onSearchClear2(){
    this.status="";
    this.applyFilter();
  }

  onSearchClear3(){
    this.simID="";
    this.applyFilter();
  }

  onSearchClear4(){
    this.customerID="";
    this.applyFilter();
  }



  textCount1: number;
  textCount2: number;
  textCount3: number;
  textCount4: number;




  applyFilter(){


    console.log("length:" +this.textCount1);
    console.log("length:" +this.textCount2);
    console.log("length:" +this.textCount3);
    console.log("length:" +this.textCount4);

    this.textCount1=this.coCode.length;
    console.log("length:" +this.textCount1);

    this.textCount2=this.status.length;
    console.log("length:" +this.textCount2);

    this.textCount3=this.simID.length;
    console.log("length:" +this.textCount3);

    this.textCount4=this.customerID.length;
    console.log("length:" +this.textCount4);



    if(this.textCount1==0 && this.textCount2==0 && this.textCount3==0 && this.textCount4==0){
      this.findAll();
    }


   else if(this.textCount1>0 && this.textCount2==0 && this.textCount3==0 && this.textCount4==0){
      this.findContractByC();
    }

    else if(this.textCount1==0 && this.textCount2>0 && this.textCount3==0 && this.textCount4==0 ){
      this.findContractByS();
    }

    else if(this.textCount1==0 && this.textCount2==0 && this.textCount3>0 && this.textCount4==0){
      this.findContractBySI();
    }
    else if(this.textCount1==0 && this.textCount2==0 && this.textCount3==0 && this.textCount4>0 ){
      this.findContractByCu();
    }

       ///////////////////////////////////////////

    else if(this.textCount1>0 && this.textCount2==0 && this.textCount3>0 && this.textCount4==0){
       this.getContractByCSI();
    }
    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3==0 && this.textCount4==0){
      this.getContractByCS();
    }

    else if(this.textCount1>0 && this.textCount2==0 && this.textCount3==0 && this.textCount4>0){
    this.getContractByCCu();
    }

    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3>0 && this.textCount4==0){
     this.getContractByCSIS();
    }

    else if(this.textCount1>0 && this.textCount2==0 && this.textCount3>0 && this.textCount4>0){
     this.getContractByCSICu();
    }

    /////////////////////////////////////////

    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3==0 && this.textCount4>0){
     this.getContractByCSCu();
    }
    else if(this.textCount1==0 && this.textCount2>0 && this.textCount3>0 && this.textCount4==0){
      this.getContractBySIS();
    }

    else if(this.textCount1==0 && this.textCount2==0 && this.textCount3>0 && this.textCount4>0){
      this.getContractBySICu();
    }

    else if(this.textCount1==0 && this.textCount2>0 && this.textCount3==0 && this.textCount4>0){
      this.getContractBySCu();
    }

    else if(this.textCount1>0 && this.textCount2>0 && this.textCount3>0 && this.textCount4>0){
      this.getContractByCSISCu();
    }
  }

}

