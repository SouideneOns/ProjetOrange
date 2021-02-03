import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatStepperModule } from '@angular/material/stepper';
import { MatIconModule } from '@angular/material/icon';
import {ToastrModule} from 'ngx-toastr';
import { STEPPER_GLOBAL_OPTIONS } from '@angular/cdk/stepper';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatRadioModule} from '@angular/material/radio';
import {MatSelectModule} from '@angular/material/select';
import {MatSliderModule} from '@angular/material/slider';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatMenuModule} from '@angular/material/menu';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatListModule} from '@angular/material/list';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatCardModule} from '@angular/material/card';
import {MatTabsModule} from '@angular/material/tabs';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatChipsModule} from '@angular/material/chips';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatDialogModule} from '@angular/material/dialog';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatTableModule} from '@angular/material/table';
import {MatSortModule} from '@angular/material/sort';
import {MatPaginatorModule} from '@angular/material/paginator';
import { MatCheckboxDefaultOptions, MAT_CHECKBOX_DEFAULT_OPTIONS } from '@angular/material/checkbox';

import { AddCustomerComponent } from './components/add-customer/add-customer.component';
import { FrontComponent } from './components/front/front.component';
import { HeaderComponent } from './components/headers/header/header.component';
import { HeaderHomeComponent } from './components/headers/header-home/header-home.component';
import { HeaderCreateComponent } from './components/headers/header-create/header-create.component';
import { HeaderProfileComponent } from './components/headers/header-profile/header-profile.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { ProfileComponent } from './components/profile/profile.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { BasicAuthHttpInterceptorService } from './services/basic-auth-http-interceptor.service';
import { CreateContractComponent } from './components/create-contract/create-contract.component';
import { HeaderCreateContractComponent } from './components/headers/header-create-contract/header-create-contract.component';
import { SearchCustomerComponent } from './components/search-customer/search-customer.component';
import { HeaderSearchComponent } from './components/headers/header-search/header-search.component';
import { CustomerDetailsComponent } from './components/customer-details/customer-details.component';
import { UpdateCustomerComponent } from './components/update-customer/update-customer.component';
import { ContractDetailsComponent } from './components/contract-details/contract-details.component';
import { SearchContractComponent } from './components/search-contract/search-contract.component';
import { UpdateContractComponent } from './components/update-contract/update-contract.component';
import { HeaderSearchContractComponent } from './components/headers/header-search-contract/header-search-contract.component';

@NgModule({
  declarations: [
    AppComponent,
    AddCustomerComponent,
    FrontComponent,
    HeaderComponent,
    HeaderHomeComponent,
    HeaderCreateComponent,
    HeaderProfileComponent,
    HomeComponent,
    LoginComponent,
    LogoutComponent,
    ProfileComponent,
    CreateContractComponent,
    HeaderCreateContractComponent,
    SearchCustomerComponent,
    HeaderSearchComponent,
    CustomerDetailsComponent,
    UpdateCustomerComponent,
    ContractDetailsComponent,
    SearchContractComponent,
    UpdateContractComponent,
    HeaderSearchContractComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot({progressAnimation:"increasing",
    preventDuplicates:true}),
    MatStepperModule,
    MatIconModule,
    MatCheckboxModule,
    MatCheckboxModule,
    MatButtonModule,
    MatInputModule,
    MatAutocompleteModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatRadioModule,
    MatSelectModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatMenuModule,
    MatSidenavModule,
    MatToolbarModule,
    MatListModule,
    MatGridListModule,
    MatCardModule,
    MatStepperModule,
    MatTabsModule,
    MatExpansionModule,
    MatButtonToggleModule,
    MatChipsModule,
    MatIconModule,
    MatProgressSpinnerModule,
    MatProgressBarModule,
    MatDialogModule,
    MatTooltipModule,
    MatSnackBarModule,
    MatTableModule,
    MatSortModule,
    MatPaginatorModule
  ],
  providers: [
    {provide:HTTP_INTERCEPTORS, useClass:BasicAuthHttpInterceptorService, multi:true},
    {provide: STEPPER_GLOBAL_OPTIONS,useValue: { displayDefaultIndicatorType: false }}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
