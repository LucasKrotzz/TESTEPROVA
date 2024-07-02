package com.example.testeprova.controller;

import com.example.testeprova.entity.Proprietario;
import com.example.testeprova.service.PropriedadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/proprietario")
public class ProprietarioController {

    @Autowired
    PropriedadeService propriedadeService;

    @PostMapping("/cadastrar")
    public Proprietario cadastrarProprietario(@Valid @RequestBody Proprietario proprietario) {
            return propriedadeService.salvarProprietario(proprietario);
    }

    @GetMapping("proprietarios/{id}")
    public Proprietario buscarProprietario(Proprietario proprietario) {

        return propriedadeService.buscarProprietario(proprietario.getId());
    }

    @PutMapping("update")
    public Proprietario updateProprietario(@RequestBody Proprietario proprietario) {

        return propriedadeService.update(proprietario);
    }

    @DeleteMapping("deletar/{id}")
    public Proprietario deletarProprietario(@PathVariable Long id) {

        return propriedadeService.delete(id);
    }

}
