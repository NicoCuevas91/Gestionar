package domainapp.dominio.core;


import java.util.Date;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberGroupLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;
import domainapp.dominio.auxiliares.Categoria;
import domainapp.dominio.auxiliares.Cuota;
import domainapp.dominio.auxiliares.Disciplina;
import domainapp.dominio.auxiliares.Documentacion;




@javax.jdo.annotations.Queries
({
 
    @javax.jdo.annotations.Query(name = "buscarPorFecha", language = "JDOQL",value = "SELECT "+ "FROM dominio.core.jugador "+ "WHERE fechaNacimiento == :fnacimiento")
})

@DomainObject(bounded=true,objectType = "JUGADOR")
@PersistenceCapable(identityType=IdentityType.DATASTORE)
@MemberGroupLayout(columnSpans={4,4,4,8},right="Padres",left="Datos Personales",middle="Parte Medica")
public class Jugador {

	private String nombre;
	private String DNI;
	private String telefono;
	private Date fechaNacimiento;
	private String escuela;
	private String lugarNacimiento;
	private String obraSocial;
	private double peso;
	private double altura;
	private boolean medicamentos;
	private String rMedicamentos;
	private boolean alergia;
	private String rAlergia;
	private Categoria categoria;
	private Documentacion documentacion;
	private Disciplina disciplina;
	private String observaciones;
	private Socio madre;
	private Socio padre;
	private Cuota cuotas;	
	
	

	@Column(allowsNull="false")
	@MemberOrder(sequence= "1",name="Datos Personales")
	@Title
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "2",name="Datos Personales")
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "3",name="Datos Personales")
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "4",name="Datos Personales")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "5",name="Datos Personales")
	public String getEscuela() {
		return escuela;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "6",name="Datos Personales")
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "7",name="Datos Personales")
	public String getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "1",name="Parte Medica")
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "2",name="Parte Medica")
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "3",name="Parte Medica")
	public boolean isMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(boolean medicamentos) {
		this.medicamentos = medicamentos;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "4",name="Parte Medica")
	public String getRMedicamentos() {
		return rMedicamentos;
	}
	public void setRMedicamentos(String rMedicamentos) {
		this.rMedicamentos = rMedicamentos;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "5",name="Parte Medica")
	public boolean isAlergia() {
		return alergia;
	}
	public void setAlergia(boolean alergia) {
		this.alergia = alergia;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "6-",name="Parte Medica")
	public String getRAlergia() {
		return rAlergia;
	}
	public void setRAlergia(String rAlergia) {
		this.rAlergia = rAlergia;
	}
	@Column(allowsNull="false")
	@MemberOrder(sequence= "8",name="Datos Personales")
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "9",name="Datos Personales")
	public Documentacion getDocumentacion() {
		return documentacion;
	}
	public void setDocumentacion(Documentacion documentacion) {
		this.documentacion = documentacion;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "9",name="Datos Personales")
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "9",name="Datos Personales")
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "1",name="Padres")
	public Socio getMadre() {
		return madre;
	}
	public void setMadre(Socio madre) {
		this.madre = madre;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "2",name="Padres")
	public Socio getPadre() {
		return padre;
	}
	public void setPadre(Socio padre) {
		this.padre = padre;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "10", name="Cuotas")
	
	public Cuota getCuotas() 
	{

		return cuotas;
	}
	
	public void setCuotas(Cuota cuotas) {
		this.cuotas = cuotas;
	}
	
	
	//Socios
	//Seguro Federacion

	
	
	
}
