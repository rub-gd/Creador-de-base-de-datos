package com.ejercicio.universidad.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estudiantes")
public class Estudiante {
	@Id
    @Column(name = "dni_estudiante", length = 9, nullable = false)private String dni_estudiante;
    @Column(name = "nombre", length = 30, nullable = false)private String nombre;
    @OneToMany(mappedBy = "estudiante")private List<Matricula> matriculas;

	public Estudiante() {
	
	}

	public String getDni_estudiante() {
		return dni_estudiante;
	}

	public void setDni_estudiante(String dni_estudiante) {
		this.dni_estudiante = dni_estudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
}
