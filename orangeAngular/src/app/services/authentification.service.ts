import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

export class JwtResponse{
  constructor(public jwttoken:string) {}
}

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {

  username: string;

  constructor(private httpClient:HttpClient) {}

  authenticate(username, password) {
    return this.httpClient.post<any>('http://localhost:8081/orange/authenticate',{username,password}).pipe(
      map(
        userData => {
          sessionStorage.setItem('username',username);
          let tokenStr= 'Bearer '+userData.token;
          sessionStorage.setItem('token', tokenStr);
          return userData;
        }
      )

    );
  }

  profile() {
    const username = sessionStorage.getItem('username');
    this.username=username;
  }

  logOut() {
    sessionStorage.removeItem('username')
  }
}
