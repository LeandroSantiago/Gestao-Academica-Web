package br.com.santiago.clinicajm.repository;

import java.util.List;

import br.com.santiago.clinicajm.domain.Consulta;

public interface ConsultaRepository {

	public void salvaConsulta(Consulta consulta) ;

	public void atualizaConsulta(Consulta consulta);

	public Consulta recuperaConsulta(Integer id) ;

	 public List<Consulta> listarPorPaciente(Integer idPaciente);
}
