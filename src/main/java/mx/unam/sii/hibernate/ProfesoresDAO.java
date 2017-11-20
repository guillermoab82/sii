package mx.unam.sii.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


public class ProfesoresDAO extends BaseHibernateDAO {
	public List<Object> getAllProfesores(){
		return findAll(Profesores.class);
	}
	
	public void saveProfesor(Profesores profesor) {
		super.save(profesor);
	}
	
	public Profesores findById(int id) {
		Criteria criteria = getSession().createCriteria(Profesores.class)
			.add( Restrictions.eq("nidprofesor", id));
		return (Profesores) criteria.uniqueResult();
	}
	//Agregado para eliminar profesores
	public void delProfesores(int id) {
		super.delqry(id);
	}
	//Función para modificar profesores
	public void editProfesor(Profesores profesor) {
		super.saveOrUpdate(profesor);
	}
}
