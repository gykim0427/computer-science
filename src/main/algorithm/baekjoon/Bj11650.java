package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bj11650 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[0])
				.thenComparingInt(a -> a[1]));
		
		for (int i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}	
}
