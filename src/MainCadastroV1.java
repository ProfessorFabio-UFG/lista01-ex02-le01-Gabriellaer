import java.util.Scanner;

public class MainCadastroV1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Moradores mora = new Moradores();
		String sexo;
		String bloco;
		String nome;
		String data;
		int cpf;
		int celular;
		int apartamento;
		int code;
		int sai;
		
		sai = 0;
		while(sai != -1) {
			System.out.println("Nome:");
			nome = input.next();
			System.out.println("Data de nascimento(usar 00/00/00):");
			data = input.next();
			System.out.println("Sexo:");
			sexo = input.next();
			System.out.println("Bloco: ");
			bloco = input.next();
			System.out.println("CPF:");
			cpf = input.nextInt();
			System.out.println("Celular:");
			celular = input.nextInt();
			System.out.println("N do Apartamento:");
			apartamento = input.nextInt();
			System.out.println("Codigo de acesso:");
			code = input.nextInt();
			
			mora.nome = nome;
			mora.sexo = sexo;
			mora.apartamento = apartamento;
			mora.bloco = bloco;
			mora.celular = celular;
			mora.cpf = cpf;
			mora.data = data;
			mora.code = code;
			
			System.out.println("Moradores: " + mora.toString());
			System.out.println("Deseja continuar NAO(-1) ou SIM(0): ");
			sai = input.nextInt();			
		}
	}
}
