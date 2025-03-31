package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2447 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		
		recursion(N);
		
		for (int i=0; i<n; i++) {
			System.out.println("\n");
			for (int j=n;j>0;j--) {
				System.out.println("*");
			}
		}
	}
	
	static void recursion(int n) {
		
	}
}
