package mx.unam.sii.action;

import java.util.List;

import org.apache.log4j.Logger;

import mx.unam.sii.pojo.Login;
import mx.unam.sii.action.MostrarFormasAction;
import mx.unam.sii.hibernate.Profesores;
import mx.unam.sii.hibernate.ProfesoresDAO;

public class MostrarFormasAction {
	private static final Logger logger = Logger.getLogger(MostrarFormasAction.class);
	
	private Login login;
	private List<Profesores> profesores;
	private Profesores profesor;
	
	public String showLoginForm() {
		logger.info("showLoginForm()");
		
		logger.debug("Instanciando POJO para la forma login");
		login = new Login();
		
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

}
