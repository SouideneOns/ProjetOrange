import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderCreateContractComponent } from './header-create-contract.component';

describe('HeaderCreateContractComponent', () => {
  let component: HeaderCreateContractComponent;
  let fixture: ComponentFixture<HeaderCreateContractComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HeaderCreateContractComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderCreateContractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
