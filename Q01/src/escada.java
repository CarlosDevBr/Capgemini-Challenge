import java.util.Scanner;

public class escada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da sua escada: ");
		int tam = sc.nextInt();
		
		for(int i=0; i <= tam; i++) {
			for(int j=tam; j > 0; j--) {
				if(j > i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
