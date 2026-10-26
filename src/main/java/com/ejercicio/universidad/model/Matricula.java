package com.ejercicio.universidad.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Matriculas")
public class Matricula {
	@Id
	@Column(name = "id_matricula")private Integer id_matricula;
	@ManyToOne
    @JoinColumn(name = "dni_estudiante", nullable = false)private Estudiante estudiante;
	@ManyToOne
	@JoinColumn(name = "cod_asignatura", nullable = false)private Asignatura asignatura;
	@Column(name = "fecha_matriculacion", nullable = false) private LocalDate fecha_matriculacion;
	@Column(name = "nota_final", nullable = false) private Integer nota_final;
	
	public Matricula() {
	
	}

	public Integer getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(Integer id_matricula) {
		this.id_matricula = id_matricula;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public LocalDate getFecha_matriculacion() {
		return fecha_matriculacion;
	}

	public void setFecha_matriculacion(LocalDate fecha_matriculacion) {
		this.fecha_matriculacion = fecha_matriculacion;
	}

	public Integer getNota_final() {
		return nota_final;
	}

	public void setNota_final(Integer nota_final) {
		this.nota_final = nota_final;
	}
}