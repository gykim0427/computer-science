package main.baekjoon;

import java.util.Scanner;

public class Bj2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		
		if (n==1 || n==2) {
			answer = 1;
		} 
		
		
		System.out.println(answer);
	}
}
