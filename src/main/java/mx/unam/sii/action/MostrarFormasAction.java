package mx.unam.sii.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import mx.unam.sii.pojo.Login;
import mx.unam.sii.action.MostrarFormasAction;
import mx.unam.sii.hibernate.Cursos;
import mx.unam.sii.hibernate.CursosDAO;
import mx.unam.sii.hibernate.Profesores;
import mx.unam.sii.hibernate.ProfesoresDAO;

public class MostrarFormasAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(MostrarFormasAction.class);
	
	private Login login;
	private List<Profesores> profesores;
	private Profesores profesor;
	private List<Cursos> cursos;
	
	public String showLoginForm() {
		logger.info("showLoginForm()");
		
		logger.debug("Instanciando POJO para la forma login");
		login = new Login();
		
		return "success";
	}
	
	public String showInicio() {
		return "success";
	}
	public String showProfesorForm() {
		logger.info("showProfesorForm");
		ProfesoresDAO profesorDAO = new ProfesoresDAO();
		profesores = (List<Profesores>)(Object)profesorDAO.getAllProfesores();
		logger.info("salio de showProfesorForm");
		return "success";
	}
	
	public String showProfesorRegister() {
		logger.info("showProfesorRegister");
		profesor = new Profesores();
		return "success";
	}
	
	/*************************************
	 * 
	 * Empezamos con los métodos para eliminar
	 * profesores
	 */
	
	public String showDelProfesorForm() {
		logger.info("showDelProfesorForm");
		HttpServletRequest request = ServletActionContext.getRequest();
		int nidprofesor =  Integer.parseInt(request.getParameter("id"));
		getSession().put("idDelProfesor", nidprofesor);
		logger.info("El id es " + nidprofesor);
		ProfesoresDAO profesoresDAO = new ProfesoresDAO();
		profesor = profesoresDAO.findById(nidprofesor);
		return "success";
	}
	/**********
	 * Es el método para mostrar editar profesor
	 */
	public String showEditProfesor() {
		logger.info("showEditProfesor");
		HttpServletRequest request = ServletActionContext.getRequest();
		int nidprofesor =  Integer.parseInt(request.getParameter("id"));
		getSession().put("idDelProfesor", nidprofesor);
		logger.info("El id es " + nidprofesor);
		ProfesoresDAO profesoresDAO = new ProfesoresDAO();
		profesor = profesoresDAO.findById(nidprofesor);
		return "success";
	}
	/**
	 * COMIENZAN MÉTODOS PARA CURSOS
	 */
	//Mostrar la form
	public String showCursosForms() {
		logger.info("showCursosForms");
		CursosDAO curso = new CursosDAO();
		cursos = (List<Cursos>)(Object) curso.getAllCursos();
		logger.info("Salio de Cursos");
		return "success";
	}
	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}


	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	public List<Profesores> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesores> profesores) {
		this.profesores = profesores;
	}

	public Profesores getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesores profesor) {
		this.profesor = profesor;
	}
	
	public List<Cursos> getCursos(){
		return cursos;
	}
	public void setCursos(List<Cursos> curso) {
		this.cursos = curso;
	}

}
