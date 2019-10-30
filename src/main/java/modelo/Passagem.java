/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
 * @author Pedro Portes
 */
@Entity
@Table(name = "passagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passagem.findAll", query = "SELECT p FROM Passagem p"),
    @NamedQuery(name = "Passagem.findById", query = "SELECT p FROM Passagem p WHERE p.id = :id"),
    @NamedQuery(name = "Passagem.findByIdentificadorProcessoViagem", query = "SELECT p FROM Passagem p WHERE p.identificadorProcessoViagem = :identificadorProcessoViagem"),
    @NamedQuery(name = "Passagem.findByMeioTransporte", query = "SELECT p FROM Passagem p WHERE p.meioTransporte = :meioTransporte"),
    @NamedQuery(name = "Passagem.findByPaisOrigemIda", query = "SELECT p FROM Passagem p WHERE p.paisOrigemIda = :paisOrigemIda"),
    @NamedQuery(name = "Passagem.findByUfOrigemIda", query = "SELECT p FROM Passagem p WHERE p.ufOrigemIda = :ufOrigemIda"),
    @NamedQuery(name = "Passagem.findByCidadeOrigemIda", query = "SELECT p FROM Passagem p WHERE p.cidadeOrigemIda = :cidadeOrigemIda"),
    @NamedQuery(name = "Passagem.findByPaisDestinoIda", query = "SELECT p FROM Passagem p WHERE p.paisDestinoIda = :paisDestinoIda"),
    @NamedQuery(name = "Passagem.findByUfDestinoIda", query = "SELECT p FROM Passagem p WHERE p.ufDestinoIda = :ufDestinoIda"),
    @NamedQuery(name = "Passagem.findByCidadeDestinoIda", query = "SELECT p FROM Passagem p WHERE p.cidadeDestinoIda = :cidadeDestinoIda"),
    @NamedQuery(name = "Passagem.findByPaisOrigemVolta", query = "SELECT p FROM Passagem p WHERE p.paisOrigemVolta = :paisOrigemVolta"),
    @NamedQuery(name = "Passagem.findByUfOrigemVolta", query = "SELECT p FROM Passagem p WHERE p.ufOrigemVolta = :ufOrigemVolta"),
    @NamedQuery(name = "Passagem.findByCidadeOrigemVolta", query = "SELECT p FROM Passagem p WHERE p.cidadeOrigemVolta = :cidadeOrigemVolta"),
    @NamedQuery(name = "Passagem.findByPaisDestinoVolta", query = "SELECT p FROM Passagem p WHERE p.paisDestinoVolta = :paisDestinoVolta"),
    @NamedQuery(name = "Passagem.findByUfDestinoVolta", query = "SELECT p FROM Passagem p WHERE p.ufDestinoVolta = :ufDestinoVolta"),
    @NamedQuery(name = "Passagem.findByCidadeDestinoVolta", query = "SELECT p FROM Passagem p WHERE p.cidadeDestinoVolta = :cidadeDestinoVolta"),
    @NamedQuery(name = "Passagem.findByValorPassagem", query = "SELECT p FROM Passagem p WHERE p.valorPassagem = :valorPassagem"),
    @NamedQuery(name = "Passagem.findByTaxaServico", query = "SELECT p FROM Passagem p WHERE p.taxaServico = :taxaServico")})
public class Passagem implements Serializable {
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
    @Size(min = 1, max = 255)
    @Column(name = "meio_transporte")
    private String meioTransporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pais_origem_ida")
    private String paisOrigemIda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "uf_origem_ida")
    private String ufOrigemIda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cidade_origem_ida")
    private String cidadeOrigemIda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pais_destino_ida")
    private String paisDestinoIda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "uf_destino_ida")
    private String ufDestinoIda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cidade_destino_ida")
    private String cidadeDestinoIda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pais_origem_volta")
    private String paisOrigemVolta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "uf_origem_volta")
    private String ufOrigemVolta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cidade_origem_volta")
    private String cidadeOrigemVolta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pais_destino_volta")
    private String paisDestinoVolta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "uf_destino_volta")
    private String ufDestinoVolta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cidade_destino_volta")
    private String cidadeDestinoVolta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_passagem")
    private float valorPassagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "taxa_servico")
    private float taxaServico;

    public Passagem() {
    }

    public Passagem(Integer id) {
        this.id = id;
    }

    public Passagem(Integer id, int identificadorProcessoViagem, String meioTransporte, String paisOrigemIda, String ufOrigemIda, String cidadeOrigemIda, String paisDestinoIda, String ufDestinoIda, String cidadeDestinoIda, String paisOrigemVolta, String ufOrigemVolta, String cidadeOrigemVolta, String paisDestinoVolta, String ufDestinoVolta, String cidadeDestinoVolta, float valorPassagem, float taxaServico) {
        this.id = id;
        this.identificadorProcessoViagem = identificadorProcessoViagem;
        this.meioTransporte = meioTransporte;
        this.paisOrigemIda = paisOrigemIda;
        this.ufOrigemIda = ufOrigemIda;
        this.cidadeOrigemIda = cidadeOrigemIda;
        this.paisDestinoIda = paisDestinoIda;
        this.ufDestinoIda = ufDestinoIda;
        this.cidadeDestinoIda = cidadeDestinoIda;
        this.paisOrigemVolta = paisOrigemVolta;
        this.ufOrigemVolta = ufOrigemVolta;
        this.cidadeOrigemVolta = cidadeOrigemVolta;
        this.paisDestinoVolta = paisDestinoVolta;
        this.ufDestinoVolta = ufDestinoVolta;
        this.cidadeDestinoVolta = cidadeDestinoVolta;
        this.valorPassagem = valorPassagem;
        this.taxaServico = taxaServico;
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

    public String getMeioTransporte() {
        return meioTransporte;
    }

    public void setMeioTransporte(String meioTransporte) {
        this.meioTransporte = meioTransporte;
    }

    public String getPaisOrigemIda() {
        return paisOrigemIda;
    }

    public void setPaisOrigemIda(String paisOrigemIda) {
        this.paisOrigemIda = paisOrigemIda;
    }

    public String getUfOrigemIda() {
        return ufOrigemIda;
    }

    public void setUfOrigemIda(String ufOrigemIda) {
        this.ufOrigemIda = ufOrigemIda;
    }

    public String getCidadeOrigemIda() {
        return cidadeOrigemIda;
    }

    public void setCidadeOrigemIda(String cidadeOrigemIda) {
        this.cidadeOrigemIda = cidadeOrigemIda;
    }

    public String getPaisDestinoIda() {
        return paisDestinoIda;
    }

    public void setPaisDestinoIda(String paisDestinoIda) {
        this.paisDestinoIda = paisDestinoIda;
    }

    public String getUfDestinoIda() {
        return ufDestinoIda;
    }

    public void setUfDestinoIda(String ufDestinoIda) {
        this.ufDestinoIda = ufDestinoIda;
    }

    public String getCidadeDestinoIda() {
        return cidadeDestinoIda;
    }

    public void setCidadeDestinoIda(String cidadeDestinoIda) {
        this.cidadeDestinoIda = cidadeDestinoIda;
    }

    public String getPaisOrigemVolta() {
        return paisOrigemVolta;
    }

    public void setPaisOrigemVolta(String paisOrigemVolta) {
        this.paisOrigemVolta = paisOrigemVolta;
    }

    public String getUfOrigemVolta() {
        return ufOrigemVolta;
    }

    public void setUfOrigemVolta(String ufOrigemVolta) {
        this.ufOrigemVolta = ufOrigemVolta;
    }

    public String getCidadeOrigemVolta() {
        return cidadeOrigemVolta;
    }

    public void setCidadeOrigemVolta(String cidadeOrigemVolta) {
        this.cidadeOrigemVolta = cidadeOrigemVolta;
    }

    public String getPaisDestinoVolta() {
        return paisDestinoVolta;
    }

    public void setPaisDestinoVolta(String paisDestinoVolta) {
        this.paisDestinoVolta = paisDestinoVolta;
    }

    public String getUfDestinoVolta() {
        return ufDestinoVolta;
    }

    public void setUfDestinoVolta(String ufDestinoVolta) {
        this.ufDestinoVolta = ufDestinoVolta;
    }

    public String getCidadeDestinoVolta() {
        return cidadeDestinoVolta;
    }

    public void setCidadeDestinoVolta(String cidadeDestinoVolta) {
        this.cidadeDestinoVolta = cidadeDestinoVolta;
    }

    public float getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(float valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public float getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(float taxaServico) {
        this.taxaServico = taxaServico;
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
        if (!(object instanceof Passagem)) {
            return false;
        }
        Passagem other = (Passagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Passagem[ id=" + id + " ]";
    }
    
}
