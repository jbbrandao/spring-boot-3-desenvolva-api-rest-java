package med.voll.api.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;


@Table(name="pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
    String nome;
    String email;
    String telefone;
    String cpf;
    Boolean ativo;
    
	@Embedded
	private Endereco endereco; 
	
	public Paciente(DadosCadastroPaciente dados) {
		ativo = true;
		this.nome = dados.nome();
		this.email = dados.email(); 
		this.telefone = dados.telefone(); 
		this.cpf = dados.cpf(); 
		this.endereco = new Endereco(dados); 
		
	}

	public void atualizarInformacoes(@Valid DadosAtualizacaoPaciente dados) {

		if(dados.nome() != null) {
			this.nome = dados.nome();
		}
		
		if(dados.email() != null) {
			this.email = dados.email();
		}
		
		if(dados.telefone() != null) {
			this.telefone = dados.telefone();
		}
		
		if(dados.cpf() != null) {
			this.cpf = dados.cpf(); 
		}

 
	}

	public void excluir() {
		this.ativo= false;		
	}
	
}
