package com.example.testeprova.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 10, message = "Deve conter no minimo 10 caracteres.")
    private String endereco;

    private Tipo tipo;

    @Min(value = 0,message = "Deve ser maior que 0")
    private Double tamanho;

    @Min( value = 0,message = "Deve ser maior ou igual a 0.")
    private Integer numeroQuartos;
    private Integer numeroBanheiros;

    @Min(value = 0, message = "Valor deve ser maior que 0.")
    private Double Valor;
    private LocalDate dataCadastro;

    @ManyToOne
    private Proprietario proprietario;
 }
