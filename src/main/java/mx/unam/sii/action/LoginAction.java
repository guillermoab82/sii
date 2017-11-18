package mx.unam.sii.action;

import org.apache.log4j.Logger;

import mx.unam.sii.action.LoginAction;
import mx.unam.sii.hibernate.Usuario;
import mx.unam.sii.hibernate.UsuarioDAO;
//import mx.unam.sii.hibernate.Usuario;
//import mx.unam.sii.hibernate.UsuarioDAO;
import mx.unam.sii.pojo.Login;

public class LoginAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(LoginAction.class);
	private Login login;
	
	public String loginUsuario() {
		logger.info("loginUsuario()");
		
		logger.info("Información recibida: " + login.toString());
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.login(login);
		try {
			if( usuario == null ){ // usuario no encontrado
				addActionError("Usuario y/o contraseña inválidos");
				return "not-found";
			}
			getSession().put("nombreCompleto", usuario.getNombreCompleto());
			getSession().put("tipoUsr", usuario.getNidtipousr());
		}catch(Exception e) {
			addActionError(e.getMessage());
			return "error";
		}
		
		logger.info("Usuario encontrado: " + usuario);
		return "success";
	}
	
	public String logoutUsuario() {
		logger.info("Cerrando sesión de usuario");
		cerrarrSesion();
		addActionMessage("Su sesión ha sido cerrada");
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
