
public class Moradores {
	String sexo;
	String bloco;
	String nome;
	String data;
	int cpf;
	int celular;
	int apartamento;
	int code;
	
	public String toString() {
		return "\nNome: " + nome + "\nCPF: " + cpf + "\nData de nascimente: " + data + "\nSexo: " + sexo + "\nCelular: "
				+ celular + "\nApartamento: " + apartamento + "\nBloco: " + bloco + "\nCodigo de acesso: " + code;
	}
}
