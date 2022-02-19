import java.util.Scanner;

import utils.ValidadorSenhas;

public class senhaForte {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();
		
		System.out.println(ValidadorSenhas.isStrongPassword(senha));
		sc.close();
	}
}
