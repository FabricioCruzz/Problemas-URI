package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio_1003 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x;
		int y;
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		int soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		scanner.close();
	}
}
