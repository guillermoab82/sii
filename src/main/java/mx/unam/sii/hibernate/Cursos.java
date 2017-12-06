package mx.unam.sii.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tcursos",catalog="sii")
public class Cursos implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private int nidcurso;
	private String cnombrecurso;
	private int ncupo;
	private Set<Profesores> profesor = new HashSet<Profesores>(0);

	//Constructores
	public Cursos() {
		
	}
	public Cursos(String nombreCurso,int cupo) {
		super();
		this.cnombrecurso = nombreCurso;
		this.ncupo = cupo;
	}
	//Fin constructor
	
	@Id
	@Column(name="nIDCurso",nullable=false)
	public int getNidcurso() {
		return nidcurso;
	}

	public void setNidcurso(int nidCurso) {
		this.nidcurso = nidCurso;
	}
	
	@Column(name="cNombreCurso",nullable=false,length=20)
	public String getCnombrecurso(){
		return cnombrecurso;
	}

	public void setCnombrecurso(String cNombreCurso){
		this.cnombrecurso=cNombreCurso;
	}

	@Column(name="nCupo",nullable=false)
	public int getNcupo(){
		return ncupo;
	}

	public void setNcupo(int nCupo){
		this.ncupo=nCupo;
	}
	
	@ManyToMany(fetch = FetchType.LAZY,cascade= {CascadeType.ALL})
	@JoinTable(
			name = "tprofecursos", 
			joinColumns = { @JoinColumn(name = "nIDCursos") }, 
			inverseJoinColumns = { @JoinColumn(name = "nIDProfesores") })
	public Set<Profesores> getProfesor(){
			return this.profesor;
	}
	public void setProfesores(Set<Profesores> profesore) {
		this.profesor = profesore;
	}

}
