import { Component, OnInit, Input } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ContractServiceService } from "src/app/services/contract-service.service";
import { Observable } from "rxjs";
import { Contract } from 'src/app/class/contract';

@Component({
  selector: 'app-contract-details',
  templateUrl: './contract-details.component.html',
  styleUrls: ['./contract-details.component.css']
})
export class ContractDetailsComponent implements OnInit {

  id: number;
  contract: Contract;

  listData2: Observable<Contract[]>;


  constructor(private route: ActivatedRoute,private router: Router,private contractService: ContractServiceService ) { }

  ngOnInit() {
    this.contract = new Contract();

    this.id = this.route.snapshot.params['id'];

    this.contractService.getContract(this.id)
      .subscribe(data => {
        console.log(data)
        this.contract = data;
      },
      error => console.log(error));

  }


  list(){
    this.router.navigate(['searchContract']);
  }


}

