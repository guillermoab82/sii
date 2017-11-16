package mx.unam.sii.hibernate;

import org.hibernate.Session;

public interface IBaseHibernateDAO {
	public Session getSession();
}
