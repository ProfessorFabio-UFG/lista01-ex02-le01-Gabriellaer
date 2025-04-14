import java.util.Scanner;
public class MainCadastroV2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Moradores mora[] = new Moradores[50];
		String sexo;
		String bloco;
		String nome;
		String data;
		int cpf;
		int celular;
		int apartamento;
		int code;
		int sai;
		int i = 0;
		int j = 0;
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
			
			mora[i] = new Moradores();
			mora[i].nome = nome;
			mora[i].sexo = sexo;
			mora[i].apartamento = apartamento;
			mora[i].bloco = bloco;
			mora[i].celular = celular;
			mora[i].cpf = cpf;
			mora[i].data = data;
			mora[i].code = code;
			i++;
			System.out.println("Deseja continuar NAO(-1) ou SIM(0): ");
			sai = input.nextInt();
		}
		for(j = 0; j < i ; j++) {
			System.out.println(mora[j].toString());
		}
	}
}
