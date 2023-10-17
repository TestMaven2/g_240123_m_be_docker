package de.telran.g_240123_m_be_docker.service;

import de.telran.g_240123_m_be_docker.domain.entity.Message;
import de.telran.g_240123_m_be_docker.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public Message get() {
        return repository.findById(1).orElse(null);
    }
}