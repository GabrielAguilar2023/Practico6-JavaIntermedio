package jpa.clases.modelo;

import java.util.Date;
import jakarta.persistence.*;

@Entity 
@Table(name="Servicios")
public class Servicio {
	@ManyToOne
	@JoinColumn(name = "idConsumidor", nullable = false)
	private Consumidor consumidor;
	
	@ManyToOne
	@JoinColumn(name="idPrestador", nullable = false)
	private Prestador prestador;
	
	@Id	@GeneratedValue(strategy= GenerationType.IDENTITY) // hace al id autoincremental y unico
	private int idServicio;
	@Temporal(TemporalType.DATE)
	@Column(name="Fecha")
	private Date fecha;
	@Column(name="HoraInicio",length = 45)
	private String horaInicio;
	@Column(name="HoraFin",length = 45)
	private String horaFin;
	@Column(name="Lugar",length = 45)
	private String Lugar;
	@Column(name="Tareas",length = 255)
	private String tareas;
	@Column(name="Precio",length = 8)
	private long precio;
	@Column(name="ServAcept",length = 1)
	private boolean servAcept;
	@Column(name="TrabajoFinConsum",length = 1)
	private boolean trabajoFinConsum;
	@Column(name="TrabajoFinPrestador",length = 1)
	private boolean trabajoFinPrestador;
}