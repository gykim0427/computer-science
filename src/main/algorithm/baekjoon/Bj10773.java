package main.algorithm.baekjoon;

import java.util.Scanner;

public class Bj10773 {

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int position = -1;		//연산할 배열의 최종위치
        int sum = 0;

        for (int i=0;i<n;i++) {
            int m = sc.nextInt();

            if (m == 0) {
                position--;
            } else {
                position++;
                a[position] = m;
            }
        }
        
        for (int j=0;j<=position;j++) {
            sum = sum + a[j];
        }

        System.out.println(sum);
	}
}
