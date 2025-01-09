package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1316 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int prev = 0;
		
		String str = br.readLine();
		
		boolean[] bl = new boolean[26];
		
		for (int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if (prev != now) {
				if (!bl[now - 'a']) {
					
				}
			}
		}
		
		for (int i=0; i<n; i++) {
			if (str.) {
				
			}
		}
	}

}
