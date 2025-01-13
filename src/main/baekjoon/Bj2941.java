package main.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2941 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String croStr = "c=,c-,dz=,d-,lj,nj,s=,z=";

		String[] croArr = croStr.split(",");
		
		int cnt = 0;
		
		// **
		for (int i=0; i<croArr.length;i++) {
			for (int j=0; j<str.length();j++) {
				if (str.contains(croArr[i])) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
