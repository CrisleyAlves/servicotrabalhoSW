/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author devuser
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "Pessoa")
public class Pessoa implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pessoa", strategy = GenerationType.SEQUENCE)
    @XmlElement(required = true)
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "NOME", length = 50, nullable = false)
    @XmlElement(required = true)
    private String nome;
    
    @Column(name = "ENDERECO", length = 255, nullable = false)
    @XmlElement(required = true)
    private String endereco;
    
    @Column(name = "CEPORIGEM", length = 8, nullable = false)
    @XmlElement(required = true)
    private String cepOrigem;
    
    @Column(name = "CEPDESTINO", length = 8, nullable = false)
    @XmlElement(required = true)
    private String cepDestino;
    
    @Column(name = "PRAZOENTREGA", nullable = false)
    @XmlElement(required = true)
    private String prazoEntrega;
    
    @Column(name = "VALORFRETE", nullable = false)
    @XmlElement(required = true)
    private Double valorFrete;
    
    @Column(name = "VALORCOMPRA", nullable = false)
    @XmlElement(required = true)
    private Double valorCompra;
    
    @Column(name = "VALORTOTAL", nullable = false)
    @XmlElement(required = true)
    private Double valorTotal;
    
    @Column(name = "FRETE", nullable = false)
    @XmlElement(required = true)    
    private String frete;
    
    @Column(name = "PESO", nullable = false)
    @XmlElement(required = true)    
    private String peso;
    
    @Column(name = "FORMATO", nullable = false)
    @XmlElement(required = true)            
    private Integer formato; // 1 CAIXA, 2 ROLO PRISMA; 3 ENVELOPE
    
    @Column(name = "COMPRIMENTO", nullable = false)
    @XmlElement(required = true)    
    private String comprimento;
    
    @Column(name = "ALTURA", nullable = false)
    @XmlElement(required = true)
    private String altura;
    
    @Column(name = "LARGURA", nullable = false)
    @XmlElement(required = true)
    private String largura;
    
    @Column(name = "DIAMETRO", nullable = false)
    @XmlElement(required = true)
    private String diametro;
    
    @Column(name = "MAOPROPRIA", nullable = false)
    @XmlElement(required = true)
    private String maoPropria; //serviço adicional
    
    @Column(name = "VALORDECLARADO", nullable = false)
    @XmlElement(required = true)
    private String valorDeclarado; //???
    
    @Column(name = "AVISORECEBIMENTO", nullable = false)
    @XmlElement(required = true)
    private String avisoRecebimento; // S ou N    
    
    public Pessoa(){
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }
    
    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Integer getFormato() {
        return formato;
    }

    public void setFormato(Integer formato) {
        this.formato = formato;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public String getMaoPropria() {
        return maoPropria;
    }

    public void setMaoPropria(String maoPropria) {
        this.maoPropria = maoPropria;
    }

    public String getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(String valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public String getAvisoRecebimento() {
        return avisoRecebimento;
    }

    public void setAvisoRecebimento(String avisoRecebimento) {
        this.avisoRecebimento = avisoRecebimento;
    }
    
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
