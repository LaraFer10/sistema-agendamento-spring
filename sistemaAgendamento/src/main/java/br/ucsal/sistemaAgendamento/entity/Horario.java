package br.ucsal.sistemaAgendamento.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dia_da_semana;
	private String hora;
	private Long agenda_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDia_da_semana() {
		return dia_da_semana;
	}
	public void setDia_da_semana(String dia_da_semana) {
		this.dia_da_semana = dia_da_semana;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Long getAgenda_id() {
		return agenda_id;
	}
	public void setAgenda_id(Long agenda_id) {
		this.agenda_id = agenda_id;
	}
	
	
}
