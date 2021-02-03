import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthentificationService } from 'src/app/services/authentification.service';
import { TokenStorageService } from 'src/app/services/token-storage-service.service';
import {ToastrService} from 'ngx-toastr';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = ''
  password = ''
  invalidLogin = false
  isLoggedIn = false;
  errorMessage=''

  constructor(private router: Router,private toastr: ToastrService,
    private loginservice: AuthentificationService, private tokenStorage: TokenStorageService) { }

  ngOnInit() {
    if (this.tokenStorage.getToken()) {
      this.isLoggedIn = true;
    }
  }

  checkLogin() {
    this.loginservice.authenticate(this.username, this.password).subscribe(
      data => {
        this.tokenStorage.saveToken(data.accessToken);
        this.tokenStorage.saveUser(data);
        this.invalidLogin = false;
        this.isLoggedIn = true;
        this.router.navigate(['/home'])
        .then(() => {
          window.location.reload();
        });
        ;

      },
      err=> {
        this.errorMessage = err.error.message;
        this.invalidLogin = true;
        this.toastr.error('wrong password or username','Error',{
          timeOut:2000,
          progressBar:false,
        });
      }
    );

  }

}
