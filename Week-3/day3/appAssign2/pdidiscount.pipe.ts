import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pdidiscount'
})
export class PdidiscountPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
