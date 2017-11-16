package mx.unam.sii.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import mx.unam.sii.pojo.Login;

public class UsuarioDAO extends BaseHibernateDAO{
	public Usuario login(Login login) {
		Criteria criteria = getSession().createCriteria(Usuario.class)
				.add( Restrictions.eq("cusr", login.getUsr()) )
				.add( Restrictions.eq("cpwd", login.getPassword()) );
		return (Usuario) criteria.uniqueResult();
	}
	
	public void saveUsuario(Usuario usuario) {
		super.saveOrUpdate(usuario);
	}
}
