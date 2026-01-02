import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		//Programa para ler dois numeros inteiros e mostrar na tela a soma dos numeros.
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Entre com um Numero Inteiro(N1): ");
		n1 = sc.nextInt();
		
		System.out.println("Entre com um numero Inteiro(N2): ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		
		
		System.out.println("A soma dos numeros é: " + soma);
		
		sc.close();
		
	}

}
