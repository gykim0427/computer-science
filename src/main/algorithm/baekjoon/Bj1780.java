package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//hard
//tistory writing 1
public class Bj1780 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		recursion();
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void recursion() {
		return;
	}
}
