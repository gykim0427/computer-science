package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bj11047 {

	public static void main(String[] args) throws Exception{
		BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			int unit = Integer.parseInt(br.readLine());
			
			if (unit <= k) {
				arrList.add(unit);
			}
		}
		
		Collections.sort(arrList);
		Collections.reverse(arrList);
		
		int sub = k;
		int cnt = 0;
		
		for (int i=0; i<arrList.size(); i++) {
			int a = sub / arrList.get(i);
			sub -= (a * arrList.get(i));
			cnt += a;
			
			if (sub == 0) {
				break;
			}
		}
		
		System.out.println(cnt);	
	}
}
