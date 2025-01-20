package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1018 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strArr = new String[2];
		
		strArr = str.split(" ");	
		
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);
		
		for (int i=0; i<n; i++) {
			br.readLine();
		}
	}

}
