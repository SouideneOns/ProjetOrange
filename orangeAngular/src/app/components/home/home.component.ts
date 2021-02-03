import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/services/token-storage-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username: string;
  tokenStr: string;

  constructor(private token: TokenStorageService) { }

  ngOnInit(): void {

    this.isLoggedIn = !!this.token.getToken();

    if (this.isLoggedIn) {
    this.username= sessionStorage.getItem('username');
    }
  }

}
