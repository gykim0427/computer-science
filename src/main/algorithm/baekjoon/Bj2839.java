package main.algorithm.baekjoon;

import java.util.Scanner;

public class Bj2839 {

	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println("sss : " + arg);
		}
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		
		if (n==3) {
            answer = 1;
        } if (n==4 || n==7) {
			answer = -1;
		} if (n%5==0) {
			answer = n/5;
		} if (n%5==1) {
            answer = n/5 + 1;
        } if (n!=7 && n%5==2) {
            answer = n/5 + 2;
        } if (n>5 && n%5==3) {
            answer = n/5 + 1;
        } if (n>5 && n%5==4) {
            answer = n/5 + 2;
        }
        
		System.out.println(answer);
	}
	
}
