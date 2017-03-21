package domainapp.servicio.jugador;

import javax.inject.Inject;
import javax.swing.JOptionPane;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;

import domainapp.dominio.core.Jugador;



@DomainService
public class ServicioJugador {

	public String eliminarJugador(Jugador a){
		JOptionPane confirmacion = new JOptionPane();
		String mej = "No se ah eliminado el jugador";
				
		@SuppressWarnings("static-access")
		int respuesta =
		confirmacion.showConfirmDialog(null, "¿Esta seguro de que desea eliminar a "+ a.getNombre()+" ?");	
		if(respuesta == 0){
		mej = "Jugador Eliminado";
		container.remove(a);
		}
		return mej;
	}
	public boolean hideEliminarJugador(Jugador a){
		boolean bandera = false;
		if (a == null){
			bandera = true;
		}
		return bandera;
	}
	@Inject
    DomainObjectContainer container;
}
