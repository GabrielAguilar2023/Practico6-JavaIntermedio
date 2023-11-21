package jpa.clases.modelo;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter

@Entity
@Table(name="Especialidades")
public class Especialidad {
@Id	@GeneratedValue(strategy= GenerationType.IDENTITY) // hace al id autoincremental y unico
int idEspecialidad;
@Column(name="Descripcion",length = 45, nullable = false)
String descripcion;
}

