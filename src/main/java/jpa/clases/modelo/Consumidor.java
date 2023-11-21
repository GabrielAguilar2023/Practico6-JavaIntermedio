package jpa.clases.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="Consumidores")
public class Consumidor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsumidor;
	@Column(name = "Nombre",length = 45, nullable = false)
	private String nombre;
	@Column(name = "Apellido",length = 45)
	private String Apellido;
	@Column(name = "Telefono",length = 45)
	private String telefono;
	@Column(name = "eMail",length = 45)
	private String eMail;
}