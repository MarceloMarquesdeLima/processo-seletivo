package com.exemplo.agenda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService {
    public boolean validarUsuario() {
        String url = "https://run.mocky.io/v3/970f7229-1a5e-4905-bac8-81aaa9d51e17";
        String response = new RestTemplate().getForObject(url, String.class);
        return response != null;
    }
}