package com.example.testeprova.service;

import com.example.testeprova.entity.Proprietario;
import com.example.testeprova.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropriedadeService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public Proprietario salvarProprietario(Proprietario proprietario) {

        return proprietarioRepository.save(proprietario);
    }

    public Proprietario buscarProprietario(Long id) {
        return proprietarioRepository.findById(id).orElse(null);
    }

    public Proprietario update(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public Proprietario delete(Long id) {
        Proprietario proprietario = proprietarioRepository.findById(id).orElse(null);
        if (proprietario != null) {
            proprietarioRepository.delete(proprietario);
        }
        return proprietario;
    }


}
