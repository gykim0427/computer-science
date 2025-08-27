package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1065 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int n = Integer.parseInt(str);
		int cnt = 0;
		int firstInterval = 0;
		int secondInterval = 0;
		
		for (int i=1; i<=n; i++) {
			if (i > 0 && i < 100) {
				cnt++;
			} if (i > 99) {
				int third = i/100;
				int second = (i - third*100)/10;
				int first = i - third*100 - second*10;
				
				firstInterval = third - second;
				secondInterval = second - first;
				
				if (firstInterval == secondInterval) {
					 cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
