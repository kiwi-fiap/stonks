package br.com.fiap.domain.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.domain.enums.TipoProduto;

@Entity	
@Table(name="TB_PRODUTO")
@SequenceGenerator(name = "produto", initialValue = 1, sequenceName = "produto_seq")
public class Produto {
	
	@Id
	@Column(name = "id_produto")
	private int codigo;
	
	@Column(name ="nm_produto", length = 255)
	private String nome;
	
	@Column(name ="nm_fabricante ", length = 255)
	private String fabricante;
	
	@Column(name ="ds_tipo", length = 255)
	private TipoProduto tipo;
	
	@Column(name ="ds_cpu", length = 255)
	private String cpu;
	
	@Column(name ="ds_memoria", length = 255)
	private String memoria;
	
	@Column(name ="ds_hd", length = 255)
	private String hd;
	
	@Column(name ="ds_produto", length = 255)
	private String descricao;
	
	@Column(name ="dt_aquisicao")
	@Temporal(TemporalType.DATE)	
	private Calendar dataAquisicao;
	
	public Produto() {}
	
	public Produto(String nome, String fabricante, TipoProduto tipo, String cpu, String memoria, String hd,
			String descricao, Calendar dataAquisicao) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.cpu = cpu;
		this.memoria = memoria;
		this.hd = hd;
		this.descricao = descricao;
		this.dataAquisicao = dataAquisicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
