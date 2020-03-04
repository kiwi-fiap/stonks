package br.com.fiap.domain.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.domain.enums.Cargo;
import br.com.fiap.domain.enums.Setor;

@Entity
@Table(name ="TB_COLABORADOR")
public class Colaborador {

	@Id
	@Column(name ="id_codigo")
	private int id;
	
	@Column(name="nm_nome", nullable = false, length = 255)
	private String nome;
	
	@Column(name ="dt_nasc", nullable = false, length = 255)
	@Temporal(TemporalType.DATE)
	private Calendar dataNasc;
	
	@Column(name="cd_registro", nullable = false)
	private int registro; 
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_cargo")
	private Cargo cargo;
	
	@Column(name = "ds_setor", nullable = false)
	private Setor setor;
	
	
	public Colaborador() {}

	public Colaborador(int id, String nome, Calendar dataNasc, int registro, Cargo cargo, Setor setor) {
		
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.registro = registro;
		this.cargo = cargo;
		this.setor = setor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}	
}
