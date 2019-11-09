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
@Table(name = "viagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viagem.findAll", query = "SELECT v FROM Viagem v"),
    @NamedQuery(name = "Viagem.findById", query = "SELECT v FROM Viagem v WHERE v.id = :id"),
    @NamedQuery(name = "Viagem.findByIdentificadorProcessoViagem", query = "SELECT v FROM Viagem v WHERE v.identificadorProcessoViagem = :identificadorProcessoViagem"),
    @NamedQuery(name = "Viagem.findByCodOrgaoSuperior", query = "SELECT v FROM Viagem v WHERE v.codOrgaoSuperior = :codOrgaoSuperior"),
    @NamedQuery(name = "Viagem.findByNomeOrgaoSuperior", query = "SELECT v FROM Viagem v WHERE v.nomeOrgaoSuperior = :nomeOrgaoSuperior"),
    @NamedQuery(name = "Viagem.findByNomeOrgaoSolicitante", query = "SELECT v FROM Viagem v WHERE v.nomeOrgaoSolicitante = :nomeOrgaoSolicitante"),
    @NamedQuery(name = "Viagem.findByCpfViajante", query = "SELECT v FROM Viagem v WHERE v.cpfViajante = :cpfViajante"),
    @NamedQuery(name = "Viagem.findByNomeViajante", query = "SELECT v FROM Viagem v WHERE v.nomeViajante = :nomeViajante"),
    @NamedQuery(name = "Viagem.findByCargoViajante", query = "SELECT v FROM Viagem v WHERE v.cargoViajante = :cargoViajante"),
    @NamedQuery(name = "Viagem.findByPeriodoDataInicio", query = "SELECT v FROM Viagem v WHERE v.periodoDataInicio = :periodoDataInicio"),
    @NamedQuery(name = "Viagem.findByPeriodoDataFim", query = "SELECT v FROM Viagem v WHERE v.periodoDataFim = :periodoDataFim"),
    @NamedQuery(name = "Viagem.findByDestinos", query = "SELECT v FROM Viagem v WHERE v.destinos = :destinos"),
    @NamedQuery(name = "Viagem.findByMotivo", query = "SELECT v FROM Viagem v WHERE v.motivo = :motivo"),
    @NamedQuery(name = "Viagem.findByValorDiarias", query = "SELECT v FROM Viagem v WHERE v.valorDiarias = :valorDiarias"),
    @NamedQuery(name = "Viagem.findByValorPassagens", query = "SELECT v FROM Viagem v WHERE v.valorPassagens = :valorPassagens"),
    @NamedQuery(name = "Viagem.findByValorOutrosGastos", query = "SELECT v FROM Viagem v WHERE v.valorOutrosGastos = :valorOutrosGastos")})
public class Viagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
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
    @Size(min = 1, max = 255)
    @Column(name = "nome_orgao_solicitante")
    private String nomeOrgaoSolicitante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cpf_viajante")
    private String cpfViajante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome_viajante")
    private String nomeViajante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cargo_viajante")
    private String cargoViajante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "periodo_data_inicio")
    private String periodoDataInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "periodo_data_fim")
    private String periodoDataFim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "destinos")
    private String destinos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "motivo")
    private String motivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_diarias")
    private float valorDiarias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_passagens")
    private float valorPassagens;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_outros_gastos")
    private float valorOutrosGastos;

    public Viagem() {
    }

    public Viagem(Integer id) {
        this.id = id;
    }

    public Viagem(Integer id, int identificadorProcessoViagem, float codOrgaoSuperior, String nomeOrgaoSuperior, String nomeOrgaoSolicitante, String cpfViajante, String nomeViajante, String cargoViajante, String periodoDataInicio, String periodoDataFim, String destinos, String motivo, float valorDiarias, float valorPassagens, float valorOutrosGastos) {
        this.id = id;
        this.identificadorProcessoViagem = identificadorProcessoViagem;
        this.codOrgaoSuperior = codOrgaoSuperior;
        this.nomeOrgaoSuperior = nomeOrgaoSuperior;
        this.nomeOrgaoSolicitante = nomeOrgaoSolicitante;
        this.cpfViajante = cpfViajante;
        this.nomeViajante = nomeViajante;
        this.cargoViajante = cargoViajante;
        this.periodoDataInicio = periodoDataInicio;
        this.periodoDataFim = periodoDataFim;
        this.destinos = destinos;
        this.motivo = motivo;
        this.valorDiarias = valorDiarias;
        this.valorPassagens = valorPassagens;
        this.valorOutrosGastos = valorOutrosGastos;
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

    public String getNomeOrgaoSolicitante() {
        return nomeOrgaoSolicitante;
    }

    public void setNomeOrgaoSolicitante(String nomeOrgaoSolicitante) {
        this.nomeOrgaoSolicitante = nomeOrgaoSolicitante;
    }

    public String getCpfViajante() {
        return cpfViajante;
    }

    public void setCpfViajante(String cpfViajante) {
        this.cpfViajante = cpfViajante;
    }

    public String getNomeViajante() {
        return nomeViajante;
    }

    public void setNomeViajante(String nomeViajante) {
        this.nomeViajante = nomeViajante;
    }

    public String getCargoViajante() {
        return cargoViajante;
    }

    public void setCargoViajante(String cargoViajante) {
        this.cargoViajante = cargoViajante;
    }

    public String getPeriodoDataInicio() {
        return periodoDataInicio;
    }

    public void setPeriodoDataInicio(String periodoDataInicio) {
        this.periodoDataInicio = periodoDataInicio;
    }

    public String getPeriodoDataFim() {
        return periodoDataFim;
    }

    public void setPeriodoDataFim(String periodoDataFim) {
        this.periodoDataFim = periodoDataFim;
    }

    public String getDestinos() {
        return destinos;
    }

    public void setDestinos(String destinos) {
        this.destinos = destinos;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public float getValorDiarias() {
        return valorDiarias;
    }

    public void setValorDiarias(float valorDiarias) {
        this.valorDiarias = valorDiarias;
    }

    public float getValorPassagens() {
        return valorPassagens;
    }

    public void setValorPassagens(float valorPassagens) {
        this.valorPassagens = valorPassagens;
    }

    public float getValorOutrosGastos() {
        return valorOutrosGastos;
    }

    public void setValorOutrosGastos(float valorOutrosGastos) {
        this.valorOutrosGastos = valorOutrosGastos;
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
        if (!(object instanceof Viagem)) {
            return false;
        }
        Viagem other = (Viagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ifgoiano.model.Viagem[ id=" + id + " ]";
    }
    
}
