package jpa.clases.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="FotosDeTrabajos")
public class FotoDeTrabajo {
	
	@ManyToOne
	@JoinColumn(name="idPrestador")
	private Prestador prestador;
	
	@Id	@GeneratedValue(strategy= GenerationType.IDENTITY) // hace al id autoincremental y unico
	private int idFotoDeTrabajo;
	@Column(name="Descripcion",length = 100)
	private String descripcion;
	
}
