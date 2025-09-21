package com.example.secure_banking.controller;

import com.example.secure_banking.model.Account;
import com.example.secure_banking.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // 1. Naya account banao
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }

    // 2. Sab accounts dekho
    @GetMapping
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // 3. Id se ek account dekho
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    // 4. Paisa deposit karo
    @PutMapping("/{id}/deposit")
    public Account deposit(@PathVariable Long id, @RequestParam double amount) {
        Account acc = accountRepository.findById(id).orElse(null);
        if (acc != null) {
            acc.setBalance(acc.getBalance() + amount);
            return accountRepository.save(acc);
        }
        return null;
    }

    // 5. Paisa withdraw karo
    @PutMapping("/{id}/withdraw")
    public Account withdraw(@PathVariable Long id, @RequestParam double amount) {
        Account acc = accountRepository.findById(id).orElse(null);
        if (acc != null && acc.getBalance() >= amount) {
            acc.setBalance(acc.getBalance() - amount);
            return accountRepository.save(acc);
        }
        return null;
    }
}
