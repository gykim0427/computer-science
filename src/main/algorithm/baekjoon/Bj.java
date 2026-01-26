package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj {
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		dfs(n, m, 0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int N, int M, int depth) {
		if (M != depth) {
			for (int i : arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			
			return;
		}
		
		dfs(N, M, depth + 1);
	}
}