package br.com.santiago.gestaoacademicaweb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santiago.gestaoacademicaweb.model.Docente;

@Service
public class DocenteDAOImpl implements DocenteDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void adicionarDocente(Docente docente) {
		sessionFactory.getCurrentSession().save(docente);

	}

	public void removerDocente(int id) {
		Docente docente = (Docente) sessionFactory.getCurrentSession().load(Docente.class, id);
        if (null != docente) {
            sessionFactory.getCurrentSession().delete(docente);
        } 

	}

	@SuppressWarnings("unchecked")
	public List<Docente> listarDocentes() {
		return sessionFactory.getCurrentSession().createQuery("from Docente").list();
	}

}
