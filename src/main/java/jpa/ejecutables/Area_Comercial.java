package jpa.ejecutables;

import java.util.Calendar;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.clases.modelo.Persona;

public class Area_Comercial {

	public static void main(String[] args) {
		
		System.out.println("Funcionalidad desde Area Comercial");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		org.hibernate.Session sesion = sf.openSession();
		
// Inicia una transaccion
		sesion.getTransaction().begin();
		
// Obtenemos el Calendar con el que gestionaremos las fechas
		Calendar calendar = Calendar.getInstance();
		
// Construimos un objeto del tipo cliente
		Persona persona1= new Persona();
		persona1.setNombre("Jorge");
		calendar.set(1982,(9-1),18);
		persona1.setFechaNacimiento(calendar.getTime());
		
// Construimos otro objeto del tipo cliente
		Persona persona2= new Persona();
		persona2.setNombre("Carlos");
		calendar.set(1990,(5-1),20);
		persona2.setFechaNacimiento(calendar.getTime());
		
// Persistimos los objetos
		sesion.persist(persona1);
		sesion.persist(persona2);
		
// Commiteamos la transaccion
		sesion.getTransaction().commit();
		
// Cerramos todos los objetos
		sesion.close();
		sf.close();
		
	}
}
