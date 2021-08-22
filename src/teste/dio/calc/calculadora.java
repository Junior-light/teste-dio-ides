package teste.dio.calc;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a, b;
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		
		float soma = soma(a,b);
		float subtracao = subtracao(a,b);
		float multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println(a + " + " + b + " = " + soma);
		System.out.println(a + " - " + b + " = " + subtracao);
		System.out.println(a + " x " + b + " = " + multiplicacao);
		System.out.println(a + " / " + b + " = " + divisao);
	}

	public static float soma(float a, float b) {
		return a + b;
	}
	public static float subtracao(float a, float b) {
		return a - b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
	public static float multiplicacao(float a, float b) {
		return a * b;
	}
	
}
