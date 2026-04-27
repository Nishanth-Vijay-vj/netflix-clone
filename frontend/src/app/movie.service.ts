import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class MovieService {
  private apiUrl = 'http://backend-service:8080/api/movies';
  constructor(private http: HttpClient) {}
  getMovies() { return this.http.get(this.apiUrl); }
}
