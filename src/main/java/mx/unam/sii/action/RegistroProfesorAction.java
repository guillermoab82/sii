package mx.unam.sii.action;

import org.apache.log4j.Logger;

import mx.unam.sii.hibernate.Profesores;
import mx.unam.sii.hibernate.ProfesoresDAO;

public class RegistroProfesorAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(RegistroProfesorAction.class);
	private Profesores profesor;
	 
	public String registroProfesor() {
		logger.info("registroProfesor");
		ProfesoresDAO profesoresDAO = new ProfesoresDAO();
		profesoresDAO.saveProfesor(profesor);
		logger.info("Salimos de registroProfesor");
		return "success";
	}
	 
	public Profesores getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesores profesor) {
		this.profesor = profesor;
	}

}
