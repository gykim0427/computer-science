package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15649 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] nArr = new int[Integer.parseInt(st.nextToken())];
		
		for (int i : nArr) {
			System.out.println(nArr[i]);
		}
	}

}
