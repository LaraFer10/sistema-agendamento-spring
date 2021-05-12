package br.ucsal.sistemaAgendamento.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String data;
	private String hora;
	private Boolean retorno;
	private Boolean cancelada;
	private Long paciente_id;
	private Long agenda_id;
	
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Boolean getRetorno() {
		return retorno;
	}
	public void setRetorno(Boolean retorno) {
		this.retorno = retorno;
	}
	public Boolean getCancelada() {
		return cancelada;
	}
	public void setCancelada(Boolean cancelada) {
		this.cancelada = cancelada;
	}
	public Long getPaciente_id() {
		return paciente_id;
	}
	public void setPaciente_id(Long paciente_id) {
		this.paciente_id = paciente_id;
	}
	public Long getAgenda_id() {
		return agenda_id;
	}
	public void setAgenda_id(Long agenda_id) {
		this.agenda_id = agenda_id;
	}
	
	
}
