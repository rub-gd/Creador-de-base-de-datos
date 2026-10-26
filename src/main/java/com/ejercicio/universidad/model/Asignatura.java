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
@Table(name = "Asignaturas")
public class Asignatura {
	@Id
	@Column(name = "cod_asignatura", length = 20, nullable = false) private String cod_asignatura;
	@Column(name = "nombre_asignatura", length = 30, nullable = false) private String nombre_asignatura;
    @ManyToOne
    @JoinColumn(name = "dni_profesor")private Profesor profesor;
    @OneToMany(mappedBy = "asignatura")private List<Matricula> matriculas;

	public Asignatura() {
	
	}

	public String getCod_asignatura() {
		return cod_asignatura;
	}

	public void setCod_asignatura(String cod_asignatura) {
		this.cod_asignatura = cod_asignatura;
	}

	public String getNombre_asignatura() {
		return nombre_asignatura;
	}

	public void setNombre_asignatura(String nombre_asignatura) {
		this.nombre_asignatura = nombre_asignatura;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
}