package br.edu.univas.main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio_1002 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double pi = 3.14159;
		double r;
		double a;
		
		r = scanner.nextFloat();
		
		a = pi * (r * r);
		
		BigDecimal bd = new BigDecimal(a).setScale(4, RoundingMode.HALF_EVEN);
		
		System.out.println("A=" + bd.doubleValue());
		scanner.close();
	}
}
