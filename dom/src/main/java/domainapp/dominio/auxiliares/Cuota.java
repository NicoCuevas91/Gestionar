package domainapp.dominio.auxiliares;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberOrder;


@PersistenceCapable(identityType=IdentityType.DATASTORE)
@DomainObject
public class Cuota {


	private double enero=0;
	private double febrero=0;
	private double marzo=0;
	private double abril=0;
	private double mayo=0;
	private double junio=0;
	private double julio=0;
	private double agosto=0;
	private double septiembre=0;
	private double octubre=0;
	private double noviembre=0;
	private double diciembre=0;
	

	@Column(allowsNull="true")
	@MemberOrder(sequence= "1",name="Cuota")
	public double getEnero() {
		return enero;
	}
	public void setEnero(double enero) {
		this.enero = enero;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "2",name="Cuota")
	public double getFebrero() {
		return febrero;
	}
	public void setFebrero(double febrero) {
		this.febrero = febrero;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "3",name="Cuota")
	public double getMarzo() {
		return marzo;
	}
	public void setMarzo(double marzo) {
		this.marzo = marzo;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "4",name="Cuota")
	public double getAbril() {
		return abril;
	}
	public void setAbril(double abril) {
		this.abril = abril;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "5",name="Cuota")
	public double getMayo() {
		return mayo;
	}
	public void setMayo(double mayo) {
		this.mayo = mayo;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "6",name="Cuota")
	public double getJunio() {
		return junio;
	}
	public void setJunio(double junio) {
		this.junio = junio;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "7",name="Cuota")
	public double getJulio() {
		return julio;
	}
	public void setJulio(double julio) {
		this.julio = julio;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "8",name="Cuota")
	public double getAgosto() {
		return agosto;
	}
	public void setAgosto(double agosto) {
		this.agosto = agosto;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "9",name="Cuota")
	public double getSeptiembre() {
		return septiembre;
	}
	public void setSeptiembre(double septiembre) {
		this.septiembre = septiembre;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "10",name="Cuota")
	public double getOctubre() {
		return octubre;
	}
	public void setOctubre(double octubre) {
		this.octubre = octubre;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "11",name="Cuota")
	public double getNoviembre() {
		return noviembre;
	}
	public void setNoviembre(double noviembre) {
		this.noviembre = noviembre;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "12",name="Cuota")
	public double getDiciembre() {
		return diciembre;
	}
	public void setDiciembre(double diciembre) {
		this.diciembre = diciembre;
	}
	
	
}
