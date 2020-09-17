import { Injectable } from '@angular/core';
import { Observable} from 'rxjs';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import { map} from 'rxjs/operators';



@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) { }

  endpoint = 'http://localhost:8080/api/';
  httpOptions = {
    headers: new HttpHeaders({
      'content-type': 'application/json'
    })
  };

  private extractData(res: Response){
    const body = res;
    return body || { };
  }

  getQuery(id): Observable<any>{
    return this.http.get(this.endpoint + 'planets/query/' + id).pipe(
      map(this.extractData));
  }

  getAllPlanets(): Observable<any>{
    return this.http.get(this.endpoint + 'planets').pipe(
      map(this.extractData));
  }

  getPlanets(page): Observable<any>{
    const params = new HttpParams().set('page', page);
    return this.http.get(this.endpoint + 'planets/page', {params}).pipe(
      map(this.extractData));
  }

  getPlanet(id): Observable<any>{
    return this.http.get(this.endpoint + 'planets/' + id).pipe(
      map(this.extractData));
  }

  getPlanetsStartingWith(nameStarts, page): Observable<any>{
    const params = new HttpParams().set('nameStarts', nameStarts).set('page', page);
    return this.http.get(this.endpoint + 'planets/starts', {params}).pipe(
      map(this.extractData));
  }

  getPlanetsNamesContaining(nameContains, page): Observable<any>{
    const params = new HttpParams().set('nameContains', nameContains).set('page', page);
    return this.http.get(this.endpoint + 'planets/contains', {params}).pipe(
      map(this.extractData));
  }
}
