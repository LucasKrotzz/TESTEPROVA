package com.example.testeprova.controller;

import com.example.testeprova.entity.Imovel;
import com.example.testeprova.entity.Proprietario;
import com.example.testeprova.service.ImovelService;
import com.example.testeprova.service.PropriedadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/imovel")
public class ImovelController {

    @Autowired
    ImovelService imovelService;

    @PostMapping("/cadastrar")
    public Imovel cadastrarImovel(@Valid @RequestBody Imovel imovel) {
        return imovelService.salvarImovel(imovel);
    }

    @GetMapping("imoveis/{id}")
    public Imovel buscarImoveis(Imovel imovel) {

        return imovelService.buscarImovel(imovel.getId());
    }

    @PutMapping("update")
    public Imovel updateImovel(@RequestBody Imovel imovel) {

        return imovelService.update(imovel);
    }

    @DeleteMapping("deletar/{id}")
    public Imovel deletarImovel(@PathVariable Long id) {

        return imovelService.delete(id);
    }

}
