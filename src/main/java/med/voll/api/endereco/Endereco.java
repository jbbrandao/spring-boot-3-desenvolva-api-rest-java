package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.paciente.DadosCadastroPaciente;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	public Endereco(DadosCadastroMedico dados) {

		this.logradouro = dados.endereco().logradouro();
		this.bairro = dados.endereco().bairro();
		this.cep = dados.endereco().cep();
		this.cidade = dados.endereco().cidade();
		this.uf = dados.endereco().uf();
		this.numero = dados.endereco().numero();
		this.complemento = dados.endereco().complemento();

	}

	public Endereco(DadosCadastroPaciente dados) {
		this.logradouro = dados.endereco().logradouro();
		this.bairro = dados.endereco().bairro();
		this.cep = dados.endereco().cep();
		this.cidade = dados.endereco().cidade();
		this.uf = dados.endereco().uf();
		this.numero = dados.endereco().numero();
		this.complemento = dados.endereco().complemento();
	}
	
	

	private String logradouro;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String numero;
	private String complemento;

	public void atualizarInformacoes(DadosEndereco endereco) {

		if (endereco.logradouro() != null) {
			this.logradouro = endereco.logradouro();
		}

		if (endereco.bairro() != null) {
			this.bairro = endereco.bairro();
		}

		if (endereco.cep() != null) {
			this.cep = endereco.cep();
		}

		if (endereco.cidade() != null) {
			this.cidade = endereco.cidade();
		}

		if (endereco.uf() != null) {
			this.uf = endereco.uf();
		}

		if (endereco.numero() != null) {
			this.numero = endereco.numero();
		}

		if (endereco.complemento() != null) {
			this.complemento = endereco.complemento();
		}

	}

}
