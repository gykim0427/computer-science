package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

public class Bj10814 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(arr[i][], " ");
			
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " +arr[i][1]);
		}
	}

}
