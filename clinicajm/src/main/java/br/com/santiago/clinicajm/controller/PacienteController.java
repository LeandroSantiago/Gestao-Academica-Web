package br.com.santiago.clinicajm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.javamagazine.clinicajm.util.MensagemUtil;
import br.com.javamagazine.clinicajm.util.MensagemUtil.TipoMensagem;
import br.com.santiago.clinicajm.domain.Paciente;
import br.com.santiago.clinicajm.repository.PacienteRepository;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private PacienteRepository pacienteRepository;

	@RequestMapping(value="/cadastrar.do", method=RequestMethod.POST)
	 public String cadastrar(Paciente paciente, Model model) {
	   pacienteRepository.salvaPaciente(paciente);
	   model.addAttribute("paciente", new Paciente());
	   model.addAttribute("mensagem", new MensagemUtil("Sucesso ao cadastrar o paciente", TipoMensagem.SUCESSO));
	  
	   return "cadastrarPaciente";
	   }

	@RequestMapping(value = "/listar.do", method = RequestMethod.GET)
	public String listar(Model model) {
		List<Paciente> pacientes = pacienteRepository.listaPacientes();
		model.addAttribute("pacientes", pacientes);

		return "listarPacientes";
	}

	@RequestMapping(value="/excluir.do", method=RequestMethod.GET)
	   public String excluir(Integer idPaciente, Model model) {
	     pacienteRepository.excluiPaciente(idPaciente);
	     model.addAttribute("mensagem", new MensagemUtil("Sucesso ao excluir o paciente", TipoMensagem.SUCESSO));
	    
	     return "forward:/paciente/listar.do";
	   }
}
