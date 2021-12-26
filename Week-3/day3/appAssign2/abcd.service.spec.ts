import { TestBed } from '@angular/core/testing';

import { AbcdService } from './abcd.service';

describe('AbcdService', () => {
  let service: AbcdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AbcdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
