package main.algorithm.baekjoon;

import java.util.Scanner;

public class Bj1914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n <= 20) {
			hanoi(n, 1, 2, 3);
		}
			
		System.out.println(n);
	}
	
	public static void hanoi(int n, int from, int tmp, int to) {
		hanoi(n-1, from, to, tmp);
	}

}
