/**
 * 
 */
package br.com.santiago.gestaoacademicaweb.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.santiago.gestaoacademicaweb.model.Docente;
import br.com.santiago.gestaoacademicaweb.service.DocenteService;

/**
 * @author Leandro Santiago
 *
 */
@Controller
public class DocenteController {

	@Autowired
	private DocenteService docenteService;

	public List<Docente> listarDocentes() {
		List<Docente> docentes = docenteService.listarDocentes();
		return docentes;
	}

	public void adicionarDocente(Docente docente) {
		docenteService.adicionarDocente(docente);
	}

	public void removerDocente(int id) {
		docenteService.removerDocente(id);
	}
}
