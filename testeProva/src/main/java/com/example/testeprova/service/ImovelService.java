package com.example.testeprova.service;

import com.example.testeprova.entity.Imovel;

import com.example.testeprova.entity.Proprietario;
import com.example.testeprova.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {

    @Autowired
    ImovelRepository imovelRepository;

    public Imovel salvarImovel(Imovel imovel) {

        return imovelRepository.save(imovel);
    }

    public Imovel buscarImovel(Long id) {
        return imovelRepository.findById(id).orElse(null);
    }

    public Imovel update(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public Imovel delete(Long id) {
        Imovel imovel = imovelRepository.findById(id).orElse(null);
        if (imovel != null) {
            imovelRepository.delete(imovel);
        }
        return imovel;
    }

}
