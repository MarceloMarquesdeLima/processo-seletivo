package com.exemplo.agenda.controller;

import com.exemplo.agenda.dto.ContatoDTO;
import com.exemplo.agenda.service.ContatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
@RequiredArgsConstructor
public class ContatoController {
    private final ContatoService service;

    @PostMapping
    public ResponseEntity<ContatoDTO> criar(@RequestBody ContatoDTO dto) {
        return ResponseEntity.ok(service.salvar(dto));
    }

    @GetMapping
    public ResponseEntity<List<ContatoDTO>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContatoDTO> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
