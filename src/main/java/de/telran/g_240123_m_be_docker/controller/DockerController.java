package de.telran.g_240123_m_be_docker.controller;

import de.telran.g_240123_m_be_docker.domain.entity.Message;
import de.telran.g_240123_m_be_docker.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @Autowired
    private MessageService service;

    @GetMapping
    public String get() {
        return "HELLO FROM DOCKER APP!";
    }

    @GetMapping("/message")
    public Message getMessage() {
        return service.get();
    }
}