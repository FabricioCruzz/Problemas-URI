package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio_1004 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x;
		int y;
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		int prod = x * y;

		System.out.println("PROD = " + prod);
		
		scanner.close();
	}
}
