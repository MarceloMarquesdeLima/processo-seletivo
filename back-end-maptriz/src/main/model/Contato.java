package com.exemplo.agenda.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "contatos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @Pattern(regexp = "\\d{11}", message = "CPF inválido")
    private String cpf;

    @Pattern(regexp = "\\d{8}", message = "CEP inválido")
    private String cep;

    private String email;
    private String telefone;
}
