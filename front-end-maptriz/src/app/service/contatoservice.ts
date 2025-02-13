import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Contato } from '../models/contato';

@Injectable({
  providedIn: 'root'
})
export class ContatoService {
  private apiUrl = 'http://localhost:8080/contatos';

  constructor(private http: HttpClient) {}

  listar(): Observable<Contato[]> {
    return this.http.get<Contato[]>(this.apiUrl);
  }

  criar(contato: Contato): Observable<Contato> {
    return this.http.post<Contato>(this.apiUrl, contato);
  }

  excluir(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
