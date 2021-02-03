import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { ProfileComponent } from './components/profile/profile.component';
import { HomeComponent } from './components/home/home.component';
import { FrontComponent } from './components/front/front.component';
import { AddCustomerComponent } from './components/add-customer/add-customer.component';
import{ CreateContractComponent } from './components/create-contract/create-contract.component';
import { SearchCustomerComponent } from './components/search-customer/search-customer.component';
import { CustomerDetailsComponent } from './components/customer-details/customer-details.component';
import { UpdateCustomerComponent } from './components/update-customer/update-customer.component';
import{ SearchContractComponent} from './components/search-contract/search-contract.component';
import { UpdateContractComponent } from './components/update-contract/update-contract.component';
import { ContractDetailsComponent } from './components/contract-details/contract-details.component';

const routes: Routes = [
{ path: '', redirectTo: 'front', pathMatch: 'full' },
{ path: 'login', component: LoginComponent },
{ path: 'logout', component: LogoutComponent },
{ path: 'profile', component: ProfileComponent },
{ path: 'front', component: FrontComponent },
{ path: 'home', component: HomeComponent },
{ path: 'addCustomer', component: AddCustomerComponent },
{ path: 'createContract', component: CreateContractComponent },
{ path: 'searchCustomer', component: SearchCustomerComponent },
{ path: 'details/:id', component: CustomerDetailsComponent },
{ path: 'update/:id', component: UpdateCustomerComponent },
{ path: 'searchContract', component: SearchContractComponent },
{ path: 'update2/:id', component: UpdateContractComponent },
{ path: 'details2/:id', component: ContractDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
