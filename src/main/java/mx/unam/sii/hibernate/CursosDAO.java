package mx.unam.sii.hibernate;

import java.util.List;

public class CursosDAO extends BaseHibernateDAO {
	public List<Object> getAllCursos(){
		return findAll(Cursos.class);
	}
}
