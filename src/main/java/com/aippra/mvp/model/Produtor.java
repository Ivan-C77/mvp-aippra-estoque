package com.aippra.mvp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produtor")
public class Produtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String comunidade;

    // Construtores, Getters e Setters
    public Produtor() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getComunidade() { return comunidade; }
    public void setComunidade(String comunidade) { this.comunidade = comunidade; }
}