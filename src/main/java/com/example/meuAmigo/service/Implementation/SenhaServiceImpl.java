package com.example.meuAmigo.service.Implementation;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SenhaServiceImpl {
    private final PasswordEncoder passwordEncoder;

    public SenhaServiceImpl() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    // Codificar a senha
    public String encodePassword(String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

    // Verificar a senha
    public boolean matches(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
