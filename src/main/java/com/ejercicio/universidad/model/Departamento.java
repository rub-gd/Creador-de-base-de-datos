package com.ejercicio.universidad.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Departamentos")
public class Departamento {
	@Id
	@Column(name = "cod_departamento", length = 20, nullable = false) private String cod_departamento;
	@Column(name = "nombre_departamento", length = 30, nullable = false) private String nombre_departamento;
	@OneToMany(mappedBy = "departamento")private List<Profesor> profesores;

	public Departamento() {
	
	}

	public String getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(String cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
}
