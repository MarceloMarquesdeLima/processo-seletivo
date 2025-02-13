package com.exemplo.agenda.service;

import com.exemplo.agenda.dto.ContatoDTO;
import com.exemplo.agenda.model.Contato;
import com.exemplo.agenda.repository.ContatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContatoService {
    private final ContatoRepository repository;

    public ContatoDTO salvar(ContatoDTO dto) {
        Contato contato = toEntity(dto);
        return toDTO(repository.save(contato));
    }

    public List<ContatoDTO> listar() {
        return repository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public ContatoDTO buscarPorId(Long id) {
        Contato contato = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato não encontrado"));
        return toDTO(contato);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    // 🔄 Conversão DTO -> Entidade
    private Contato toEntity(ContatoDTO dto) {
        return new Contato(dto.getId(), dto.getNome(), dto.getCpf(), dto.getCep(), dto.getEmail(), dto.getTelefone());
    }

    // 🔄 Conversão Entidade -> DTO
    private ContatoDTO toDTO(Contato contato) {
        return new ContatoDTO(contato.getId(), contato.getNome(), contato.getCpf(), contato.getCep(), contato.getEmail(), contato.getTelefone());
    }
}
