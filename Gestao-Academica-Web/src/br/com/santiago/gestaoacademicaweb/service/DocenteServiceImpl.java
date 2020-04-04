package br.com.santiago.gestaoacademicaweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.santiago.gestaoacademicaweb.dao.DocenteDAO;
import br.com.santiago.gestaoacademicaweb.model.Docente;

@Service
public class DocenteServiceImpl implements DocenteService {
	
	@Autowired
    private DocenteDAO docenteDAO;

	 @Transactional
	public void adicionarDocente(Docente docente) {
		docenteDAO.adicionarDocente(docente);

	}

	 @Transactional
	public void removerDocente(int id) {
		docenteDAO.removerDocente(id);

	}

	 @Transactional
	public List<Docente> listarDocentes() {
		return docenteDAO.listarDocentes();
	}

}
