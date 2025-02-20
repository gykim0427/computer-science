package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj6603 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if (n==0) {
				break;
			}
			
			int[] arr = new int[n];
			
			for (int i : arr) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			System.out.println();
		}
	}
	
}
