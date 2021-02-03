import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContractServiceService {

  private baseUrl = 'http://localhost:8081/orange/contracts/contracts';
  private baseUrl2 = 'http://localhost:8081/orange/markets/markets';
  private baseUrl3 = 'http://localhost:8081/orange/offers/offersF';
  private baseUrl4 = 'http://localhost:8081/orange/offers/offersM';
  private baseUrl5 = 'http://localhost:8081/orange/offers/offersG';

  constructor(private http: HttpClient) { }

  createContract(contract: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, contract);
  }

  getAll(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  getCustomerByCustomerID(firstname): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/searchc/${firstname}`);
  }

  getAllMarkets(): Observable<any> {
    return this.http.get(`${this.baseUrl2}`);
  }

  getAllOffersF(): Observable<any> {
    return this.http.get(`${this.baseUrl3}`);
  }

  getAllOffersM(): Observable<any> {
    return this.http.get(`${this.baseUrl4}`);
  }

  getAllOffersG(): Observable<any> {
    return this.http.get(`${this.baseUrl5}`);
  }

  getContractList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  getContractByCoCode(coCode): Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search1/${coCode}`);
  }

  getContractByStatus(status):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search2/${status}`);
  }

  getContractBySimID(simID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search3/${simID}`);
  }

  getContractByCustomerID(customerID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search4/${customerID}`);
  }
  getContractByCoCodeandSimID(coCode,simID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search5/${coCode}/${simID}`);
  }

  getContractByCoCodeAndStatus(coCode,status):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search6/${coCode}/${status}`);
  }
  getContractByCoCodeAndCustomerID(coCode,customerID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search7/${coCode}/${customerID}`);
  }
  getContractByCoCodeAndSimIDAndStatus(coCode,simID,status):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search8/${coCode}/${simID}/${status}`);
  }
  getContractByCoCodeAndSimIDAndCustomerID(coCode,simID,customerID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search9/${coCode}/${simID}/${customerID}`);
  }
  getContractByCoCodeAndStatusAndCustomerID(coCode,status,customerID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search10/${coCode}/${status}/${customerID}`);
  }
  getContractBySimIDAndStatus(simID,status):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search11/${simID}/${status}`);
  }
  getContractBySimIDAndCustomerID(simID,customerID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search12/${simID}/${customerID}`);
  }
  getContractByStatusAndCustomerID(status,customerID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search13/${status}/${customerID}`);
  }
  getContractByCoCodeAndSimIDAndStatusAndCustomerID(coCode,simID,status,customerID):Observable<any>{
    return this.http.get(`http://localhost:8081/orange/contracts/search14/${coCode}/${simID}/${status}/${customerID}`);
  }


  getContract(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  updateContract(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }
}
