package com.exemplo.agenda.dto;

import jakarta.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContatoDTO {
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Pattern(regexp = "\\d{11}", message = "CPF inválido")
    private String cpf;

    @Pattern(regexp = "\\d{8}", message = "CEP inválido")
    private String cep;

    @Email(message = "E-mail inválido")
    private String email;

    private String telefone;
}
