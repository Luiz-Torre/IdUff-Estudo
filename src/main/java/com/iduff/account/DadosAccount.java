package com.iduff.account;


import com.iduff.pessoa.DadosPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record DadosAccount(
        @NotBlank
        //  Para validar cpf deixar isso@CPF
        String cpf,

        @NotBlank
        String password,

        @Valid
        DadosPessoa pessoa
        ) {
}
