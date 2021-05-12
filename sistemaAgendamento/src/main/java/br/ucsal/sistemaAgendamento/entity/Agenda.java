package br.ucsal.sistemaAgendamento.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long medico_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMedico_id() {
		return medico_id;
	}
	public void setMedico_id(Long medico_id) {
		this.medico_id = medico_id;
	}
	
	
}
