package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1065 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int n = Integer.parseInt(str);
		int cnt = 0;
		
		for (int i=0; i<str.length(); i++) {
			str.charAt(i);
		}
		
		for (int i=1; i<=n; i++) {
			if (i>0 && i<100) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
}
