import { Injectable } from '@angular/core';
import { Observable} from "rxjs";
import { HttpClient, HttpHeaders, HttpErrorResponse} from "@angular/common/http";
import {map} from "rxjs/operators";



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
    let body = res;
    return body || { };
  }

  getQuery(id): Observable<any>{
    return this.http.get(this.endpoint + 'planets/query/' + id).pipe(
      map(this.extractData));
  }

  getPlanets(): Observable<any>{
    return this.http.get(this.endpoint + 'planets').pipe(
      map(this.extractData));
  }

  getPlanet(id): Observable<any>{
    return this.http.get(this.endpoint + 'planets/' + id).pipe(
      map(this.extractData));
  }
}
