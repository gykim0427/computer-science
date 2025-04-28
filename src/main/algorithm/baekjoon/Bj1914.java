package main.algorithm.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

// hard
public class Bj1914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BigInteger cnt =  BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);
		
		System.out.println(cnt);
		
		if (n <= 20) {
			hanoi(n, 1, 2, 3);
		}
	}
	
	public static void hanoi(int n, int start, int mid, int end) {
        if (n == 1) {
            System.out.println(start + " " + end);
            return;
        }
        
        hanoi(n - 1, start, end, mid);
		
		System.out.println(start + " " + end);
		
		hanoi(n - 1, mid, start, end);
	}	
}
