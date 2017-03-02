package domainapp.dominio.auxiliares;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.MemberOrder;

@PersistenceCapable(identityType=IdentityType.DATASTORE)
public class Documentacion {
	private boolean certificadoMedico;
	private boolean hojaPlanilla;
	
	
	@Column(allowsNull="flase")
	@MemberOrder(sequence= "1",name="Documentacion")
	public boolean isCertificadoMedico() {
		return certificadoMedico;
	}
	public void setCertificadoMedico(boolean certificadoMedico) {
		this.certificadoMedico = certificadoMedico;
	}
	
	@Column(allowsNull="false")
	@MemberOrder(sequence= "2",name="Documentacion")
	public boolean isHojaPlanilla() {
		return hojaPlanilla;
	}
	public void setHojaPlanilla(boolean hojaPlanilla) {
		this.hojaPlanilla = hojaPlanilla;
	}
	
	
}
