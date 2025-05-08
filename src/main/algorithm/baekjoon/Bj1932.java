package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1932 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = new int[i+1];
			
			for (int j=0; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i=n-1; i>0; i--) {
		    for (int j=0; j<i; j++) {
		        arr[i-1][j] += Math.max(arr[i][j], arr[i][j+1]);
		    }
		}
		
		System.out.println(arr[0][0]);
	}
}
