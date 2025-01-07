package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Bj1026 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		String strA = br.readLine();
		String strB = br.readLine();
		
		String[] strArrA = strA.split(" ");
		String[] strArrB = strB.split(" ");
		
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(strArrA[i]); 
			b[i] = Integer.parseInt(strArrB[i]);
		}
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		int s = 0;
		
		for (int i=0; i<n; i++) {
			s += a[i] * b[i];
		}
		
		System.out.println(s);
	}
}
