package mx.unam.sii.action;

import java.io.Serializable;

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
	//Función para eliminar profesores del boton eliminar
	public String delProfesor() {
		logger.info("delProfesor");
		int nidprofesor =  Integer.parseInt(getSession().get("idDelProfesor").toString());
		logger.info("Se asigno id="+ nidprofesor);
		ProfesoresDAO profesorDAO = new ProfesoresDAO();
		profesorDAO.delProfesores(nidprofesor);
		logger.info("Se eliminó el profe" + nidprofesor);
		return "success";
	}
	//Función del boton cancelar
	public String cancelDelProfesor() {
		return "success";
	}
	public Profesores getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesores profesor) {
		this.profesor = profesor;
	}

}
