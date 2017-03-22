package domainapp.servicio;

import java.util.List;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.apache.isis.applib.query.QueryDefault;
import domainapp.dominio.auxiliares.Categoria;
import domainapp.dominio.core.Jugador;
import domainapp.dominio.core.Socio;




@DomainService
@DomainServiceLayout(menuOrder = "2", named= "Consultas")
public class Consultas 
{
	
	public Jugador buscarJugador(@ParameterLayout(named="Jugador")final Jugador a){
		return a;
	}
	
	public List<Jugador> buscarJugadoresPorCategoria(@ParameterLayout(named="Categoria")final Categoria a){
		
		
		return container.allMatches(new QueryDefault<>(Jugador.class,"buscarPorCategoria","categoria", a));
	}
	
	public boolean hideBuscarJugador(@ParameterLayout(named="Jugador")final Jugador a){
		boolean bandera = true;
		if (a == null){
			bandera = false;
		}
		return bandera;
	}
	
	public Socio buscarSocio(@ParameterLayout(named="Socio")final Socio a){
		return a;
	}
	public boolean hideBuscarSocio(@ParameterLayout(named="Socio")final Socio a){
		boolean bandera = true;
		if (a == null){
			bandera = false;
		}
		return bandera;
	}
	
	public List<Jugador> listarJugadores(){
		return container.allInstances(Jugador.class);
	}
	public List<Socio> listarSocios(){
		return container.allInstances(Socio.class);
	}
	
	  @javax.inject.Inject 
	    DomainObjectContainer container;
}
