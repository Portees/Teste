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
@Table(name = "trecho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trecho.findAll", query = "SELECT t FROM Trecho t"),
    @NamedQuery(name = "Trecho.findById", query = "SELECT t FROM Trecho t WHERE t.id = :id"),
    @NamedQuery(name = "Trecho.findByIdentificadorProcessoViagem", query = "SELECT t FROM Trecho t WHERE t.identificadorProcessoViagem = :identificadorProcessoViagem"),
    @NamedQuery(name = "Trecho.findBySequenciaTrecho", query = "SELECT t FROM Trecho t WHERE t.sequenciaTrecho = :sequenciaTrecho"),
    @NamedQuery(name = "Trecho.findByOrigemData", query = "SELECT t FROM Trecho t WHERE t.origemData = :origemData"),
    @NamedQuery(name = "Trecho.findByOrigemPais", query = "SELECT t FROM Trecho t WHERE t.origemPais = :origemPais"),
    @NamedQuery(name = "Trecho.findByOrigemUf", query = "SELECT t FROM Trecho t WHERE t.origemUf = :origemUf"),
    @NamedQuery(name = "Trecho.findByOrigemCidade", query = "SELECT t FROM Trecho t WHERE t.origemCidade = :origemCidade"),
    @NamedQuery(name = "Trecho.findByDestinoData", query = "SELECT t FROM Trecho t WHERE t.destinoData = :destinoData"),
    @NamedQuery(name = "Trecho.findByDestinoPais", query = "SELECT t FROM Trecho t WHERE t.destinoPais = :destinoPais"),
    @NamedQuery(name = "Trecho.findByDestinoUf", query = "SELECT t FROM Trecho t WHERE t.destinoUf = :destinoUf"),
    @NamedQuery(name = "Trecho.findByDestinoCidade", query = "SELECT t FROM Trecho t WHERE t.destinoCidade = :destinoCidade"),
    @NamedQuery(name = "Trecho.findByMeioTransporte", query = "SELECT t FROM Trecho t WHERE t.meioTransporte = :meioTransporte"),
    @NamedQuery(name = "Trecho.findByNumeroDiarias", query = "SELECT t FROM Trecho t WHERE t.numeroDiarias = :numeroDiarias"),
    @NamedQuery(name = "Trecho.findByMissao", query = "SELECT t FROM Trecho t WHERE t.missao = :missao")})
public class Trecho implements Serializable {

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
    @Column(name = "sequencia_trecho")
    private int sequenciaTrecho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "origem_data")
    private String origemData;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "origem_pais")
    private String origemPais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "origem_uf")
    private String origemUf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "origem_cidade")
    private String origemCidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "destino_data")
    private String destinoData;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "destino_pais")
    private String destinoPais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "destino_uf")
    private String destinoUf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "destino_cidade")
    private String destinoCidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "meio_transporte")
    private String meioTransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_diarias")
    private float numeroDiarias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "missao")
    private boolean missao;

    public Trecho() {
    }

    public Trecho(Integer id) {
        this.id = id;
    }

    public Trecho(Integer id, int identificadorProcessoViagem, int sequenciaTrecho, String origemData, String origemPais, String origemUf, String origemCidade, String destinoData, String destinoPais, String destinoUf, String destinoCidade, String meioTransporte, float numeroDiarias, boolean missao) {
        this.id = id;
        this.identificadorProcessoViagem = identificadorProcessoViagem;
        this.sequenciaTrecho = sequenciaTrecho;
        this.origemData = origemData;
        this.origemPais = origemPais;
        this.origemUf = origemUf;
        this.origemCidade = origemCidade;
        this.destinoData = destinoData;
        this.destinoPais = destinoPais;
        this.destinoUf = destinoUf;
        this.destinoCidade = destinoCidade;
        this.meioTransporte = meioTransporte;
        this.numeroDiarias = numeroDiarias;
        this.missao = missao;
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

    public int getSequenciaTrecho() {
        return sequenciaTrecho;
    }

    public void setSequenciaTrecho(int sequenciaTrecho) {
        this.sequenciaTrecho = sequenciaTrecho;
    }

    public String getOrigemData() {
        return origemData;
    }

    public void setOrigemData(String origemData) {
        this.origemData = origemData;
    }

    public String getOrigemPais() {
        return origemPais;
    }

    public void setOrigemPais(String origemPais) {
        this.origemPais = origemPais;
    }

    public String getOrigemUf() {
        return origemUf;
    }

    public void setOrigemUf(String origemUf) {
        this.origemUf = origemUf;
    }

    public String getOrigemCidade() {
        return origemCidade;
    }

    public void setOrigemCidade(String origemCidade) {
        this.origemCidade = origemCidade;
    }

    public String getDestinoData() {
        return destinoData;
    }

    public void setDestinoData(String destinoData) {
        this.destinoData = destinoData;
    }

    public String getDestinoPais() {
        return destinoPais;
    }

    public void setDestinoPais(String destinoPais) {
        this.destinoPais = destinoPais;
    }

    public String getDestinoUf() {
        return destinoUf;
    }

    public void setDestinoUf(String destinoUf) {
        this.destinoUf = destinoUf;
    }

    public String getDestinoCidade() {
        return destinoCidade;
    }

    public void setDestinoCidade(String destinoCidade) {
        this.destinoCidade = destinoCidade;
    }

    public String getMeioTransporte() {
        return meioTransporte;
    }

    public void setMeioTransporte(String meioTransporte) {
        this.meioTransporte = meioTransporte;
    }

    public float getNumeroDiarias() {
        return numeroDiarias;
    }

    public void setNumeroDiarias(float numeroDiarias) {
        this.numeroDiarias = numeroDiarias;
    }

    public boolean getMissao() {
        return missao;
    }

    public void setMissao(boolean missao) {
        this.missao = missao;
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
        if (!(object instanceof Trecho)) {
            return false;
        }
        Trecho other = (Trecho) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ifgoiano.model.Trecho[ id=" + id + " ]";
    }
    
}
