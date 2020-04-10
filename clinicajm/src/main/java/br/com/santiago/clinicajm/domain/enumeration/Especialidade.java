package br.com.santiago.clinicajm.domain.enumeration;

public enum Especialidade {

	CARDIOLOGISTA("Cardiologista"), CLINICO_GERAL("Clínico Geral"), DERMATOLOGISTA("Dermatologista"),
	OTORRINOLARINGOLOGISTA("Otorrinolaringologista"), PEDIATRA("Pediatra"), PNEUMOLOGISTA("Pneumologista");

	private String descricao;

	private Especialidade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
