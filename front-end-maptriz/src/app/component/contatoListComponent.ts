import { Component, OnInit } from '@angular/core';
import { ContatoService } from '../services/contato.service';
import { Contato } from '../models/contato';

@Component({
  selector: 'app-contato-lista',
  templateUrl: './contato-lista.component.html'
})
export class ContatoListaComponent implements OnInit {
  contatos: Contato[] = [];

  constructor(private contatoService: ContatoService) {}

  ngOnInit(): void {
    this.contatoService.listar().subscribe(dados => this.contatos = dados);
  }
}