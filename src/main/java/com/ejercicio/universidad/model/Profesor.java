package com.ejercicio.universidad.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Profesores")
public class Profesor {
	@Id
	@Column(name = "dni_profesor", length = 9, nullable = false) private String dni_profesor;
	@Column(name = "nombre_profesor", length = 30, nullable = false) private String nombre_profesor;
	@ManyToOne
    @JoinColumn(name = "cod_departamento")private Departamento departamento;
    @OneToMany(mappedBy = "profesor")private List<Asignatura> asignaturas;

	public Profesor() {
	
	}

	public String getDni_profesor() {
		return dni_profesor;
	}

	public void setDni_profesor(String dni_profesor) {
		this.dni_profesor = dni_profesor;
	}

	public String getNombre_profesor() {
		return nombre_profesor;
	}

	public void setNombre_profesor(String nombre_profesor) {
		this.nombre_profesor = nombre_profesor;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
}