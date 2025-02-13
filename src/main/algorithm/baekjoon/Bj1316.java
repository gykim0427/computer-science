package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1316 {

	/**
	 * @param args
	 * @throws Exception
	 * @Needs review
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			int prev = 0;
			boolean[] blArr = new boolean[26];
			boolean bl = false;
			
			for (int j=0; j<str.length(); j++) {
				int now = str.charAt(j);
				
				if (prev != now) {
					if (!blArr[now - 'a']) {
						blArr[now - 'a'] = true;
						prev = now;
						bl = true;
					} else {
						bl = false;
						break;
					}
				}
			}
			
			if (bl) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
