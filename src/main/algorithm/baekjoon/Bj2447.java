package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// hard
public class Bj2447 {
	static char[][] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		
		recursion(0, 0, n, false);
		
		for (int i=0; i<n; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
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
		
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		
		for (int i=x; i<x+n; i+=size) {
			for (int j=y; j<y+n; j+=size) {
				count++;
				
				if (count == 5) {
					recursion(i, j, size, true);
				} else {
					recursion(i, j, size, false);
				}
			}
		}
	}
	
}
