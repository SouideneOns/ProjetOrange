import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/services/token-storage-service.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
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
    this.tokenStr = sessionStorage.getItem('token');
    }
  }

}
