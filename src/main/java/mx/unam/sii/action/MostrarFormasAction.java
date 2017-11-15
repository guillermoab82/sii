package mx.unam.sii.action;

import org.apache.log4j.Logger;

import mx.unam.sii.pojo.Login;
import mx.unam.sii.action.MostrarFormasAction;

public class MostrarFormasAction {
	private static final Logger logger = Logger.getLogger(MostrarFormasAction.class);
	
	private Login login;
	
	public String showLoginForm() {
		logger.info("showLoginForm()");
		
		logger.debug("Instanciando POJO para la forma login");
		login = new Login();
		
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

}
