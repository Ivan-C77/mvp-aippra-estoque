package com.aippra.mvp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_item_consignado")
public class ItemConsignado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Integer quantidadeEstoque;

    @ManyToOne
    @JoinColumn(name = "produtor_id")
    private Produtor produtor;

    // Construtores, Getters e Setters
    public ItemConsignado() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Integer getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(Integer quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }
    public Produtor getProdutor() { return produtor; }
    public void setProdutor(Produtor produtor) { this.produtor = produtor; }
}