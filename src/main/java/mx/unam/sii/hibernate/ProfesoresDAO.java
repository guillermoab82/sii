package mx.unam.sii.hibernate;

import java.util.List;

public class ProfesoresDAO extends BaseHibernateDAO {
	public List<Object> getAllProfesores(){
		return findAll(Profesores.class);
	}
	
	public void saveProfesor(Profesores profesor) {
		super.save(profesor);
	}
}
