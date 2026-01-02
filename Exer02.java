import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double PI = 3.14159;
		
		double raio, area;
		
		System.out.println("Entre com o Raio do Circulo: ");
		raio =  sc.nextDouble();
		
		area = PI * (Math.pow(raio, 2));
		
		System.out.printf("A area da Circunferência é: %.4f " , area);

	}

}
