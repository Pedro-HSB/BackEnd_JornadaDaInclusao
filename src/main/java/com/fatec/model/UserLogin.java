package com.fatec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

/**
 * Classe que representa os dados de login de um usuário.
 * Utilizada para autenticação e troca de informações de login.
 */
@Data
@Builder
@Entity
public class UserLogin {

    // Identificador único do usuário.
    @Id
    private String id;

    // Nome do responsável pelo usuário.
    @NotBlank(message = "O atributo Nome do Responsável é obrigatório.")
    private String nomeResponsavel;

    // Email do usuário.
    @NotBlank(message = "O atributo email é obrigatório.")
    @Email(message = "O atributo email deve ser um email válido.")
    private String email;

    // Senha do usuário.
    @NotBlank(message = "O atributo senha é obrigatório.")
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres.")
    private String senha;

    // Token de autenticação gerado após o login.
    // (Este campo geralmente não é armazenado no banco)
    // Caso seja necessário, você pode usar esse campo apenas durante o processo de autenticação.
    private String token;

}
