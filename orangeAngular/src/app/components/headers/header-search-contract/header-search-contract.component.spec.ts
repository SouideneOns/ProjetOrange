import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderSearchContractComponent } from './header-search-contract.component';

describe('HeaderSearchContractComponent', () => {
  let component: HeaderSearchContractComponent;
  let fixture: ComponentFixture<HeaderSearchContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HeaderSearchContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderSearchContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
