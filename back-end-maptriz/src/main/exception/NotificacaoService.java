package com.exemplo.agenda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificacaoService {
    public void enviarNotificacao() {
        String url = "https://run.mocky.io/v3/c9ec2ca3-a7f5-41d0-8550-b859508f4948";
        new RestTemplate().getForObject(url, String.class);
    }
}