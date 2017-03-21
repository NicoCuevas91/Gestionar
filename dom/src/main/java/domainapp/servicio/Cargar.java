package domainapp.servicio;

import java.util.Date;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.ParameterLayout;
import domainapp.dominio.auxiliares.Categoria;
import domainapp.dominio.auxiliares.Cuota;
import domainapp.dominio.auxiliares.Disciplina;
import domainapp.dominio.auxiliares.Documentacion;
import domainapp.dominio.core.Jugador;
import domainapp.dominio.core.Socio;



@DomainService
@DomainServiceLayout(menuOrder = "1", named= "Carga de datos")
public class Cargar {

	
    @MemberOrder(sequence = "1")
	public Jugador CargarJugador
	(
			 @ParameterLayout(named="Nombre y Apellido")final String nombre,
			 @ParameterLayout(named="DNI")final String DNI,
			 @ParameterLayout(named="Telefono")final String telefono,
			 @ParameterLayout(named="Fecha de Nacimiento")final Date fecha,
			 @ParameterLayout(named="Escuela - Turno")final String escuela,
			 @ParameterLayout(named="Lugar de Nacimiento")final String lugar,
			 @ParameterLayout(named="Obra Social")final String obraSocial,
			 @ParameterLayout(named="Peso")final double peso,
			 @ParameterLayout(named="Altura")final double altura,
			 @ParameterLayout(named="Medicamentos?")final boolean medicamentos,
			 @ParameterLayout(named="Especifique")final String rmedicamentos,
			 @ParameterLayout(named="Alergia?")final boolean alergia,
			 @ParameterLayout(named="Especifique")final String ralergia,
			 @ParameterLayout(named="Categoria")final Categoria categoria,			
			 @ParameterLayout(named="Disciplina")final Disciplina disciplina,
			 @ParameterLayout(named="Observaciones")final String obs
	)
	{			
    	final Jugador j= container.newTransientInstance(Jugador.class);
    	j.setAlergia(alergia);
    	j.setRAlergia(ralergia);
    	j.setNombre(nombre);
    	j.setAltura(altura);
    	j.setPeso(peso);
    	j.setEscuela(escuela);
    	j.setCategoria(categoria);
    	j.setDNI(DNI);
    	j.setMedicamentos(medicamentos);
    	j.setRMedicamentos(rmedicamentos);
    	j.setDisciplina(disciplina);
    	j.setObservaciones(obs);
    	j.setObraSocial(obraSocial);
    	j.setTelefono(telefono);
    	j.setLugarNacimiento(lugar);
    	j.setFechaNacimiento(fecha);
    	j.setPadre(null);
    	j.setMadre(null);
    	j.setDocumentacion(new Documentacion());
    	j.setCuotas(new Cuota());
    	
    	container.persistIfNotAlready(j);

    	
    	return j;
	}  	
    
    public Socio CargarSocio
    (
    		@ParameterLayout(named="Nombre y Apellido")final String nombre,
			 @ParameterLayout(named="DNI")final String DNI,
			 @ParameterLayout(named="Telefono")final String telefono,
			 @ParameterLayout(named="Mail")final String mail,
			 @ParameterLayout(named="Direccion")final String direccion,
			 @ParameterLayout(named="Socio")final boolean socio
	)
    {
    	final Socio s= container.newTransientInstance(Socio.class);
    	s.setNombre(nombre);
    	s.setDNI(DNI);
    	s.setDireccion(direccion);
    	s.setMail(mail);
    	s.setTelefono(telefono);
    	s.setSocio(socio);
    	s.setCuotaActividad(new Cuota());
    	s.setCuotaSocial(new Cuota());
    	container.persistIfNotAlready(s);
    	
    	return s;
    }
    
    
    
    
	   @javax.inject.Inject 
	    DomainObjectContainer container;
}
