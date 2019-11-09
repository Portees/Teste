/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifgoiano.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Raphael Policena
 */
@Entity
@Table(name = "pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagamento.findAll", query = "SELECT p FROM Pagamento p"),
    @NamedQuery(name = "Pagamento.findById", query = "SELECT p FROM Pagamento p WHERE p.id = :id"),
    @NamedQuery(name = "Pagamento.findByIdentificadorProcessoViagem", query = "SELECT p FROM Pagamento p WHERE p.identificadorProcessoViagem = :identificadorProcessoViagem"),
    @NamedQuery(name = "Pagamento.findByCodOrgaoSuperior", query = "SELECT p FROM Pagamento p WHERE p.codOrgaoSuperior = :codOrgaoSuperior"),
    @NamedQuery(name = "Pagamento.findByNomeOrgaoSuperior", query = "SELECT p FROM Pagamento p WHERE p.nomeOrgaoSuperior = :nomeOrgaoSuperior"),
    @NamedQuery(name = "Pagamento.findByCodOrgaoPagador", query = "SELECT p FROM Pagamento p WHERE p.codOrgaoPagador = :codOrgaoPagador"),
    @NamedQuery(name = "Pagamento.findByNomeOrgaoPagador", query = "SELECT p FROM Pagamento p WHERE p.nomeOrgaoPagador = :nomeOrgaoPagador"),
    @NamedQuery(name = "Pagamento.findByCodUnidadeGestoraPagadora", query = "SELECT p FROM Pagamento p WHERE p.codUnidadeGestoraPagadora = :codUnidadeGestoraPagadora"),
    @NamedQuery(name = "Pagamento.findByNomeUnidadeGestoraPagadora", query = "SELECT p FROM Pagamento p WHERE p.nomeUnidadeGestoraPagadora = :nomeUnidadeGestoraPagadora"),
    @NamedQuery(name = "Pagamento.findByTipoPagamento", query = "SELECT p FROM Pagamento p WHERE p.tipoPagamento = :tipoPagamento"),
    @NamedQuery(name = "Pagamento.findByValor", query = "SELECT p FROM Pagamento p WHERE p.valor = :valor")})
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "identificador_processo_viagem")
    private int identificadorProcessoViagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_orgao_superior")
    private float codOrgaoSuperior;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome_orgao_superior")
    private String nomeOrgaoSuperior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_orgao_pagador")
    private float codOrgaoPagador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome_orgao_pagador")
    private String nomeOrgaoPagador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_unidade_gestora_pagadora")
    private float codUnidadeGestoraPagadora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome_unidade_gestora_pagadora")
    private String nomeUnidadeGestoraPagadora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tipo_pagamento")
    private String tipoPagamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "valor")
    private String valor;

    public Pagamento() {
    }

    public Pagamento(Integer id) {
        this.id = id;
    }

    public Pagamento(Integer id, int identificadorProcessoViagem, float codOrgaoSuperior, String nomeOrgaoSuperior, float codOrgaoPagador, String nomeOrgaoPagador, float codUnidadeGestoraPagadora, String nomeUnidadeGestoraPagadora, String tipoPagamento, String valor) {
        this.id = id;
        this.identificadorProcessoViagem = identificadorProcessoViagem;
        this.codOrgaoSuperior = codOrgaoSuperior;
        this.nomeOrgaoSuperior = nomeOrgaoSuperior;
        this.codOrgaoPagador = codOrgaoPagador;
        this.nomeOrgaoPagador = nomeOrgaoPagador;
        this.codUnidadeGestoraPagadora = codUnidadeGestoraPagadora;
        this.nomeUnidadeGestoraPagadora = nomeUnidadeGestoraPagadora;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdentificadorProcessoViagem() {
        return identificadorProcessoViagem;
    }

    public void setIdentificadorProcessoViagem(int identificadorProcessoViagem) {
        this.identificadorProcessoViagem = identificadorProcessoViagem;
    }

    public float getCodOrgaoSuperior() {
        return codOrgaoSuperior;
    }

    public void setCodOrgaoSuperior(float codOrgaoSuperior) {
        this.codOrgaoSuperior = codOrgaoSuperior;
    }

    public String getNomeOrgaoSuperior() {
        return nomeOrgaoSuperior;
    }

    public void setNomeOrgaoSuperior(String nomeOrgaoSuperior) {
        this.nomeOrgaoSuperior = nomeOrgaoSuperior;
    }

    public float getCodOrgaoPagador() {
        return codOrgaoPagador;
    }

    public void setCodOrgaoPagador(float codOrgaoPagador) {
        this.codOrgaoPagador = codOrgaoPagador;
    }

    public String getNomeOrgaoPagador() {
        return nomeOrgaoPagador;
    }

    public void setNomeOrgaoPagador(String nomeOrgaoPagador) {
        this.nomeOrgaoPagador = nomeOrgaoPagador;
    }

    public float getCodUnidadeGestoraPagadora() {
        return codUnidadeGestoraPagadora;
    }

    public void setCodUnidadeGestoraPagadora(float codUnidadeGestoraPagadora) {
        this.codUnidadeGestoraPagadora = codUnidadeGestoraPagadora;
    }

    public String getNomeUnidadeGestoraPagadora() {
        return nomeUnidadeGestoraPagadora;
    }

    public void setNomeUnidadeGestoraPagadora(String nomeUnidadeGestoraPagadora) {
        this.nomeUnidadeGestoraPagadora = nomeUnidadeGestoraPagadora;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ifgoiano.model.Pagamento[ id=" + id + " ]";
    }
    
}
