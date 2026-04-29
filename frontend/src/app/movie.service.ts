import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class MovieService {
  // Use your Master's Public IP
  private apiUrl = 'http://13.235.241.23';

  constructor(private http: HttpClient) { }

  getMovies() { return this.http.get(this.apiUrl); }
}
