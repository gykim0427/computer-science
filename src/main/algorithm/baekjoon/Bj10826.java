package main.algorithm.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Bj10826 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BigInteger[] bi = new BigInteger[n+2];
		
		bi[0] = new BigInteger("0");
		bi[1] = new BigInteger("1");
		
		for (int i=2; i<bi.length; i++) {
			bi[i] = bi[i-1].add(bi[i-2]);
		}
		
		System.out.println(bi[n]);
	}
	
}