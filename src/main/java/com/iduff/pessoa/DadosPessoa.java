package com.iduff.pessoa;

import com.iduff.endereco.DadosEndereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record DadosPessoa(

        @NotBlank
        String nome,

        //@CPF
        @NotBlank
        String cpf,

        @NotBlank
        String email,


        DadosEndereco endereco,

        @NotNull
        Funcao funcao
) {
}
