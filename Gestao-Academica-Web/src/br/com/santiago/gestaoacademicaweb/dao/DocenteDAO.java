package br.com.santiago.gestaoacademicaweb.dao;

import java.util.List;

import br.com.santiago.gestaoacademicaweb.model.Docente;

public interface DocenteDAO {

	public void adicionarDocente(Docente docente);

	public void removerDocente(int id);

	public List<Docente> listarDocentes();
}
