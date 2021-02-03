import { Component, OnInit } from '@angular/core';
import { AuthentificationService } from 'src/app/services/authentification.service';
import { TokenStorageService } from 'src/app/services/token-storage-service.service';
import { Router } from '@angular/router'

@Component({
  selector: 'app-header-search-contract',
  templateUrl: './header-search-contract.component.html',
  styleUrls: ['./header-search-contract.component.css']
})
export class HeaderSearchContractComponent implements OnInit {

  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username: string;

  constructor(private router: Router,public loginService:AuthentificationService,private tokenStorageService: TokenStorageService) { }

  ngOnInit(): void {
    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if (this.isLoggedIn) {
    this.username= sessionStorage.getItem('username');
    }
  }

  logout(): void {
    this.tokenStorageService.signOut();
    window.location.reload();
  }
}

