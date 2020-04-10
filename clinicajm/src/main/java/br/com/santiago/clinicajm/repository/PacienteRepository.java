package br.com.santiago.clinicajm.repository;

import java.util.List;

import br.com.santiago.clinicajm.domain.Paciente;

public interface PacienteRepository {

	public void salvaPaciente(Paciente paciente);

	public void excluiPaciente(Integer id) ;

	 public List<Paciente> listaPacientes() ;
}
