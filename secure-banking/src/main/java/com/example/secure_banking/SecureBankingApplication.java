package com.example.secure_banking;

import com.example.secure_banking.model.Account;
import com.example.secure_banking.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureBankingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureBankingApplication.class, args);
    }

    // App start hote hi sample accounts insert karne ke liye
    @Bean
    CommandLineRunner run(AccountRepository accountRepository) {
        return args -> {
            accountRepository.save(new Account(null, "Gourav", 5000));
            accountRepository.save(new Account(null, "Ravi", 3000));
            accountRepository.save(new Account(null, "Aman", 7000));
        };
    }
}
