package mx.unam.sii.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="tusuarios",catalog="sii")
public class Usuario implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private int nid;
	private String cnombre;
	private String capp;
	private String capm;
	private String cdireccion;
	private String ctelefono;
	private String cusr;
	private String cpwd;
	private int nidtipousr;

	public Usuario() {}
	
	public Usuario(String Nombre,String APP,String USR,String PWD) {
		super();
		this.cnombre = Nombre;
		this.capp = APP;
		this.cusr = USR;
		this.cpwd = PWD;
	}
	
	public Usuario(String Nombre,String APP,String APM,String Direccion,String Telefono,String USR,String PWD,int TipoUSR) {
		super();
		this.cnombre = Nombre;
		this.capp = APP;
		this.capm = APM;
		this.cdireccion = Direccion;
		this.ctelefono = Telefono;
		this.cusr = USR;
		this.cpwd = PWD;
		this.nidtipousr = TipoUSR;
	}
	
	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@Column(name="nID",nullable=false)
	public int getNid() {
		return nid;
	}
	public void setNid(int id) {
		this.nid = id;
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

	@Column(name = "cUSR", nullable = false, length = 16)
	public String getCusr(){
		return cusr;
	}

	public void setCusr(String cUSR){
		this.cusr=cUSR;
	}

	@Column(name = "cPWD", nullable = false, length = 16)
	public String getCpwd(){
		return cpwd;
	}

	public void setCpwd(String cPWD){
		this.cpwd=cPWD;
	}
	
	@Column(name = "nIDTipoUSR", nullable = false, length = 6)
	public int getNidtipousr(){
		return nidtipousr;
	}

	public void setNidtipousr(int TipoUSR){
		this.nidtipousr=TipoUSR;
	}
	@Transient
	public String getNombreCompleto() {
		return new StringBuffer().append( cnombre ).append(" ")
				.append( capp ).append(
							( capm != null ) ? " " + capm : ""
						).toString();
	}
}

