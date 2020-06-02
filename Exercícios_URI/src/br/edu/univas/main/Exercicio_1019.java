package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio_1019 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n;
		
		int h = 0;
		int m = 0;
		int s = 0;
		
		n = scanner.nextInt();
		
		int resto = n % 60;
		
		if (n < 60) {
			s += n;}
		else if (n > 60 && n < 3600) {
			m += n / 60;
			s += resto;}
		else if (n >= 3600) {
			h += n / 60;
			m += resto / 60;
			s += m / 60;}
		
		
		
		System.out.println(h + ":" + m + ":" + s);
		
		scanner.close();
	}
}