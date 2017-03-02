package domainapp.servicio;

import java.util.List;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;

import domainapp.dominio.core.Jugador;



@DomainService
@DomainServiceLayout(menuOrder = "2", named= "Consultas")
public class Consultas 
{
	public List<Jugador> listarJugadores(){
		return container.allInstances(Jugador.class);
	}
	
	  @javax.inject.Inject 
	    DomainObjectContainer container;
}
