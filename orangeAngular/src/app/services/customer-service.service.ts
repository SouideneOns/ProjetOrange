import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {

  private baseUrl = 'http://localhost:8081/orange/customers/customers';
  private baseUrl2 = 'http://localhost:8081/orange/customers/historique';
  private baseUrl3 = 'http://localhost:8081/orange/customers/historique2';

  constructor(private http: HttpClient) { }

  createCustomer(customer: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, customer);
  }

  getCustomersList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  getCustomer(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createHistorique(historique: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl2}`, historique);
  }

  getHistorique(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl2}/${id}`);
  }

  getHistoriqueList(): Observable<any> {
    return this.http.get(`${this.baseUrl2}`);
  }

  getHistorique2(firstName: String): Observable<any> {
    return this.http.get(`${this.baseUrl3}/${firstName}`);
  }

  updateCustomer(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  getCustomerByFirstname(firstname): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search1/${firstname}`);
  }

  getCustomerByLastname(lastname): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search2/${lastname}`);
  }

  getCustomerByCustcode(custcode): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search3/${custcode}`);
  }

  getCustomerByNumidentity(numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search4/${numidentity}`);
  }


  getCustomerByFirstnameLastname(firstname,lastname): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search5/${firstname}/${lastname}`);
  }

  getCustomerByFirstnameCustcode(firstname,custcode): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search6/${firstname}/${custcode}`);
  }

  getCustomerByFirstnameNumidentity(firstname,numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search7/${firstname}/${numidentity}`);
  }

  getCustomerByFirstnameLastnameCustcode(firstname,lastname,custcode): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search8/${firstname}/${lastname}/${custcode}`);
  }

  getCustomerByFirstnameLastnameNumidentity(firstname,lastname,numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search9/${firstname}/${lastname}/${numidentity}`);
  }

  getCustomerByFirstnameLastnameCustcodeNumidentity(firstname,lastname,custcode,numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search10/${firstname}/${lastname}/${custcode}/${numidentity}`);
  }

  getCustomerByFirstnameCustcodeNumidentity(firstname,custcode,numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search11/${firstname}/${custcode}/${numidentity}`);
  }

  getCustomerByLastnameCustcode(lastname,custcode): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search12/${lastname}/${custcode}`);
  }

  getCustomerByLastnameNumidentity(lastname,numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search13/${lastname}/${numidentity}`);
  }


  getCustomerByLastnameCustcodeNumidentity(lastname,custcode,numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search14/${lastname}/${custcode}/${numidentity}`);
  }

  getCustomerByCustcodeNumidentity(custcode,numidentity): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/customers/search15/${custcode}/${numidentity}`);
  }

}
