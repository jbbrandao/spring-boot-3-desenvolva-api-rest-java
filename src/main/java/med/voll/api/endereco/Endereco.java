package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DadosCadastroMedico;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    public Endereco(DadosCadastroMedico dados) {

    	this.logradouro = dados.endereco().logradouro();
    	this.bairro= dados.endereco().bairro();
    	this.cep= dados.endereco().cep();
    	this.cidade= dados.endereco().cidade();
    	this.uf= dados.endereco().uf();
    	this.numero= dados.endereco().numero();
    	this.complemento= dados.endereco().complemento();
    
    
    }
	private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

}
