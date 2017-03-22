package domainapp.servicio;

import java.util.List;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.query.QueryDefault;
import domainapp.dominio.auxiliares.ConfigCategoria;
import domainapp.dominio.auxiliares.Cuota;
import domainapp.dominio.core.Jugador;

@DomainService
@DomainServiceLayout(menuOrder = "3", named= "Consultas")
public class Configuracion {

	public String ConfigurarValorDeCuotas(ConfigCategoria a, double b){
		List<Jugador> aux;
		
		if (a == ConfigCategoria.Todos){
			aux = container.allInstances(Jugador.class);
		}
		else{
			aux = container.allMatches(new QueryDefault<>(Jugador.class,"buscarPorCategoria","categoria", a));
		}
		modificarCuotas(aux, b);		
		return "Valor de cuotas modificada";
	}
	
	
	
	private void modificarCuotas(List<Jugador> a, double b){
		Cuota auxCuota;
		for (Jugador aux:a){
			auxCuota = aux.getCuotas();
			if(auxCuota.getEnero() != -1)
				auxCuota.setFebrero(b);
			if(auxCuota.getEnero() != -1)
				auxCuota.setFebrero(b);
			if(auxCuota.getMarzo() != -1)
				auxCuota.setMarzo(b);
			if(auxCuota.getAbril() != -1)
				auxCuota.setAbril(b);
			if(auxCuota.getMayo() != -1)
				auxCuota.setMayo(b);
			if(auxCuota.getJunio() != -1)
				auxCuota.setJunio(b);
			if(auxCuota.getJulio() != -1)
				auxCuota.setJulio(b);
			if(auxCuota.getAgosto() != -1)
				auxCuota.setAgosto(b);
			if(auxCuota.getSeptiembre() != -1)
				auxCuota.setSeptiembre(b);
			if(auxCuota.getOctubre() != -1)
				auxCuota.setOctubre(b);
			if(auxCuota.getNoviembre() != -1)
				auxCuota.setNoviembre(b);
			if(auxCuota.getDiciembre() != -1)
				auxCuota.setDiciembre(b);
		}
	}
	
	
	  @javax.inject.Inject 
	    DomainObjectContainer container;
}
