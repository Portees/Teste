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
@Table(name = "comentarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentarios.findAll", query = "SELECT c FROM Comentarios c"),
    @NamedQuery(name = "Comentarios.findById", query = "SELECT c FROM Comentarios c WHERE c.id = :id"),
    @NamedQuery(name = "Comentarios.findByIdPessoa", query = "SELECT c FROM Comentarios c WHERE c.idPessoa = :idPessoa"),
    @NamedQuery(name = "Comentarios.findByTextoComentado", query = "SELECT c FROM Comentarios c WHERE c.textoComentado = :textoComentado"),
    @NamedQuery(name = "Comentarios.findByIdResposta", query = "SELECT c FROM Comentarios c WHERE c.idResposta = :idResposta")})
public class Comentarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pessoa")
    private int idPessoa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "texto_comentado")
    private String textoComentado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "id_resposta")
    private String idResposta;

    public Comentarios() {
    }

    public Comentarios(Integer id) {
        this.id = id;
    }

    public Comentarios(Integer id, int idPessoa, String textoComentado, String idResposta) {
        this.id = id;
        this.idPessoa = idPessoa;
        this.textoComentado = textoComentado;
        this.idResposta = idResposta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTextoComentado() {
        return textoComentado;
    }

    public void setTextoComentado(String textoComentado) {
        this.textoComentado = textoComentado;
    }

    public String getIdResposta() {
        return idResposta;
    }

    public void setIdResposta(String idResposta) {
        this.idResposta = idResposta;
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
        if (!(object instanceof Comentarios)) {
            return false;
        }
        Comentarios other = (Comentarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ifgoiano.model.Comentarios[ id=" + id + " ]";
    }
    
}
