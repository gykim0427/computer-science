package main.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2941 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String croStr = "c=,c-,dz=,d-,lj,nj,s=,z=";
		String[] croArr = croStr.split(",");
		
		for (String s : croArr) {
			if (str.contains(s)) {
				str = str.replace(s, "*");
			}
		}
		
		System.out.println(str.length());
	}
}
