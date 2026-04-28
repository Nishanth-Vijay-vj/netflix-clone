import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class MovieService {
  private apiUrl = 'http://13.206.86';
  constructor(private http: HttpClient) {}
  getMovies() { return this.http.get(this.apiUrl); }
}
