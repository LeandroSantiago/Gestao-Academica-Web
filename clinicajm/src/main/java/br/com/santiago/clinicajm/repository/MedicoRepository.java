package br.com.santiago.clinicajm.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.santiago.clinicajm.domain.Medico;
import br.com.santiago.clinicajm.domain.enumeration.Especialidade;

public interface MedicoRepository {

	public void salvaMedico(Medico medico) ;

	public void excluiMedico(Integer id) ;

	 public List<Medico> listaMedicos();

	 public List<Medico> listaMedicosPorEspecialidade (Especialidade especialidade);

}
