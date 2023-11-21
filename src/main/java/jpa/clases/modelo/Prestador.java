package jpa.clases.modelo;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Table (name="Prestadores")
public class Prestador {
	@ManyToOne
	@JoinColumn(name="idPersona",nullable = false)
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name="idEspecialidad",nullable = false)
	private Especialidad especialidad;
	
	@OneToMany(mappedBy = "idFotoDeTrabajo")
	private List<FotoDeTrabajo> fotosDeTrabajos;

	@Id	@GeneratedValue(strategy= GenerationType.IDENTITY) // hace al id autoincremental y unico
	private int idPrestador;
	@Column(name="Disponibilidad",length = 50)
	private String disponibilidad;
	@Column(name="HorarioInicio",length = 50)
	private String horarioInicio;
	@Column(name="HorarioFin",length = 50)
	private String horarioFinal;
	@Column(name="Posicion",length = 50)
	private String posicion;
	@Column(name="RadioDeCobertura",length = 5)
	private float radioCobertura;
	@Column(name="DescripcionExp",length = 255)
	private String descripcionExp;
	@Column(name="Calificacion",length = 1)
	private int calificacion;
	

}