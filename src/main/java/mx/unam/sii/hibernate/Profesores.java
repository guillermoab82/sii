package mx.unam.sii.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="tprofesores",catalog="sii")
public class Profesores implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private int nidprofesor;
	private String cnombre;
	private String capp;
	private String capm;
	private String cdireccion;
	private String ctelefono;
	
	//Constructores
	public Profesores() {
		
	}
	public Profesores(String Nombre,String APP) {
		super();
		this.cnombre = Nombre;
		this.capp = APP;
	}
	public Profesores(String Nombre,String APP,String APM,String Direccion,String Telefono) {
		super();
		this.cnombre = Nombre;
		this.capp = APP;
		this.capm = APM;
		this.cdireccion = Direccion;
		this.ctelefono = Telefono;
	}
	//Fin de constructores
	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@Column(name="nIDProfesor",nullable=false)
	public int getNidprofesor() {
		return nidprofesor;
	}
	public void setNidprofesor(int id) {
		this.nidprofesor = id;
	}	

	@Column(name = "cNombre", nullable = false, length = 60)
	public String getCnombre(){
		return cnombre;
	}

	public void setCnombre(String cNombre){
		this.cnombre=cNombre;
	}

	@Column(name = "cAPP", nullable = false, length = 30)
	public String getCapp(){
		return capp;
	}

	public void setCapp(String cAPP){
		this.capp=cAPP;
	}

	@Column(name = "cAPM", nullable = true, length = 30)
	public String getCapm(){
		return capm;
	}

	public void setCapm(String cAPM){
		this.capm=cAPM;
	}

	@Column(name = "cDireccion", nullable = true, length = 255)
	public String getCdireccion(){
		return cdireccion;
	}

	public void setCdireccion(String cDireccion){
		this.cdireccion=cDireccion;
	}

	@Column(name = "cTelefono", nullable = true, length = 20)
	public String getCtelefono(){
		return ctelefono;
	}

	public void setCtelefono(String cTelefono){
		this.ctelefono=cTelefono;
	}
	
	@Transient
	public String getNombreCompleto() {
		return new StringBuffer().append( cnombre ).append(" ")
				.append( capp ).append(
							( capm != null ) ? " " + capm : ""
						).toString();
	}
}
