package domainapp.dominio.core;

import java.util.List;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberGroupLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;

import domainapp.dominio.auxiliares.Cuota;





@DomainObject(bounded=true,objectType = "SOCIO")
@PersistenceCapable(identityType=IdentityType.DATASTORE)
@MemberGroupLayout(columnSpans={4,4,4,8})
public class Socio {
	private String nombre;
	private String direccion;
	private String DNI;
	private String telefono;
	private String mail;
	private boolean socio;
	private Cuota cSocial;
	private Cuota cActividad;
	private List<Jugador> hijos;
	
	
	@Column(allowsNull="false")
	@MemberOrder(sequence= "1",name="Datos Personales")
	@Title
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "2",name="Datos Personales")
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "3",name="Datos Personales")
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "4",name="Datos Personales")
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "5",name="Datos Personales")
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "6",name="Datos Personales")
	public boolean isSocio() {
		return socio;
	}
	public void setSocio(boolean socio) {
		this.socio = socio;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "7",name="Datos Personales")
	public Cuota getCSocial() {
		return cSocial;
	}
	public void setCSocial(Cuota cSocial) {
		this.cSocial = cSocial;
	}
	public Cuota getcActividad() {
		return cActividad;
	}
	public void setcActividad(Cuota cActividad) {
		this.cActividad = cActividad;
	}
	public List<Jugador> getHijos() {
		return hijos;
	}
	public void setHijos(List<Jugador> hijos) {
		this.hijos = hijos;
	}
	
	
	
}
