package com.iduff.pessoa;

import com.iduff.account.DadosAccount;
import com.iduff.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pessoa")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    @Enumerated(EnumType.STRING)
    private Funcao funcao;

    @Embedded
    private Endereco endereco;

    public Pessoa(DadosPessoa dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.funcao = dados.funcao();
        if(dados.endereco() != null){
            this.endereco = new Endereco(dados.endereco());
        }

    }
}
