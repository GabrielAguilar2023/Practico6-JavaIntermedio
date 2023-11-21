package jpa.clases.modelo;

import java.util.Date;
import lombok.*;
import jakarta.persistence.*;

@Getter @Setter
@Entity
@Table(name="Personas")
public class Persona {
	@Id	@GeneratedValue(strategy= GenerationType.IDENTITY) // hace al id autoincremental y unico
	private int idPersona;
	@Column(name="Nombre", length = 45, nullable = false)
	private String nombre;
	@Column(name="Apellido",length = 45)
	private String apellido;
	@Temporal(TemporalType.DATE)
	@Column(name="FechaNacimiento")
	private Date fechaNacimiento;
	@Column(name="TipoDocumento",length = 5)
	private String tipoDocumento;
	@Column(name="NumDocumento",length = 15)
	private String numDocumento;
	@Column(name="Telefono",length = 20)
	private String telefono;
	@Column(name="Email",length = 45)
	private String eMail;
}
