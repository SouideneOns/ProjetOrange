import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable, from } from "rxjs";
import {Contract} from 'src/app/class/contract';
import { ContractServiceService } from "src/app/services/contract-service.service";
import { Market } from "src/app/class/market";
import { OfferF } from "src/app/class/offerf";
import { OfferM } from "src/app/class/offerm";
import { OfferG } from "src/app/class/offerg";

@Component({
  selector: 'app-update-contract',
  templateUrl: './update-contract.component.html',
  styleUrls: ['./update-contract.component.css']
})
export class UpdateContractComponent implements OnInit {

  id: number;
  contract: Contract;
  modif : Date =  new Date();
  markets: Observable<Market[]>;
  offersf: Observable<OfferF[]>;
  offersg: Observable<OfferG[]>;
  offersm: Observable<OfferM[]>;



  constructor(private route: ActivatedRoute,private router: Router,
    private contractService: ContractServiceService ) { }

  ngOnInit() {

    this.contract = new Contract();

    this.id = this.route.snapshot.params['id'];
    this.contractService.getContract(this.id)
      .subscribe(data => {console.log(data)

        this.contract = data;

        console.log(data);
      },
      error => console.log(error)
      );


      this.reloadData1();
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

  reloadData1()
    {
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


  updateContract() {
    this.contractService.updateContract(this.id, this.contract)
      .subscribe(data => console.log(data),
      error => console.log(error));
    this.contract = new Contract();
    this.router.navigate(['/searchContract'])
    .then(() => {
      window.location.reload();
    });
    ;
  }

  onSubmit() {
    this.updateContract();
  }

  gotoList() {
    this.router.navigate(['/searchContract']);
  }

}

