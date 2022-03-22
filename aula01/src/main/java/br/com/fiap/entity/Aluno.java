package br.com.fiap.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;

@Table(name="tb_aluno")
@Entity
@SequenceGenerator(name="aluno", sequenceName = "SQ_TB_ALUNO", allocationSize=1)
public class Aluno {
	//variaveis
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aluno")
	public Long id;
	
	@Column(name="nm_aluno", length=80)
	public String nome;
	
	@Column(name="nr_matricula", length=10, unique=true)
	public String matricula;
	
	@Column(name="nr_cpf", length=14, unique=true)
	public String cpf;
	
	@Column(name="dt_nascimento", nullable=false)
	public LocalDate dataNascimento;
	
	@Column(name="st_ativo")
	public boolean ativo;
	
	@Column(name="dt_cadastro")
	public LocalDateTime dataCadastro;
	
	@Column(name="dt_atualizacao")
	public LocalDateTime dataAtualizacao;
	
	@Override
	public String toString() {
		
		return "Matricula" + getMatricula() +
				"\nCPF" + getCpf() +
				"\nNome" + getNome() +
				"\nData Nascimento" + getDataNascimento() 
						.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+
				"\nData Cadastro" + getDataCadastro() +
				"\nData Atualizacao" + getDataAtualizacao();
	};
	

	//constructor
//	public Aluno(Long id, String nome, String matricula, String cpf, LocalDate dataNascimento, boolean ativo,
//			LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
//		super();
//		this.id = id;
//		this.nome = nome;
//		this.matricula = matricula;
//		this.cpf = cpf;
//		this.dataNascimento = dataNascimento;
//		this.ativo = ativo;
//		this.dataCadastro = dataCadastro;
//		this.dataAtualizacao = dataAtualizacao;
//	}
	
	public Aluno() {super();}
	
	//Getters / Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	
	
	
	
}
