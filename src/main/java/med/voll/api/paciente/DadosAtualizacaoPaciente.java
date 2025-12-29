package med.voll.api.paciente;

import jakarta.validation.constraints.Email;

public record DadosAtualizacaoPaciente(
	Long id,
	
	String nome,
	
	@Email
	String email,
	
	String telefone,
	
	String cpf 

	
		) {
}
