package com.iduff.controller;


import com.iduff.account.Account;
import com.iduff.account.AccountRepository;
import com.iduff.account.DadosAccount;
import com.iduff.pessoa.Pessoa;
import com.iduff.pessoa.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountRepository repository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosAccount dados){
        System.out.println(dados);
        repository.save(new Account(dados));
        pessoaRepository.save(new Pessoa(dados.pessoa()));

    }
}
