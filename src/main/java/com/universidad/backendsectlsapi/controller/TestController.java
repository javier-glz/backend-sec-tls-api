package com.universidad.backendsectlsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/auth/login-info")
    public String publicAccess() {
        return "Acceso público: El servicio HTTPS está respondiendo correctamente.";
    }

    @GetMapping("/secure/data")
    public String protectedAccess() {
        return "Acceso privado: Autenticación exitosa sobre conexión cifrada TLS.";
    }
}