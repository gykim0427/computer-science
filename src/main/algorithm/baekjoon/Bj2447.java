package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// hard
public class Bj2447 {
	static int[][] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		recursion(0, 0, n, false);
		
		for (int i=0; i<n; i++) {
			
		}
	}
	
	static void recursion(int x, int y, int n, boolean check) {
		if (check) {
			for (int i=x; i<x+n; i++) {
				for (int j=y; j<y+n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
	}
}
